package com.tripadviator.serivce.base;

import java.io.Serializable;

public abstract class AbstractResponse implements Serializable
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6388245834818220431L;
	
	protected int totalCount;

	protected boolean success;
	
	protected String dateStamp;
	
	protected String vmid;

	protected String errorType;

	protected String errorName;
	
	protected String errorMessage;
	
	protected String errorMessageText;
	
	protected String errorReference;
	
	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public String getErrorName() {
		return errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessageText() {
		return errorMessageText;
	}

	public void setErrorMessageText(String errorMessageText) {
		this.errorMessageText = errorMessageText;
	}

	public String getErrorReference() {
		return errorReference;
	}

	public void setErrorReference(String errorReference) {
		this.errorReference = errorReference;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getDateStamp() {
		return dateStamp;
	}

	public void setDateStamp(String dateStamp) {
		this.dateStamp = dateStamp;
	}

	public String getVmid() {
		return vmid;
	}

	public void setVmid(String vmid) {
		this.vmid = vmid;
	}
}
