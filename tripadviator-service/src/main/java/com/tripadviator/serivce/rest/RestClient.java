package com.tripadviator.serivce.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.tripadviator.serivce.base.AbstractRequest;
import com.tripadviator.serivce.product.request.ProductDetailRequest;
import com.tripadviator.serivce.product.request.ProductRequest;
import com.tripadviator.serivce.product.response.ProductDetailResponse;
import com.tripadviator.serivce.product.response.ProductResponse;

@Service("restClient")
public class RestClient 
{
	private static final String API_KEY = "apiKey=795694069217287";
	
	private static final Log log = LogFactory.getLog(RestClient.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
    public <T> T getRequest(String url, Class<T> clazz)
    {
   		log.debug(String.format("Request for URL [%s]", url));
   		log.debug(String.format("Request JSON object: \n%s", url));
    	
		ResponseEntity<T> response = restTemplate.getForEntity(url, clazz);
		return response.getBody();
    }
	
	
    public <T> T postRequest(String url, AbstractRequest request, Class<T> clazz)
    {
    	log.debug(String.format("Request for URL [%s]", url));
    	log.debug(String.format("Request JSON object: \n%s", convertRequestToJson(request)));
    	
		ResponseEntity<T> response = restTemplate.postForEntity(createURLWithApiKey(url), request, clazz);
		return response.getBody();
    }
    
	
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
	
	/**
	 * Convert incoming request into JSON format string
	 * 
	 * @param request
	 * @return
	 */
	private String convertRequestToJson(AbstractRequest request)
	{
		BaseObjectMapper mapper = new BaseObjectMapper();
        ObjectWriter writer = mapper.writer().withDefaultPrettyPrinter();
        
        String json = null;
        
        try
		{
			json = writer.writeValueAsString(request);
		} 
        catch (JsonProcessingException e)
		{
			log.error(e);
		}
        
        return json;
	}
}
