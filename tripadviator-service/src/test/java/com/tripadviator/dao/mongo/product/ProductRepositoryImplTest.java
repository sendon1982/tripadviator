package com.tripadviator.dao.mongo.product;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tripadviator.domain.Product;

public class ProductRepositoryImplTest 
{

	@Test
	public void testInsert() 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:tripadviator-service.xml");
		ProductRepositoryImpl productRepositoryImpl = ctx.getBean(ProductRepositoryImpl.class);
		
		Product product = new Product();
		product.setCode("ABC");
		
		productRepositoryImpl.save(product);
	}

}
