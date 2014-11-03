package com.tripadviator.serivce.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tripadviator.serivce.base.AbstractResponse;
import com.tripadviator.serivce.product.request.ProductRequest;

@Service("restClient")
public class RestClient 
{
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * Use HTTP POST method to fetch URL resources
	 * 
	 * @param url
	 * @param request
	 * @return
	 */
	public AbstractResponse getListByPost(String url, ProductRequest request)
	{
		ResponseEntity<AbstractResponse> response = restTemplate.postForEntity(url, request, AbstractResponse.class, buildApiKey());
		return response.getBody();
	}
	
	/**
	 * Use HTTP GET method to fetch URL resources
	 * 
	 * @param url
	 * @param request
	 * @return
	 */
	public AbstractResponse getObjectByGet(String url, ProductRequest request)
	{
		ResponseEntity<AbstractResponse> response = restTemplate.getForEntity(url, AbstractResponse.class, request);
		return response.getBody();
	}
	
	private Map<String, String> buildApiKey()
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("apiKey", "795694069217287");
		
		return map;
	}
}
