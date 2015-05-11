package com.tripadviator.dao.mongo.product;

import java.util.List;

import com.tripadviator.domain.AbstractEntity;
import com.tripadviator.domain.Product;
import com.tripadviator.domain.ProductDetail;
import com.tripadviator.domain.user.UserReview;

/**
 * Product Repository is for product related operations, such as search, update, delete.
 * Also include product reviews, product photos, product videos.
 * 
 * @author Ming
 *
 */
public interface ProductRepository
{
	
	//*********************************************************************************************************************
	// Product Information
	//*********************************************************************************************************************
	
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
	public List<ProductDetail> getProductListByProductRequest(String startDate, String endDate, 
			String topX, Integer destId, String currencyCode,
			Integer catId, Integer subCatId, boolean dealsOnly);
	
	
	/**
	 * Get all of the product code from DB
	 * 
	 * @return
	 */
	public List<String> getAllProductCode();
	
	
	
	//*********************************************************************************************************************
	// Product Review
	//*********************************************************************************************************************
	
	public List<UserReview> getReviewListByProductCode(String productCode);
	
	
	public List<UserReview> getReviewListByUserId(Long userId);
	
	
	public UserReview getReviewById(String id);
	
	
	//*********************************************************************************************************************
	// Product Photo
	//*********************************************************************************************************************
	
	
	
	
	//*********************************************************************************************************************
	// Product Review
	//*********************************************************************************************************************
	
	
	
}