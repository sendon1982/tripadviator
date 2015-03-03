package com.tripadviator.serivce.exception;


public class UserDuplicateException extends RuntimeException 
{
	
	public UserDuplicateException(String message) 
	{
		super(message);
	}
	
	public UserDuplicateException(Throwable ex) 
	{
		super(ex);
	}

	public UserDuplicateException(String message, Throwable ex) 
	{
		super(message, ex);
	}

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1699062418580393719L;

}
