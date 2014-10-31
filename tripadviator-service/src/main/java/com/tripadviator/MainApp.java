package com.tripadviator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

import com.tripadviator.dao.mongo.product.ProductRepository;
import com.tripadviator.serivce.product.ProductImportService;
import com.tripadviator.serivce.product.request.ProductRequest;
import com.tripadviator.serivce.product.response.Product;

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
		String url = "http://viatorapi.viator.com/service/search/products";
		
		ProductRequest request = new ProductRequest();
		
		request.setStartDate("2012-12-25");
		request.setEndDate("2015-12-25");
		request.setCurrencyCode("USD");
		request.setDestId(684);
		request.setTopX("1-10");
		request.setCatId(0);
		request.setSubCatId(0);
		request.setDealsOnly(false);
		
		List<Product> productList = productImportService.getProductList(url , request);
		System.out.println(productList);
	}

}
