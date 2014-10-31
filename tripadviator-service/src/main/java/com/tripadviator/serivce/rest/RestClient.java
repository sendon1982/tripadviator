package com.tripadviator.serivce.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tripadviator.serivce.product.request.ProductRequest;
import com.tripadviator.serivce.product.response.Product;

@Service("restClient")
public class RestClient 
{
	@Autowired
	private RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	public List<Product> getProductList(String url, ProductRequest request)
	{
		return (List<Product>) restTemplate.postForEntity(url, request, List.class, buildApiKey());
	}
	
	public <T> T getForObject(String url)
	{
		return null;
	}
	
	private Map<String, String> buildApiKey()
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("apiKey", "795694069217287");
		
		return map;
	}
}
