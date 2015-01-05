package com.tripadviator;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tripadviator.dao.mongo.product.ProductRepository;
import com.tripadviator.dao.mongo.product.ProductRepositoryImpl;
import com.tripadviator.domain.Product;
import com.tripadviator.domain.ProductDetail;
import com.tripadviator.domain.user.UserReview;
import com.tripadviator.serivce.product.ProductImportService;
import com.tripadviator.serivce.product.request.ProductDetailRequest;
import com.tripadviator.serivce.product.request.ProductRequest;
import com.tripadviator.serivce.user.request.UserReviewRequest;

@EnableAutoConfiguration
@ImportResource(value = "classpath:tripadviator-service.xml")
@SuppressWarnings("all")
public class MainApp implements CommandLineRunner 
{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductImportService productImportService;

	public static void main(String[] args)
	{
		SpringApplication.run(MainApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		//importProduct();
		//searchProductByCode();
//		importProductDetail();
		importProductReview();
	}
	
	private void searchProductByCode()
	{
		System.out.println("Search product started ...");
		
		String url = "http://viatorapi.viator.com/service/product";
		ProductDetailRequest request = new ProductDetailRequest();
		request.setCode("2280AAHT");
		request.setCurrencyCode("EUR");
		
		ProductDetail productDetail = productImportService.getProductDetailByCode(url, request);
		
		System.out.println(productDetail.getBookingEngineId());
		
		List<String> lest = productRepository.getAllProductCode();
		System.out.println(lest.size());
	}
	
	private void importProductDetail()
	{
		System.out.println("Import product detail started ...");
		
		String url = "http://viatorapi.viator.com/service/product";
		ProductDetailRequest request = new ProductDetailRequest();
		
		List<String> allProductCode = productRepository.getAllProductCode();
		for (String code : allProductCode) 
		{
			request.setCode(code);
			request.setCurrencyCode("EUR");
			
			ProductDetail productDetail = null;
			try
			{
				productDetail = productImportService.getProductDetailByCode(url, request);
			}
			catch(Exception e)
			{
				System.out.println("Failed for product : " + code);
				System.err.println(e);
				
				productDetail = new ProductDetail();
			}
			
			productRepository.save(productDetail);
		}

		System.out.println("Import product detail finished !");
	}

	private void importProduct()
	{
		System.out.println("Import data started ...");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:tripadviator-service.xml");
		ProductRepositoryImpl productRepositoryImpl = ctx.getBean(ProductRepositoryImpl.class);
		
		String url = "http://viatorapi.viator.com/service/search/products";
		
		ProductRequest request = new ProductRequest();
		
		// Loop from 1-9 for different continent as destId
		for (int i = 1; i <= 9; i++) 
		{
			System.out.println(String.format("Loading for destId[%s]", i));
			
			request.setCurrencyCode("USD");
			request.setDestId(i);
			request.setTopX("1-50000");
			request.setCatId(0);
			request.setSubCatId(0);
			request.setDealsOnly(false);
			
			List<Product> productList = productImportService.getProductList(url , request);
			
			if(productList == null)
			{
				productList = Collections.emptyList();
			}
			
			for (Product product : productList) 
			{
				productRepositoryImpl.save(product);
			}
			
			System.out.println(String.format("Loading for destId[%s] with total records [%s]", i, productList.size()));
			
		}

		System.out.println("import data completed");
		
	}
	
	private void importProductReview()
	{
		System.out.println("Import product review data started ...");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:tripadviator-service.xml");
		ProductRepositoryImpl productRepositoryImpl = ctx.getBean(ProductRepositoryImpl.class);
		
		String url = "http://viatorapi.viator.com/service/product/reviews";
		

		List<String> allProductCode = productRepository.getAllProductCode();
		for (String code : allProductCode) 
		{
			UserReviewRequest request = new UserReviewRequest();
			request.setCode(code);
			request.setTopX("1-50000");
			request.setSortOrder("REVIEW_RATING_D");
			
			List<UserReview> reviews = null;
			
			try
			{
				reviews = productImportService.getProductUserReviewList(url, request);
			}
			catch(Exception e)
			{
				System.out.println("Failed for product : " + code);
				System.out.println(e);
				
				// Try again
				try
				{
					Thread.currentThread().sleep(2000);
					reviews = productImportService.getProductUserReviewList(url, request);
				}
				catch(Exception ex)
				{
					System.out.println("Failed for product : " + code);
					System.out.println(ex);
					reviews = Collections.emptyList();
				}
				
			}
			
			for (UserReview userReview : reviews) 
			{
				productRepositoryImpl.save(userReview);
			}
		}

		System.out.println("import product review completed");
		
	}
}
