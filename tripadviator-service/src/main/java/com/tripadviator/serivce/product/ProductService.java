package com.tripadviator.serivce.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripadviator.dao.mongo.product.ProductRepository;
import com.tripadviator.domain.Product;
import com.tripadviator.domain.ProductDetail;
import com.tripadviator.serivce.product.request.ProductRequest;

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
	private ProductRepository productRepository;
	
	/**
	 * Get product detail information by productCode
	 * 
	 * @param code
	 * 
	 * @return
	 */
	public ProductDetail getProductDetailByCode(String code)
	{
		return productRepository.getProductByCode(code);
	}
	
	/**
	 * Get product summary list based on product code array.
	 * 
	 * @param codes
	 * @return
	 */
	public List<Product> getProductListByCodes(String[] codes)
	{
		return productRepository.getProductListByCodes(codes);
	}

	public List<Product> getProductListByProductRequest(ProductRequest productRequest) 
	{
		
		return null;
	}
}
