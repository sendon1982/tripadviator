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
{ "sortOrder", "gradeCode", "gradeTitle", "pricingMatrix" })
public class TourGrade
{

	@JsonProperty("sortOrder")
	private Integer sortOrder;
	@JsonProperty("gradeCode")
	private String gradeCode;
	@JsonProperty("gradeTitle")
	private String gradeTitle;
	@JsonProperty("pricingMatrix")
	private List<BookingDatePricingMatrix> pricingMatrix = new ArrayList<BookingDatePricingMatrix>();
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
	 * @return The gradeCode
	 */
	@JsonProperty("gradeCode")
	public String getGradeCode()
	{
		return gradeCode;
	}

	/**
	 * 
	 * @param gradeCode
	 *            The gradeCode
	 */
	@JsonProperty("gradeCode")
	public void setGradeCode(String gradeCode)
	{
		this.gradeCode = gradeCode;
	}

	/**
	 * 
	 * @return The gradeTitle
	 */
	@JsonProperty("gradeTitle")
	public String getGradeTitle()
	{
		return gradeTitle;
	}

	/**
	 * 
	 * @param gradeTitle
	 *            The gradeTitle
	 */
	@JsonProperty("gradeTitle")
	public void setGradeTitle(String gradeTitle)
	{
		this.gradeTitle = gradeTitle;
	}

	/**
	 * 
	 * @return The pricingMatrix
	 */
	@JsonProperty("pricingMatrix")
	public List<BookingDatePricingMatrix> getPricingMatrix()
	{
		return pricingMatrix;
	}

	/**
	 * 
	 * @param pricingMatrix
	 *            The pricingMatrix
	 */
	@JsonProperty("pricingMatrix")
	public void setPricingMatrix(List<BookingDatePricingMatrix> pricingMatrix)
	{
		this.pricingMatrix = pricingMatrix;
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