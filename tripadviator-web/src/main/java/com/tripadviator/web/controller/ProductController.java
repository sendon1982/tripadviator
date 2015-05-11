package com.tripadviator.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tripadviator.domain.Product;
import com.tripadviator.domain.ProductDetail;
import com.tripadviator.serivce.product.ProductService;
import com.tripadviator.serivce.product.request.ProductRequest;

@Controller
public class ProductController extends BaseController
{
	@Autowired
	private ProductService productService;
	
	@ResponseBody
	@RequestMapping(value = "/products/{code}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductDetail getProductByCode(@PathVariable("code") String code)
	{
		return productService.getProductDetailByCode(code);
	}
	
	/**
	 *  Try to use GET method but it seems there are too many parameters.
	 *  Need to find an elegant way to handle this situation.
	 *  
	 *  //TODO Refactory
	 *  
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/products/search", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductDetail> getProductList(@RequestBody ProductRequest productRequest)
	{
		List<ProductDetail> productListByProductRequest = productService.getProductListByProductRequest(productRequest);
		return productListByProductRequest;
	}
	
	/**
	 * Get a list of reviews for a certain product based on the productCode
	 * 
	 * @param productRequest
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/products/{code}/reviews", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductDetail> getProductReviews(@RequestBody ProductRequest productRequest)
	{
		List<ProductDetail> productListByProductRequest = productService.getProductListByProductRequest(productRequest);
		return productListByProductRequest;
	}
}
