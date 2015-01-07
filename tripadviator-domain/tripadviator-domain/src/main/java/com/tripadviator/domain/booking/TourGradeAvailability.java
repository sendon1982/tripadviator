package com.tripadviator.domain.booking;

import java.io.Serializable;

public class TourGradeAvailability implements Serializable
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8561968923457952121L;

	private Integer sortOrder;

	private String bookingDate;
	
	private Double retailPrice;
	
	private String gradeCode;
	
	private String unavailableReason;
	
	private String retailPriceFormatted;
	
	private Double merchantNetPrice;
	
	private String merchantNetPriceFormatted;
	
	private String currencyCode;
	
	private boolean available;
	
	public Integer getSortOrder()
	{
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder)
	{
		this.sortOrder = sortOrder;
	}

	public String getBookingDate()
	{
		return bookingDate;
	}

	public void setBookingDate(String bookingDate)
	{
		this.bookingDate = bookingDate;
	}

	public Double getRetailPrice()
	{
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice)
	{
		this.retailPrice = retailPrice;
	}

	public String getGradeCode()
	{
		return gradeCode;
	}

	public void setGradeCode(String gradeCode)
	{
		this.gradeCode = gradeCode;
	}

	public String getUnavailableReason()
	{
		return unavailableReason;
	}

	public void setUnavailableReason(String unavailableReason)
	{
		this.unavailableReason = unavailableReason;
	}

	public String getRetailPriceFormatted()
	{
		return retailPriceFormatted;
	}

	public void setRetailPriceFormatted(String retailPriceFormatted)
	{
		this.retailPriceFormatted = retailPriceFormatted;
	}

	public Double getMerchantNetPrice()
	{
		return merchantNetPrice;
	}

	public void setMerchantNetPrice(Double merchantNetPrice)
	{
		this.merchantNetPrice = merchantNetPrice;
	}

	public String getMerchantNetPriceFormatted()
	{
		return merchantNetPriceFormatted;
	}

	public void setMerchantNetPriceFormatted(String merchantNetPriceFormatted)
	{
		this.merchantNetPriceFormatted = merchantNetPriceFormatted;
	}

	public String getCurrencyCode()
	{
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode)
	{
		this.currencyCode = currencyCode;
	}

	public boolean isAvailable()
	{
		return available;
	}

	public void setAvailable(boolean available)
	{
		this.available = available;
	}
}
