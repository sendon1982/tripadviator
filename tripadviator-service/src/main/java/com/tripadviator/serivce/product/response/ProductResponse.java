package com.tripadviator.serivce.product.response;

import java.util.List;

import com.tripadviator.domain.Product;
import com.tripadviator.serivce.base.AbstractResponse;

public class ProductResponse extends AbstractResponse
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6963766679808287822L;
	
	
	private List<Product> data;


	public List<Product> getData() {
		return data;
	}

	public void setData(List<Product> data) {
		this.data = data;
	}
	
}
