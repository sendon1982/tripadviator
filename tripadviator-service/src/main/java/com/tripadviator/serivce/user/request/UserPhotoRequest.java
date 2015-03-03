package com.tripadviator.serivce.user.request;

import com.tripadviator.serivce.base.AbstractRequest;

public class UserPhotoRequest extends AbstractRequest
{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8034141287669963531L;

	private String code;
	
	private String topX;
	
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
}