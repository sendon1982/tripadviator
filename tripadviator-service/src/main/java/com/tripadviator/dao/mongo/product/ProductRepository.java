package com.tripadviator.dao.mongo.product;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tripadviator.serivce.product.response.ProductResponse;

public interface ProductRepository extends MongoRepository<ProductResponse, String>
{
	/**
	 * Get product by its code
	 *  
	 * @param code
	 * @return
	 */
	public ProductResponse getProductByCode(String code);
}
