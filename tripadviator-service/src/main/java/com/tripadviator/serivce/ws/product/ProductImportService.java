package com.tripadviator.serivce.ws.product;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripadviator.domain.Product;
import com.tripadviator.domain.ProductDetail;
import com.tripadviator.domain.user.UserPhoto;
import com.tripadviator.domain.user.UserReview;
import com.tripadviator.domain.user.UserVideo;
import com.tripadviator.serivce.product.request.ProductDetailRequest;
import com.tripadviator.serivce.product.request.ProductRequest;
import com.tripadviator.serivce.product.response.ProductDetailResponse;
import com.tripadviator.serivce.product.response.ProductResponse;
import com.tripadviator.serivce.rest.RestClient;
import com.tripadviator.serivce.user.request.UserPhotoRequest;
import com.tripadviator.serivce.user.request.UserReviewRequest;
import com.tripadviator.serivce.user.response.UserPhotoResponse;
import com.tripadviator.serivce.user.response.UserReviewResponse;
import com.tripadviator.serivce.user.response.UserVideoResponse;

/**
 * Import product information from Viator API service:
 * 
 * URL: http://viatorapi.viator.com/service/search/products?apiKey=795694069217287
 * 
 * @author Ming
 *
 */
@Service("productImportService")
public class ProductImportService 
{
	@Autowired
	private RestClient restClient;
	
	/**
	 * Fetch product summary list based on destId, startDate, endDate and other parameters
	 * 
	 * @param url
	 * @param request
	 * @return
	 */
	public List<Product> getProductList(String url, ProductRequest request)
	{
		ProductResponse response = restClient.postRequest(url, request, ProductResponse.class);
		return response.getData();
	}
	
	/**
	 * Use HTTP GET method to fetch URL resources, fetching ProductDetail by its code
	 * 
	 * @param url
	 * @param request
	 * @return
	 */
	public ProductDetail getProductDetailByCode(String url, ProductDetailRequest request)
	{
		Map<String, String> requestMap = new LinkedHashMap<String, String>();
		requestMap.put("code", request.getCode());
		requestMap.put("currencyCode", request.getCurrencyCode());
		
		ProductDetailResponse response = restClient.getRequest(url, requestMap, ProductDetailResponse.class);
		
		return response.getData();
	}
	
	/**
	 * Get user review for the product by product code
	 * 
	 * @param url
	 * @param request
	 * @return
	 */
	public List<UserReview> getProductUserReviewList(String url, UserReviewRequest request)
	{
		Map<String, String> requestMap = new LinkedHashMap<String, String>();
		requestMap.put("code", request.getCode());
		requestMap.put("topX", request.getTopX());
		requestMap.put("sortOrder", request.getSortOrder());
		
		UserReviewResponse response = restClient.getRequest(url, requestMap, UserReviewResponse.class);
		return response.getData();
	}
	
	/**
	 * Get user photo for the product by product code
	 * 
	 * @param url
	 * @param request
	 * @return
	 */
	public List<UserPhoto> getProductUserPhotoList(String url, UserPhotoRequest request)
	{
		Map<String, String> requestMap = new LinkedHashMap<String, String>();
		requestMap.put("code", request.getCode());
		requestMap.put("topX", request.getTopX());
		
		UserPhotoResponse response = restClient.getRequest(url, requestMap, UserPhotoResponse.class);
		return response.getData();
	}
	
	/**
	 * Get user photo for the product by product code
	 * 
	 * @param url
	 * @param request
	 * @return
	 */
	public List<UserVideo> getProductUseVideoList(String url, UserPhotoRequest request)
	{
		Map<String, String> requestMap = new LinkedHashMap<String, String>();
		requestMap.put("code", request.getCode());
		requestMap.put("topX", request.getTopX());
		
		UserVideoResponse response = restClient.getRequest(url, requestMap, UserVideoResponse.class);
		return response.getData();
	}
}
