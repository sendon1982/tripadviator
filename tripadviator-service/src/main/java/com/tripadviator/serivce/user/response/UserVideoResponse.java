package com.tripadviator.serivce.user.response;

import java.util.List;

import com.tripadviator.domain.user.UserVideo;
import com.tripadviator.serivce.base.AbstractResponse;

public class UserVideoResponse extends AbstractResponse
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5927734375738629424L;
	
	private List<UserVideo> data;

	public List<UserVideo> getData() {
		return data;
	}

	public void setData(List<UserVideo> data) {
		this.data = data;
	}
	
}