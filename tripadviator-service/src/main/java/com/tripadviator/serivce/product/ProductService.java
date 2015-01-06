package com.tripadviator.serivce.product;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripadviator.domain.ProductDetail;
import com.tripadviator.serivce.product.request.ProductDetailRequest;
import com.tripadviator.serivce.product.response.ProductDetailResponse;
import com.tripadviator.serivce.rest.RestClient;

/**
 * Import product information from Viator API service:
 * 
 * URL: http://viatorapi.viator.com/service/search/products?apiKey=795694069217287
 * 
 * @author Ming
 *
 */
@Service("productService")
public class ProductService 
{
	@Autowired
	private RestClient restClient;
	
	/**
	 * Get product detail information by productCode
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
}
