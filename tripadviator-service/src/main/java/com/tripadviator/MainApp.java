package com.tripadviator;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
import com.tripadviator.serivce.product.ProductImportService;
import com.tripadviator.serivce.product.request.ProductRequest;

@EnableAutoConfiguration
@ImportResource(value = "classpath:tripadviator-service.xml")
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
		importProduct();
	}

	private void importProduct()
	{
		System.out.println("import data started ...");
		
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
}
