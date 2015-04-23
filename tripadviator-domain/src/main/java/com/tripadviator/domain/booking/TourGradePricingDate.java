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
{ "sortOrder", "bookingDate", "tourGrades", "callForLastMinAvailability" })
public class TourGradePricingDate
{

	@JsonProperty("sortOrder")
	private Integer sortOrder;
	@JsonProperty("bookingDate")
	private String bookingDate;
	@JsonProperty("tourGrades")
	private List<TourGrade> tourGrades = new ArrayList<TourGrade>();
	@JsonProperty("callForLastMinAvailability")
	private Boolean callForLastMinAvailability;
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
	 * @return The tourGrades
	 */
	@JsonProperty("tourGrades")
	public List<TourGrade> getTourGrades()
	{
		return tourGrades;
	}

	/**
	 * 
	 * @param tourGrades
	 *            The tourGrades
	 */
	@JsonProperty("tourGrades")
	public void setTourGrades(List<TourGrade> tourGrades)
	{
		this.tourGrades = tourGrades;
	}

	/**
	 * 
	 * @return The callForLastMinAvailability
	 */
	@JsonProperty("callForLastMinAvailability")
	public Boolean getCallForLastMinAvailability()
	{
		return callForLastMinAvailability;
	}

	/**
	 * 
	 * @param callForLastMinAvailability
	 *            The callForLastMinAvailability
	 */
	@JsonProperty("callForLastMinAvailability")
	public void setCallForLastMinAvailability(Boolean callForLastMinAvailability)
	{
		this.callForLastMinAvailability = callForLastMinAvailability;
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