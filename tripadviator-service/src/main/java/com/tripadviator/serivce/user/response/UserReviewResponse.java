package com.tripadviator.serivce.user.response;

import java.util.List;

import com.tripadviator.domain.user.UserReview;
import com.tripadviator.serivce.base.AbstractResponse;

public class UserReviewResponse extends AbstractResponse
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -499232107242606682L;
	
	private List<UserReview> data;

	public List<UserReview> getData() {
		return data;
	}

	public void setData(List<UserReview> data) {
		this.data = data;
	}
	
}