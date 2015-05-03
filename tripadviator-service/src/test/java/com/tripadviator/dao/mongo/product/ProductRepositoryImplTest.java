package com.tripadviator.dao.mongo.product;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tripadviator.domain.ProductDetail;

public class ProductRepositoryImplTest 
{	
	@Test
	public void testSearchProducts() 
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:tripadviator-service.xml");
		ProductRepository productRepositoryImpl = ctx.getBean(ProductRepositoryImpl.class);
		
		String startDate = "2014-01-01";
		String endDate = "2016-01-01";
		String topX = "1-15";
		Integer destId = 648;
		String currencyCode = "USD"; 
		Integer catId = 0;
		Integer subCatId = 0;
		boolean dealsOnly = false;
		
		List<ProductDetail> list = productRepositoryImpl.getProductListByProductRequest(startDate, endDate, topX, destId, currencyCode, catId, subCatId, dealsOnly);
		
		Assert.assertEquals(13, list.size());
		
		ctx.close();
	}

}
