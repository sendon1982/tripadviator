package com.tripadviator.dao.mongo.product;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.tripadviator.dao.base.BaseRepositoryTestCase;
import com.tripadviator.domain.ProductDetail;
import com.tripadviator.domain.user.UserReview;

public class ProductRepositoryImplTest extends BaseRepositoryTestCase
{	
	@Test
	public void testSearchProducts() 
	{
		String startDate = "2014-01-01";
		String endDate = "2016-01-01";
		String topX = "1-15";
		Integer destId = 648;
		String currencyCode = "USD"; 
		Integer catId = 0;
		Integer subCatId = 0;
		boolean dealsOnly = false;
		
		List<ProductDetail> list = productRepository.getProductListByProductRequest(startDate, endDate, topX, destId, currencyCode, catId, subCatId, dealsOnly);
		
		Assert.assertEquals(13, list.size());
	}
	
	@Test
	public void testGetReviewListByProductCode()
	{
		String productCode = "3378HIGH";

		List<UserReview> list = productRepository.getReviewListByProductCode(productCode);
		
		Assert.assertNotNull(list);
		
		Assert.assertEquals(productCode, list.get(0).getProductCode());
	}
	
	@Test
	public void testGetReviewListByUserId()
	{
		Long userId = 5642953L;
		
		List<UserReview> list = productRepository.getReviewListByUserId(userId);
		
		Assert.assertNotNull(list);
		
		Assert.assertEquals(userId, list.get(0).getOwnerId());
	}

}
