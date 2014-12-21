package com.tripadviator.serivce.product.response;

import com.tripadviator.domain.ProductDetail;
import com.tripadviator.serivce.base.AbstractResponse;

public class ProductDetailResponse extends AbstractResponse
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6963766679808287822L;
	
	
	private ProductDetail data;


	public ProductDetail getData() {
		return data;
	}

	public void setData(ProductDetail data) {
		this.data = data;
	}
	
}
