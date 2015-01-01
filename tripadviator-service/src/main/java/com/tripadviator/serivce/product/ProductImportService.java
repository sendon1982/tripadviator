package com.tripadviator.serivce.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripadviator.domain.Product;
import com.tripadviator.serivce.product.request.ProductRequest;
import com.tripadviator.serivce.product.response.ProductResponse;
import com.tripadviator.serivce.rest.RestClient;

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
}
