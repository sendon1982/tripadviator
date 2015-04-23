package com.tripadviator.domain.booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder(
{ "bookingMonth", "pricingUnit", "dates" })
public class TourGradePricingMatrix
{

	@JsonProperty("bookingMonth")
	private String bookingMonth;
	@JsonProperty("pricingUnit")
	private String pricingUnit;
	@JsonProperty("dates")
	private List<TourGradePricingDate> dates = new ArrayList<TourGradePricingDate>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The bookingMonth
	 */
	@JsonProperty("bookingMonth")
	public String getBookingMonth()
	{
		return bookingMonth;
	}

	/**
	 * 
	 * @param bookingMonth
	 *            The bookingMonth
	 */
	@JsonProperty("bookingMonth")
	public void setBookingMonth(String bookingMonth)
	{
		this.bookingMonth = bookingMonth;
	}

	/**
	 * 
	 * @return The pricingUnit
	 */
	@JsonProperty("pricingUnit")
	public String getPricingUnit()
	{
		return pricingUnit;
	}

	/**
	 * 
	 * @param pricingUnit
	 *            The pricingUnit
	 */
	@JsonProperty("pricingUnit")
	public void setPricingUnit(String pricingUnit)
	{
		this.pricingUnit = pricingUnit;
	}

	/**
	 * 
	 * @return The dates
	 */
	@JsonProperty("dates")
	public List<TourGradePricingDate> getDates()
	{
		return dates;
	}

	/**
	 * 
	 * @param dates
	 *            The dates
	 */
	@JsonProperty("dates")
	public void setDates(List<TourGradePricingDate> dates)
	{
		this.dates = dates;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties()
	{
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value)
	{
		this.additionalProperties.put(name, value);
	}

}