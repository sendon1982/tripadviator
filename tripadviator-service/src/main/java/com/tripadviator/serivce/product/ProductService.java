package com.tripadviator.serivce.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripadviator.domain.ProductDetail;
import com.tripadviator.serivce.product.request.ProductDetailRequest;
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
	
	public ProductDetail getProductDetailByCode(String url, ProductDetailRequest request)
	{
		return restClient.getProductByCode(url, request).getData();
	}
}
