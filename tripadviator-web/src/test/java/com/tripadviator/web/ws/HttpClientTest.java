package com.tripadviator.web.ws;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.tripadviator.serivce.rest.BaseObjectMapper;

public class HttpClientTest {
	public static void main(String[] args) throws Exception {
		
		HttpClientTest test = new HttpClientTest();
		
		String getURL = "http://www.thomas-bayer.com/sqlrest/INVOICE";
		
		String postURL = "http://jsonplaceholder.typicode.com/posts";
		
		String getResult = test.get(getURL);
		System.out.println(getResult);
		
		String postResult = test.post(postURL);
		System.out.println(postResult);
	}

	public String get(String url) throws Exception {

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);

		// add request header
		request.addHeader("User-Agent", "XXX");
		HttpResponse response = client.execute(request);

		System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		return result.toString();
	}

	public String post(String url) throws Exception {
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(url);

		// add header
		post.setHeader("User-Agent", "XXX");

		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		NameValuePair nameValuePair = new BasicNameValuePair("userId", "99");
		NameValuePair nameValuePair2 = new BasicNameValuePair("title", "zzz");
		NameValuePair nameValuePair3 = new BasicNameValuePair("body", "xxx");
		urlParameters.add(nameValuePair);
		urlParameters.add(nameValuePair2);
		urlParameters.add(nameValuePair3);


		HttpEntity entity = new UrlEncodedFormEntity(urlParameters);
		post.setEntity(entity);

		HttpResponse response = client.execute(post);
		System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		return result.toString();
	}
	
	private String convertRequestToJson(Request request)
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
			e.printStackTrace();
		}
        
        return json;
	}
}
