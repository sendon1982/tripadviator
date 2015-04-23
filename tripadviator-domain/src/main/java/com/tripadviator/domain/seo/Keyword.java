package com.tripadviator.domain.seo;

import java.io.Serializable;

public class Keyword implements Serializable
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1801207808888515549L;

    private Integer keywordId;
	
    private String keyword;
    
	public String getKeyword()
	{
		return keyword;
	}

	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}

	public Integer getKeywordId()
	{
		return keywordId;
	}

	public void setKeywordId(Integer keywordId)
	{
		this.keywordId = keywordId;
	}

}
