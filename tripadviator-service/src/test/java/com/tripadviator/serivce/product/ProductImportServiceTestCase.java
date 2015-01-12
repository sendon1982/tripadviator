package com.tripadviator.serivce.product;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tripadviator.domain.ProductDetail;
import com.tripadviator.domain.user.UserReview;
import com.tripadviator.serivce.product.request.ProductDetailRequest;
import com.tripadviator.serivce.user.request.UserReviewRequest;
import com.tripadviator.serivce.ws.product.ProductImportService;
import com.tripadviator.service.base.BaseTestCase;

public class ProductImportServiceTestCase extends BaseTestCase
{
	@Autowired
	private ProductImportService productImportService;
	
	@Test
	public void testGetProductDetailByCode()
	{
		String url = "http://viatorapi.viator.com/service/product";
		String code = "2280SUN";
		String currency = "EUR";
		
		ProductDetailRequest request = new ProductDetailRequest();
		
		request.setCode(code);
		request.setCurrencyCode(currency);
		
		ProductDetail productDetail = productImportService.getProductDetailByCode(url, request);
		assertNotNull(productDetail);
		assertEquals(code, productDetail.getCode());		
	}
	
	
	@Test
	public void testGetProductUserReviewList()
	{
		String url = "http://viatorapi.viator.com/service/product/reviews";
		String code = "2280SUN";
		
		UserReviewRequest request = new UserReviewRequest();
		request.setCode(code);
		request.setTopX("1-5");
		request.setSortOrder("REVIEW_RATING_D");
		
		List<UserReview> productUserReviewList = productImportService.getProductUserReviewList(url, request);
		
		assertEquals(5, productUserReviewList.size());
		assertEquals(code, productUserReviewList.get(0).getProductCode());	
	}
}
