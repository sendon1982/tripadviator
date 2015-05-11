package com.tripadviator.dao.mongo.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.tripadviator.dao.mongo.AbstractMongoDAO;
import com.tripadviator.domain.AbstractEntity;
import com.tripadviator.domain.Product;
import com.tripadviator.domain.ProductDetail;
import com.tripadviator.domain.user.UserReview;

@Repository("productRepository")
public class ProductRepositoryImpl extends AbstractMongoDAO implements ProductRepository
{
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Product> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Product> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Page<Product> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public void delete(String arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void delete(Product arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void delete(Iterable<? extends Product> arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Iterable<Product> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Product findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends AbstractEntity> S save(S s) 
	{
		getMongoTemplate().save(s);
		return null;
	}
	
	/**
	 * Get product by its code
	 *  
	 * @param code
	 * @return
	 */
	@Override
	public ProductDetail getProductByCode(String code)
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("code").is(code));
		
		return getMongoTemplate().findOne(query, ProductDetail.class);
	}
	
	
	/**
	 * Get products by its code
	 *  
	 * @param code
	 * @return
	 */
	@Override
	public List<Product> getProductListByCodes(String[] codes)
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("code").in(Arrays.asList(codes)));
		
		return getMongoTemplate().find(query, Product.class);
	}
	
	/**
	 * Get product by its condition, such as date range, 
	 *  
	 * @param code
	 * @return
	 */
	@Override
	public List<ProductDetail> getProductListByProductRequest(String startDate, String endDate, 
			String topX, Integer destId, String currencyCode,
			Integer catId, Integer subCatId, boolean dealsOnly)
	{
		Query query = new Query();
//		query.addCriteria(Criteria.where("startDate").lte(startDate));
//		query.addCriteria(Criteria.where("endDate").lte(endDate));
		query.addCriteria(Criteria.where("currencyCode").is(currencyCode));
		
		if(catId == null || catId == 0)
		{
			// null
		}
		else
		{
			query.addCriteria(Criteria.where("catId").is(catId));
		}
		
		if(subCatId == null || subCatId == 0)
		{
			// null
		}
		else
		{
			query.addCriteria(Criteria.where("subCatId").is(subCatId));
		}
		
//		query.addCriteria(Criteria.where("dealsOnly").is(dealsOnly));
		query.addCriteria(Criteria.where("destinationId").is(destId));
//		query.addCriteria(Criteria.where("").size(getSizeFromTopX(topX)));
		
		return getMongoTemplate().find(query, ProductDetail.class);
	}
	

	/**
	 * Get all of the product code from DB sorted by ID (Primary Key)
	 * 
	 * @return
	 */
	@Override
	public List<String> getAllProductCode()
	{
		Query query = new Query();
		query.fields().include("code");
		query.with(new Sort(Sort.Direction.ASC, "_id"));
		
		List<Product> productList = getMongoTemplate().find(query, Product.class);
		List<String> productCodeList = new ArrayList<String>();
		
		for (Product product : productList) 
		{
			productCodeList.add(product.getCode());
		}
		
		return productCodeList;
	}
	
	
	//*********************************************************************************************************************
	// Product Review
	//*********************************************************************************************************************
	
	public List<UserReview> getReviewListByProductCode(String productCode)
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("productCode").is(productCode));
		
		List<UserReview> userReviewList = getMongoTemplate().find(query, UserReview.class);
	
		return userReviewList;
	}
	
	
	public List<UserReview> getReviewListByUserId(Long userId)
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("ownerId").is(userId));
		
		List<UserReview> userReviewList = getMongoTemplate().find(query, UserReview.class);
	
		return userReviewList;
	}
	
	
	public UserReview getReviewById(String id)
	{
		return new UserReview();
	}
}
