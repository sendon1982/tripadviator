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
{ "bandId", "prices", "sortOrder", "maximumCountRequired",
		"minimumCountRequired" })
public class AgeBandPrice
{

	@JsonProperty("bandId")
	private Integer bandId;
	
	@JsonProperty("prices")
	private List<TourGradePricing> prices = new ArrayList<TourGradePricing>();
	
	@JsonProperty("sortOrder")
	private Integer sortOrder;
	
	@JsonProperty("maximumCountRequired")
	private Object maximumCountRequired;
	
	@JsonProperty("minimumCountRequired")
	private Integer minimumCountRequired;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The bandId
	 */
	@JsonProperty("bandId")
	public Integer getBandId()
	{
		return bandId;
	}

	/**
	 * 
	 * @param bandId
	 *            The bandId
	 */
	@JsonProperty("bandId")
	public void setBandId(Integer bandId)
	{
		this.bandId = bandId;
	}

	/**
	 * 
	 * @return The prices
	 */
	@JsonProperty("prices")
	public List<TourGradePricing> getPrices()
	{
		return prices;
	}

	/**
	 * 
	 * @param prices
	 *            The prices
	 */
	@JsonProperty("prices")
	public void setPrices(List<TourGradePricing> prices)
	{
		this.prices = prices;
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
	 * @return The maximumCountRequired
	 */
	@JsonProperty("maximumCountRequired")
	public Object getMaximumCountRequired()
	{
		return maximumCountRequired;
	}

	/**
	 * 
	 * @param maximumCountRequired
	 *            The maximumCountRequired
	 */
	@JsonProperty("maximumCountRequired")
	public void setMaximumCountRequired(Object maximumCountRequired)
	{
		this.maximumCountRequired = maximumCountRequired;
	}

	/**
	 * 
	 * @return The minimumCountRequired
	 */
	@JsonProperty("minimumCountRequired")
	public Integer getMinimumCountRequired()
	{
		return minimumCountRequired;
	}

	/**
	 * 
	 * @param minimumCountRequired
	 *            The minimumCountRequired
	 */
	@JsonProperty("minimumCountRequired")
	public void setMinimumCountRequired(Integer minimumCountRequired)
	{
		this.minimumCountRequired = minimumCountRequired;
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