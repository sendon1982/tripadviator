package com.tripadviator.serivce.product.request;

import com.tripadviator.serivce.base.AbstractRequest;

public class ProductDetailRequest extends AbstractRequest
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8944774093851708636L;
	
	
	private String code;
	
	private String currencyCode;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	
}
