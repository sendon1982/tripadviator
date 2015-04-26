package com.tripadviator.domain.booking;

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
{ "sortOrder", "currencyCode", "price", "priceFormatted", "merchantNetPrice",
		"merchantNetPriceFormatted", "minNoOfTravellersRequiredForPrice" })
public class TourGradePricing
{

	@JsonProperty("sortOrder")
	private Integer sortOrder;
	@JsonProperty("currencyCode")
	private String currencyCode;
	@JsonProperty("price")
	private Integer price;
	@JsonProperty("priceFormatted")
	private String priceFormatted;
	@JsonProperty("merchantNetPrice")
	private Integer merchantNetPrice;
	@JsonProperty("merchantNetPriceFormatted")
	private String merchantNetPriceFormatted;
	@JsonProperty("minNoOfTravellersRequiredForPrice")
	private Integer minNoOfTravellersRequiredForPrice;
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
	 * @return The currencyCode
	 */
	@JsonProperty("currencyCode")
	public String getCurrencyCode()
	{
		return currencyCode;
	}

	/**
	 * 
	 * @param currencyCode
	 *            The currencyCode
	 */
	@JsonProperty("currencyCode")
	public void setCurrencyCode(String currencyCode)
	{
		this.currencyCode = currencyCode;
	}

	/**
	 * 
	 * @return The price
	 */
	@JsonProperty("price")
	public Integer getPrice()
	{
		return price;
	}

	/**
	 * 
	 * @param price
	 *            The price
	 */
	@JsonProperty("price")
	public void setPrice(Integer price)
	{
		this.price = price;
	}

	/**
	 * 
	 * @return The priceFormatted
	 */
	@JsonProperty("priceFormatted")
	public String getPriceFormatted()
	{
		return priceFormatted;
	}

	/**
	 * 
	 * @param priceFormatted
	 *            The priceFormatted
	 */
	@JsonProperty("priceFormatted")
	public void setPriceFormatted(String priceFormatted)
	{
		this.priceFormatted = priceFormatted;
	}

	/**
	 * 
	 * @return The merchantNetPrice
	 */
	@JsonProperty("merchantNetPrice")
	public Integer getMerchantNetPrice()
	{
		return merchantNetPrice;
	}

	/**
	 * 
	 * @param merchantNetPrice
	 *            The merchantNetPrice
	 */
	@JsonProperty("merchantNetPrice")
	public void setMerchantNetPrice(Integer merchantNetPrice)
	{
		this.merchantNetPrice = merchantNetPrice;
	}

	/**
	 * 
	 * @return The merchantNetPriceFormatted
	 */
	@JsonProperty("merchantNetPriceFormatted")
	public String getMerchantNetPriceFormatted()
	{
		return merchantNetPriceFormatted;
	}

	/**
	 * 
	 * @param merchantNetPriceFormatted
	 *            The merchantNetPriceFormatted
	 */
	@JsonProperty("merchantNetPriceFormatted")
	public void setMerchantNetPriceFormatted(String merchantNetPriceFormatted)
	{
		this.merchantNetPriceFormatted = merchantNetPriceFormatted;
	}

	/**
	 * 
	 * @return The minNoOfTravellersRequiredForPrice
	 */
	@JsonProperty("minNoOfTravellersRequiredForPrice")
	public Integer getMinNoOfTravellersRequiredForPrice()
	{
		return minNoOfTravellersRequiredForPrice;
	}

	/**
	 * 
	 * @param minNoOfTravellersRequiredForPrice
	 *            The minNoOfTravellersRequiredForPrice
	 */
	@JsonProperty("minNoOfTravellersRequiredForPrice")
	public void setMinNoOfTravellersRequiredForPrice(
			Integer minNoOfTravellersRequiredForPrice)
	{
		this.minNoOfTravellersRequiredForPrice = minNoOfTravellersRequiredForPrice;
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