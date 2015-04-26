package com.tripadviator.dao.mongo.product;

import java.util.List;

import com.tripadviator.domain.AbstractEntity;
import com.tripadviator.domain.Product;
import com.tripadviator.domain.ProductDetail;

public interface ProductRepository
{
	public <S extends AbstractEntity> S save(S s);
	
	/**
	 * Get product by its code
	 *  
	 * @param code
	 * @return
	 */
	public ProductDetail getProductByCode(String code);
	
	/**
	 * Get product by its code
	 *  
	 * @param code
	 * @return
	 */
	public List<Product> getProductListByCodes(String[] codes);
	
	
	/**
	 * Search products by various condition, it is like Things To Do page.
	 * 
	 * @param productDetail
	 * @return
	 */
	public List<Product> getProductListByProductRequest(Integer destId, String topX);
	
	
	/**
	 * Get all of the product code from DB
	 * 
	 * @return
	 */
	public List<String> getAllProductCode();
}
