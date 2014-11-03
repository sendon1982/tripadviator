package com.tripadviator;

import java.net.UnknownHostException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.tripadviator.domain.Product;
import com.tripadviator.serivce.product.request.ProductRequest;
import com.tripadviator.serivce.product.response.ProductResponse;

/**
 * Hello world!
 * 
 */
public class App2
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws UnknownHostException
	{
		String url = "http://viatorapi.viator.com/service/search/products?apiKey=795694069217287";
		
		ProductRequest request = new ProductRequest();
		
		request.setStartDate("2012-12-25");
		request.setEndDate("2015-12-25");
		request.setCurrencyCode("USD");
		request.setDestId(684);
		request.setTopX("1-10");
		request.setCatId(0);
		request.setSubCatId(0);
		request.setDealsOnly(false);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ProductResponse> entity = restTemplate.postForEntity(url, request, ProductResponse.class);
		List<Product> productList = entity.getBody().getData();
		for (Product product : productList) 
		{
			System.out.println(product.getCode());
		}
	}
}
