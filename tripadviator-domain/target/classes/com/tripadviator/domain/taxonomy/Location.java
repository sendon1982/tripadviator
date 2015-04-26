package com.tripadviator.domain.taxonomy;

import java.util.HashMap;
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
{ "sortOrder", "selectable", "defaultCurrencyCode", "iataCode", "parentId",
		"lookupId", "destinationId", "destinationType", "destinationName",
		"latitude", "longitude", "timeZone" })
public class Location
{

	@JsonProperty("sortOrder")
	private Integer sortOrder;
	
	@JsonProperty("selectable")
	private Boolean selectable;
	
	@JsonProperty("defaultCurrencyCode")
	private String defaultCurrencyCode;
	
	@JsonProperty("iataCode")
	private Object iataCode;
	
	@JsonProperty("parentId")
	private Integer parentId;
	
	@JsonProperty("lookupId")
	private String lookupId;
	
	@JsonProperty("destinationId")
	private Integer destinationId;
	
	@JsonProperty("destinationType")
	private String destinationType;
	
	@JsonProperty("destinationName")
	private String destinationName;
	
	@JsonProperty("latitude")
	private Double latitude;
	
	@JsonProperty("longitude")
	private Double longitude;
	
	@JsonProperty("timeZone")
	private String timeZone;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
	 * @return The selectable
	 */
	@JsonProperty("selectable")
	public Boolean getSelectable()
	{
		return selectable;
	}

	/**
	 * 
	 * @param selectable
	 *            The selectable
	 */
	@JsonProperty("selectable")
	public void setSelectable(Boolean selectable)
	{
		this.selectable = selectable;
	}

	/**
	 * 
	 * @return The defaultCurrencyCode
	 */
	@JsonProperty("defaultCurrencyCode")
	public String getDefaultCurrencyCode()
	{
		return defaultCurrencyCode;
	}

	/**
	 * 
	 * @param defaultCurrencyCode
	 *            The defaultCurrencyCode
	 */
	@JsonProperty("defaultCurrencyCode")
	public void setDefaultCurrencyCode(String defaultCurrencyCode)
	{
		this.defaultCurrencyCode = defaultCurrencyCode;
	}

	/**
	 * 
	 * @return The iataCode
	 */
	@JsonProperty("iataCode")
	public Object getIataCode()
	{
		return iataCode;
	}

	/**
	 * 
	 * @param iataCode
	 *            The iataCode
	 */
	@JsonProperty("iataCode")
	public void setIataCode(Object iataCode)
	{
		this.iataCode = iataCode;
	}

	/**
	 * 
	 * @return The parentId
	 */
	@JsonProperty("parentId")
	public Integer getParentId()
	{
		return parentId;
	}

	/**
	 * 
	 * @param parentId
	 *            The parentId
	 */
	@JsonProperty("parentId")
	public void setParentId(Integer parentId)
	{
		this.parentId = parentId;
	}

	/**
	 * 
	 * @return The lookupId
	 */
	@JsonProperty("lookupId")
	public String getLookupId()
	{
		return lookupId;
	}

	/**
	 * 
	 * @param lookupId
	 *            The lookupId
	 */
	@JsonProperty("lookupId")
	public void setLookupId(String lookupId)
	{
		this.lookupId = lookupId;
	}

	/**
	 * 
	 * @return The destinationId
	 */
	@JsonProperty("destinationId")
	public Integer getDestinationId()
	{
		return destinationId;
	}

	/**
	 * 
	 * @param destinationId
	 *            The destinationId
	 */
	@JsonProperty("destinationId")
	public void setDestinationId(Integer destinationId)
	{
		this.destinationId = destinationId;
	}

	/**
	 * 
	 * @return The destinationType
	 */
	@JsonProperty("destinationType")
	public String getDestinationType()
	{
		return destinationType;
	}

	/**
	 * 
	 * @param destinationType
	 *            The destinationType
	 */
	@JsonProperty("destinationType")
	public void setDestinationType(String destinationType)
	{
		this.destinationType = destinationType;
	}

	/**
	 * 
	 * @return The destinationName
	 */
	@JsonProperty("destinationName")
	public String getDestinationName()
	{
		return destinationName;
	}

	/**
	 * 
	 * @param destinationName
	 *            The destinationName
	 */
	@JsonProperty("destinationName")
	public void setDestinationName(String destinationName)
	{
		this.destinationName = destinationName;
	}

	/**
	 * 
	 * @return The latitude
	 */
	@JsonProperty("latitude")
	public Double getLatitude()
	{
		return latitude;
	}

	/**
	 * 
	 * @param latitude
	 *            The latitude
	 */
	@JsonProperty("latitude")
	public void setLatitude(Double latitude)
	{
		this.latitude = latitude;
	}

	/**
	 * 
	 * @return The longitude
	 */
	@JsonProperty("longitude")
	public Double getLongitude()
	{
		return longitude;
	}

	/**
	 * 
	 * @param longitude
	 *            The longitude
	 */
	@JsonProperty("longitude")
	public void setLongitude(Double longitude)
	{
		this.longitude = longitude;
	}

	/**
	 * 
	 * @return The timeZone
	 */
	@JsonProperty("timeZone")
	public String getTimeZone()
	{
		return timeZone;
	}

	/**
	 * 
	 * @param timeZone
	 *            The timeZone
	 */
	@JsonProperty("timeZone")
	public void setTimeZone(String timeZone)
	{
		this.timeZone = timeZone;
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