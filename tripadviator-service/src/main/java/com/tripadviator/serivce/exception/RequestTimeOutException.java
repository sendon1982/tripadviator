package com.tripadviator.serivce.exception;

public class RequestTimeOutException extends RuntimeException 
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3432755882309045037L;

	public RequestTimeOutException(String message) 
	{
		super(message);
	}
	
	public RequestTimeOutException(Throwable ex) 
	{
		super(ex);
	}

	public RequestTimeOutException(String message, Throwable ex) 
	{
		super(message, ex);
	}

}
