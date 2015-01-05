package com.tripadviator.serivce.user.request;

import com.tripadviator.serivce.base.AbstractRequest;

public class UserReviewRequest extends AbstractRequest
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2943427531307771333L;
	
	private String code;
	
	private String topX;
	
	private String sortOrder;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTopX() {
		return topX;
	}

	public void setTopX(String topX) {
		this.topX = topX;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}