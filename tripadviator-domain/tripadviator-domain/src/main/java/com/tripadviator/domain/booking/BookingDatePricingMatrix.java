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
{ "pricingUnit", "bookingDate", "sortOrder", "ageBandPrices" })
public class BookingDatePricingMatrix
{

	@JsonProperty("pricingUnit")
	private String pricingUnit;
	@JsonProperty("bookingDate")
	private String bookingDate;
	@JsonProperty("sortOrder")
	private Integer sortOrder;
	@JsonProperty("ageBandPrices")
	private List<AgeBandPrice> ageBandPrices = new ArrayList<AgeBandPrice>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
	 * @return The bookingDate
	 */
	@JsonProperty("bookingDate")
	public String getBookingDate()
	{
		return bookingDate;
	}

	/**
	 * 
	 * @param bookingDate
	 *            The bookingDate
	 */
	@JsonProperty("bookingDate")
	public void setBookingDate(String bookingDate)
	{
		this.bookingDate = bookingDate;
	}

	/**
	 * 
	 * @return The sortOrder
	 */
	@JsonProperty("sortOrder")
	public Integer getSortOrder()
	{
		return sortOrder;
	}

	/**
	 * 
	 * @param sortOrder
	 *            The sortOrder
	 */
	@JsonProperty("sortOrder")
	public void setSortOrder(Integer sortOrder)
	{
		this.sortOrder = sortOrder;
	}

	/**
	 * 
	 * @return The ageBandPrices
	 */
	@JsonProperty("ageBandPrices")
	public List<AgeBandPrice> getAgeBandPrices()
	{
		return ageBandPrices;
	}

	/**
	 * 
	 * @param ageBandPrices
	 *            The ageBandPrices
	 */
	@JsonProperty("ageBandPrices")
	public void setAgeBandPrices(List<AgeBandPrice> ageBandPrices)
	{
		this.ageBandPrices = ageBandPrices;
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