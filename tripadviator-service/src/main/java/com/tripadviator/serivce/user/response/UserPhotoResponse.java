package com.tripadviator.serivce.user.response;

import java.util.List;

import com.tripadviator.domain.user.UserPhoto;
import com.tripadviator.serivce.base.AbstractResponse;

public class UserPhotoResponse extends AbstractResponse
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2045049385123937754L;
	
	private List<UserPhoto> data;

	public List<UserPhoto> getData() {
		return data;
	}

	public void setData(List<UserPhoto> data) {
		this.data = data;
	}
	
}