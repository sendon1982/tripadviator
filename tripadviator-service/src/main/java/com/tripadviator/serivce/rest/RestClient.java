package com.tripadviator.serivce.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tripadviator.serivce.product.request.ProductRequest;
import com.tripadviator.serivce.product.response.ProductResponse;

@Service("restClient")
public class RestClient 
{
	private static final String API_KEY = "apiKey=795694069217287";
	
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * Use HTTP POST method to fetch URL resources
	 * 
	 * @param url
	 * @param request
	 * @return
	 */
	public ProductResponse getListByPost(String url, ProductRequest request)
	{
		ResponseEntity<ProductResponse> response = restTemplate.postForEntity(createURLWithApiKey(url), request, ProductResponse.class);
		return response.getBody();
	}
	
	/**
	 * Append ApiKey as a query string for the requested URL
	 * 
	 * @param url
	 * @return
	 */
	private String createURLWithApiKey(String url)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(url);
		
		if(url.indexOf("?") < 0)
		{
			sb.append("?");
			sb.append(API_KEY);
		}
		else
		{
			sb.append("&");
			sb.append(API_KEY);
		}
		
		return sb.toString();
	}
}
