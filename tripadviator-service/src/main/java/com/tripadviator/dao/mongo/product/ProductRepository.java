package com.tripadviator.dao.mongo.product;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tripadviator.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String>
{
	/**
	 * Get product by its code
	 *  
	 * @param code
	 * @return
	 */
//	public ProductResponse getProductByCode(String code);
}
