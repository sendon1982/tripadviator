package com.tripadviator.dao.mongo.product;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tripadviator.serivce.product.response.Product;

public interface ProductRepository extends MongoRepository<Product, String>
{
	/**
	 * Get product by its code
	 *  
	 * @param code
	 * @return
	 */
	public Product getProductByCode(String code);
}
