package com.tripadviator.serivce.rest;

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

@Service("restClient")
public class RestClient 
{
	private static final String API_KEY = "apiKey=795694069217287";
	
	private static final Log log = LogFactory.getLog(RestClient.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
    /**
     * HTTP Get generic method
     * 
     * @param url
     * @param clazz
     * @return
     */
    public <T> T getRequest(String url, Class<T> clazz)
    {
   		log.debug(String.format("Request for URL [%s]", url));
    	
		ResponseEntity<T> response = restTemplate.getForEntity(url, clazz);
		return response.getBody();
    }
    
    /**
     * HTTP Get generic method
     * 
     * @param url
     * @param clazz
     * @return
     */
    public <T> T getRequest(String url, Map<String, String> requestMap, Class<T> clazz)
    {
    	String apiKeyURL = createURLWithApiKey(url);
    	String finalURL = appendURLWithMap(apiKeyURL, requestMap);
    	
   		log.debug(String.format("Request for URL [%s]", finalURL));
    	
		ResponseEntity<T> response = restTemplate.getForEntity(finalURL, clazz);
		return response.getBody();
    }
	
	
    /**
     * HTTP Post generic method
     * 
     * @param url
     * @param request
     * @param clazz
     * @return
     */
    public <T> T postRequest(String url, AbstractRequest request, Class<T> clazz)
    {
    	log.debug(String.format("Request for URL [%s]", url));
    	log.debug(String.format("Request JSON object: \n%s", convertRequestToJson(request)));
    	
		ResponseEntity<T> response = restTemplate.postForEntity(createURLWithApiKey(url), request, clazz);
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
