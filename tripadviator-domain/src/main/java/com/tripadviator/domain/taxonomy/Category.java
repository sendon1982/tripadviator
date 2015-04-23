package com.tripadviator.domain.taxonomy;

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
{ "sortOrder", "thumbnailURL", "subcategories", "productCount", "groupName",
		"id" })
public class Category
{

	@JsonProperty("sortOrder")
	private Integer sortOrder;
	@JsonProperty("thumbnailURL")
	private String thumbnailURL;
	
	@JsonProperty("subcategories")
	private List<SubCategory> subcategories = new ArrayList<SubCategory>();
	
	@JsonProperty("productCount")
	private Integer productCount;
	
	@JsonProperty("groupName")
	private String groupName;
	
	@JsonProperty("id")
	private Integer id;
	
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
	 * @return The thumbnailURL
	 */
	@JsonProperty("thumbnailURL")
	public String getThumbnailURL()
	{
		return thumbnailURL;
	}

	/**
	 * 
	 * @param thumbnailURL
	 *            The thumbnailURL
	 */
	@JsonProperty("thumbnailURL")
	public void setThumbnailURL(String thumbnailURL)
	{
		this.thumbnailURL = thumbnailURL;
	}

	/**
	 * 
	 * @return The subcategories
	 */
	@JsonProperty("subcategories")
	public List<SubCategory> getSubcategories()
	{
		return subcategories;
	}

	/**
	 * 
	 * @param subcategories
	 *            The subcategories
	 */
	@JsonProperty("subcategories")
	public void setSubcategories(List<SubCategory> subcategories)
	{
		this.subcategories = subcategories;
	}

	/**
	 * 
	 * @return The productCount
	 */
	@JsonProperty("productCount")
	public Integer getProductCount()
	{
		return productCount;
	}

	/**
	 * 
	 * @param productCount
	 *            The productCount
	 */
	@JsonProperty("productCount")
	public void setProductCount(Integer productCount)
	{
		this.productCount = productCount;
	}

	/**
	 * 
	 * @return The groupName
	 */
	@JsonProperty("groupName")
	public String getGroupName()
	{
		return groupName;
	}

	/**
	 * 
	 * @param groupName
	 *            The groupName
	 */
	@JsonProperty("groupName")
	public void setGroupName(String groupName)
	{
		this.groupName = groupName;
	}

	/**
	 * 
	 * @return The id
	 */
	@JsonProperty("id")
	public Integer getId()
	{
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	@JsonProperty("id")
	public void setId(Integer id)
	{
		this.id = id;
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
