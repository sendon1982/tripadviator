package com.tripadviator.serivce.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tripadviator.serivce.product.request.ProductDetailRequest;
import com.tripadviator.serivce.product.request.ProductRequest;
import com.tripadviator.serivce.product.response.ProductDetailResponse;
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
	 * Use HTTP GET method to fetch URL resources, fetching ProductDetail by its code
	 * 
	 * @param url
	 * @param request
	 * @return
	 */
	public ProductDetailResponse getProductByCode(String url, ProductDetailRequest request)
	{
		Map<String, String> requestMap = new LinkedHashMap<String, String>();
		requestMap.put("code", request.getCode());
		requestMap.put("currencyCode", request.getCurrencyCode());
		
		String apiKeyURL = createURLWithApiKey(url);
		
		ResponseEntity<ProductDetailResponse> response = restTemplate.getForEntity(appendURLWithMap(apiKeyURL, requestMap), ProductDetailResponse.class);
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
	
	/**
	 * Append ApiKey as a query string for the requested URL
	 * 
	 * @param url
	 * @return
	 */
	private String appendURLWithMap(String url, Map<String, String> requestMap)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(url);
		
		if(url.indexOf("?") < 0)
		{
			sb.append("?");
			
			for (String key : requestMap.keySet()) 
			{
				sb.append(key);
				sb.append("=");
				sb.append(requestMap.get(key));
				
				sb.append("&");
			}
		}
		else
		{
			sb.append("&");
			
			for (String key : requestMap.keySet()) 
			{
				sb.append(key);
				sb.append("=");
				sb.append(requestMap.get(key));
				
				sb.append("&");
			}
		}
		
		return sb.toString();
	}
}
