package com.tripadviator.domain.seo;

import java.io.Serializable;
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
{ "sortOrder", "supplierName", "currencyCode", "catIds", "subCatIds", "webURL",
		"specialReservationDetails", "panoramaCount", "merchantCancellable",
		"bookingEngineId", "onRequestPeriod", "primaryGroupId", "title",
		"shortDescription", "price", "specialReservation", "rating",
		"thumbnailURL", "photoCount", "reviewCount", "supplierCode", "onSale",
		"shortTitle", "merchantNetPriceFromFormatted", "savingAmount",
		"savingAmountFormated", "specialOfferAvailable", "thumbnailHiResURL",
		"translationLevel", "primaryDestinationId", "primaryDestinationName",
		"rrp", "rrpformatted", "priceFormatted", "merchantNetPriceFrom",
		"videoCount", "duration", "code" })
public class SeoProduct implements Serializable
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4642683808792365253L;

	@JsonProperty("sortOrder")
	private Integer sortOrder;
	
	@JsonProperty("supplierName")
	private String supplierName;
	
	@JsonProperty("currencyCode")
	private String currencyCode;
	
	@JsonProperty("catIds")
	private List<Integer> catIds = new ArrayList<Integer>();
	
	@JsonProperty("subCatIds")
	private List<Integer> subCatIds = new ArrayList<Integer>();
	
	@JsonProperty("webURL")
	private String webURL;
	
	@JsonProperty("specialReservationDetails")
	private Object specialReservationDetails;
	
	@JsonProperty("panoramaCount")
	private Integer panoramaCount;
	
	@JsonProperty("merchantCancellable")
	private Boolean merchantCancellable;
	
	@JsonProperty("bookingEngineId")
	private String bookingEngineId;
	
	@JsonProperty("onRequestPeriod")
	private Object onRequestPeriod;
	
	@JsonProperty("primaryGroupId")
	private Object primaryGroupId;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("shortDescription")
	private String shortDescription;
	
	@JsonProperty("price")
	private Float price;
	
	@JsonProperty("specialReservation")
	private Boolean specialReservation;
	
	@JsonProperty("rating")
	private Float rating;
	
	@JsonProperty("thumbnailURL")
	private String thumbnailURL;
	
	@JsonProperty("photoCount")
	private Integer photoCount;
	
	@JsonProperty("reviewCount")
	private Integer reviewCount;
	
	@JsonProperty("supplierCode")
	private String supplierCode;
	
	@JsonProperty("onSale")
	private Boolean onSale;
	
	@JsonProperty("shortTitle")
	private String shortTitle;
	
	@JsonProperty("merchantNetPriceFromFormatted")
	private String merchantNetPriceFromFormatted;
	
	@JsonProperty("savingAmount")
	private Integer savingAmount;
	
	@JsonProperty("savingAmountFormated")
	private String savingAmountFormated;
	
	@JsonProperty("specialOfferAvailable")
	private Boolean specialOfferAvailable;
	
	@JsonProperty("thumbnailHiResURL")
	private String thumbnailHiResURL;
	
	@JsonProperty("translationLevel")
	private Integer translationLevel;
	
	@JsonProperty("primaryDestinationId")
	private Integer primaryDestinationId;
	
	@JsonProperty("primaryDestinationName")
	private String primaryDestinationName;
	
	@JsonProperty("rrp")
	private Integer rrp;
	
	@JsonProperty("rrpformatted")
	private String rrpformatted;
	
	@JsonProperty("priceFormatted")
	private String priceFormatted;
	
	@JsonProperty("merchantNetPriceFrom")
	private Integer merchantNetPriceFrom;
	
	@JsonProperty("videoCount")
	private Integer videoCount;
	
	@JsonProperty("duration")
	private String duration;
	
	@JsonProperty("code")
	private String code;
	
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
	 * @return The supplierName
	 */
	@JsonProperty("supplierName")
	public String getSupplierName()
	{
		return supplierName;
	}

	/**
	 * 
	 * @param supplierName
	 *            The supplierName
	 */
	@JsonProperty("supplierName")
	public void setSupplierName(String supplierName)
	{
		this.supplierName = supplierName;
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
	 * @return The catIds
	 */
	@JsonProperty("catIds")
	public List<Integer> getCatIds()
	{
		return catIds;
	}

	/**
	 * 
	 * @param catIds
	 *            The catIds
	 */
	@JsonProperty("catIds")
	public void setCatIds(List<Integer> catIds)
	{
		this.catIds = catIds;
	}

	/**
	 * 
	 * @return The subCatIds
	 */
	@JsonProperty("subCatIds")
	public List<Integer> getSubCatIds()
	{
		return subCatIds;
	}

	/**
	 * 
	 * @param subCatIds
	 *            The subCatIds
	 */
	@JsonProperty("subCatIds")
	public void setSubCatIds(List<Integer> subCatIds)
	{
		this.subCatIds = subCatIds;
	}

	/**
	 * 
	 * @return The webURL
	 */
	@JsonProperty("webURL")
	public String getWebURL()
	{
		return webURL;
	}

	/**
	 * 
	 * @param webURL
	 *            The webURL
	 */
	@JsonProperty("webURL")
	public void setWebURL(String webURL)
	{
		this.webURL = webURL;
	}

	/**
	 * 
	 * @return The specialReservationDetails
	 */
	@JsonProperty("specialReservationDetails")
	public Object getSpecialReservationDetails()
	{
		return specialReservationDetails;
	}

	/**
	 * 
	 * @param specialReservationDetails
	 *            The specialReservationDetails
	 */
	@JsonProperty("specialReservationDetails")
	public void setSpecialReservationDetails(Object specialReservationDetails)
	{
		this.specialReservationDetails = specialReservationDetails;
	}

	/**
	 * 
	 * @return The panoramaCount
	 */
	@JsonProperty("panoramaCount")
	public Integer getPanoramaCount()
	{
		return panoramaCount;
	}

	/**
	 * 
	 * @param panoramaCount
	 *            The panoramaCount
	 */
	@JsonProperty("panoramaCount")
	public void setPanoramaCount(Integer panoramaCount)
	{
		this.panoramaCount = panoramaCount;
	}

	/**
	 * 
	 * @return The merchantCancellable
	 */
	@JsonProperty("merchantCancellable")
	public Boolean getMerchantCancellable()
	{
		return merchantCancellable;
	}

	/**
	 * 
	 * @param merchantCancellable
	 *            The merchantCancellable
	 */
	@JsonProperty("merchantCancellable")
	public void setMerchantCancellable(Boolean merchantCancellable)
	{
		this.merchantCancellable = merchantCancellable;
	}

	/**
	 * 
	 * @return The bookingEngineId
	 */
	@JsonProperty("bookingEngineId")
	public String getBookingEngineId()
	{
		return bookingEngineId;
	}

	/**
	 * 
	 * @param bookingEngineId
	 *            The bookingEngineId
	 */
	@JsonProperty("bookingEngineId")
	public void setBookingEngineId(String bookingEngineId)
	{
		this.bookingEngineId = bookingEngineId;
	}

	/**
	 * 
	 * @return The onRequestPeriod
	 */
	@JsonProperty("onRequestPeriod")
	public Object getOnRequestPeriod()
	{
		return onRequestPeriod;
	}

	/**
	 * 
	 * @param onRequestPeriod
	 *            The onRequestPeriod
	 */
	@JsonProperty("onRequestPeriod")
	public void setOnRequestPeriod(Object onRequestPeriod)
	{
		this.onRequestPeriod = onRequestPeriod;
	}

	/**
	 * 
	 * @return The primaryGroupId
	 */
	@JsonProperty("primaryGroupId")
	public Object getPrimaryGroupId()
	{
		return primaryGroupId;
	}

	/**
	 * 
	 * @param primaryGroupId
	 *            The primaryGroupId
	 */
	@JsonProperty("primaryGroupId")
	public void setPrimaryGroupId(Object primaryGroupId)
	{
		this.primaryGroupId = primaryGroupId;
	}

	/**
	 * 
	 * @return The title
	 */
	@JsonProperty("title")
	public String getTitle()
	{
		return title;
	}

	/**
	 * 
	 * @param title
	 *            The title
	 */
	@JsonProperty("title")
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * 
	 * @return The shortDescription
	 */
	@JsonProperty("shortDescription")
	public String getShortDescription()
	{
		return shortDescription;
	}

	/**
	 * 
	 * @param shortDescription
	 *            The shortDescription
	 */
	@JsonProperty("shortDescription")
	public void setShortDescription(String shortDescription)
	{
		this.shortDescription = shortDescription;
	}

	/**
	 * 
	 * @return The price
	 */
	@JsonProperty("price")
	public Float getPrice()
	{
		return price;
	}

	/**
	 * 
	 * @param price
	 *            The price
	 */
	@JsonProperty("price")
	public void setPrice(Float price)
	{
		this.price = price;
	}

	/**
	 * 
	 * @return The specialReservation
	 */
	@JsonProperty("specialReservation")
	public Boolean getSpecialReservation()
	{
		return specialReservation;
	}

	/**
	 * 
	 * @param specialReservation
	 *            The specialReservation
	 */
	@JsonProperty("specialReservation")
	public void setSpecialReservation(Boolean specialReservation)
	{
		this.specialReservation = specialReservation;
	}

	/**
	 * 
	 * @return The rating
	 */
	@JsonProperty("rating")
	public Float getRating()
	{
		return rating;
	}

	/**
	 * 
	 * @param rating
	 *            The rating
	 */
	@JsonProperty("rating")
	public void setRating(Float rating)
	{
		this.rating = rating;
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
	 * @return The photoCount
	 */
	@JsonProperty("photoCount")
	public Integer getPhotoCount()
	{
		return photoCount;
	}

	/**
	 * 
	 * @param photoCount
	 *            The photoCount
	 */
	@JsonProperty("photoCount")
	public void setPhotoCount(Integer photoCount)
	{
		this.photoCount = photoCount;
	}

	/**
	 * 
	 * @return The reviewCount
	 */
	@JsonProperty("reviewCount")
	public Integer getReviewCount()
	{
		return reviewCount;
	}

	/**
	 * 
	 * @param reviewCount
	 *            The reviewCount
	 */
	@JsonProperty("reviewCount")
	public void setReviewCount(Integer reviewCount)
	{
		this.reviewCount = reviewCount;
	}

	/**
	 * 
	 * @return The supplierCode
	 */
	@JsonProperty("supplierCode")
	public String getSupplierCode()
	{
		return supplierCode;
	}

	/**
	 * 
	 * @param supplierCode
	 *            The supplierCode
	 */
	@JsonProperty("supplierCode")
	public void setSupplierCode(String supplierCode)
	{
		this.supplierCode = supplierCode;
	}

	/**
	 * 
	 * @return The onSale
	 */
	@JsonProperty("onSale")
	public Boolean getOnSale()
	{
		return onSale;
	}

	/**
	 * 
	 * @param onSale
	 *            The onSale
	 */
	@JsonProperty("onSale")
	public void setOnSale(Boolean onSale)
	{
		this.onSale = onSale;
	}

	/**
	 * 
	 * @return The shortTitle
	 */
	@JsonProperty("shortTitle")
	public String getShortTitle()
	{
		return shortTitle;
	}

	/**
	 * 
	 * @param shortTitle
	 *            The shortTitle
	 */
	@JsonProperty("shortTitle")
	public void setShortTitle(String shortTitle)
	{
		this.shortTitle = shortTitle;
	}

	/**
	 * 
	 * @return The merchantNetPriceFromFormatted
	 */
	@JsonProperty("merchantNetPriceFromFormatted")
	public String getMerchantNetPriceFromFormatted()
	{
		return merchantNetPriceFromFormatted;
	}

	/**
	 * 
	 * @param merchantNetPriceFromFormatted
	 *            The merchantNetPriceFromFormatted
	 */
	@JsonProperty("merchantNetPriceFromFormatted")
	public void setMerchantNetPriceFromFormatted(
			String merchantNetPriceFromFormatted)
	{
		this.merchantNetPriceFromFormatted = merchantNetPriceFromFormatted;
	}

	/**
	 * 
	 * @return The savingAmount
	 */
	@JsonProperty("savingAmount")
	public Integer getSavingAmount()
	{
		return savingAmount;
	}

	/**
	 * 
	 * @param savingAmount
	 *            The savingAmount
	 */
	@JsonProperty("savingAmount")
	public void setSavingAmount(Integer savingAmount)
	{
		this.savingAmount = savingAmount;
	}

	/**
	 * 
	 * @return The savingAmountFormated
	 */
	@JsonProperty("savingAmountFormated")
	public String getSavingAmountFormated()
	{
		return savingAmountFormated;
	}

	/**
	 * 
	 * @param savingAmountFormated
	 *            The savingAmountFormated
	 */
	@JsonProperty("savingAmountFormated")
	public void setSavingAmountFormated(String savingAmountFormated)
	{
		this.savingAmountFormated = savingAmountFormated;
	}

	/**
	 * 
	 * @return The specialOfferAvailable
	 */
	@JsonProperty("specialOfferAvailable")
	public Boolean getSpecialOfferAvailable()
	{
		return specialOfferAvailable;
	}

	/**
	 * 
	 * @param specialOfferAvailable
	 *            The specialOfferAvailable
	 */
	@JsonProperty("specialOfferAvailable")
	public void setSpecialOfferAvailable(Boolean specialOfferAvailable)
	{
		this.specialOfferAvailable = specialOfferAvailable;
	}

	/**
	 * 
	 * @return The thumbnailHiResURL
	 */
	@JsonProperty("thumbnailHiResURL")
	public String getThumbnailHiResURL()
	{
		return thumbnailHiResURL;
	}

	/**
	 * 
	 * @param thumbnailHiResURL
	 *            The thumbnailHiResURL
	 */
	@JsonProperty("thumbnailHiResURL")
	public void setThumbnailHiResURL(String thumbnailHiResURL)
	{
		this.thumbnailHiResURL = thumbnailHiResURL;
	}

	/**
	 * 
	 * @return The translationLevel
	 */
	@JsonProperty("translationLevel")
	public Integer getTranslationLevel()
	{
		return translationLevel;
	}

	/**
	 * 
	 * @param translationLevel
	 *            The translationLevel
	 */
	@JsonProperty("translationLevel")
	public void setTranslationLevel(Integer translationLevel)
	{
		this.translationLevel = translationLevel;
	}

	/**
	 * 
	 * @return The primaryDestinationId
	 */
	@JsonProperty("primaryDestinationId")
	public Integer getPrimaryDestinationId()
	{
		return primaryDestinationId;
	}

	/**
	 * 
	 * @param primaryDestinationId
	 *            The primaryDestinationId
	 */
	@JsonProperty("primaryDestinationId")
	public void setPrimaryDestinationId(Integer primaryDestinationId)
	{
		this.primaryDestinationId = primaryDestinationId;
	}

	/**
	 * 
	 * @return The primaryDestinationName
	 */
	@JsonProperty("primaryDestinationName")
	public String getPrimaryDestinationName()
	{
		return primaryDestinationName;
	}

	/**
	 * 
	 * @param primaryDestinationName
	 *            The primaryDestinationName
	 */
	@JsonProperty("primaryDestinationName")
	public void setPrimaryDestinationName(String primaryDestinationName)
	{
		this.primaryDestinationName = primaryDestinationName;
	}

	/**
	 * 
	 * @return The rrp
	 */
	@JsonProperty("rrp")
	public Integer getRrp()
	{
		return rrp;
	}

	/**
	 * 
	 * @param rrp
	 *            The rrp
	 */
	@JsonProperty("rrp")
	public void setRrp(Integer rrp)
	{
		this.rrp = rrp;
	}

	/**
	 * 
	 * @return The rrpformatted
	 */
	@JsonProperty("rrpformatted")
	public String getRrpformatted()
	{
		return rrpformatted;
	}

	/**
	 * 
	 * @param rrpformatted
	 *            The rrpformatted
	 */
	@JsonProperty("rrpformatted")
	public void setRrpformatted(String rrpformatted)
	{
		this.rrpformatted = rrpformatted;
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
	 * @return The merchantNetPriceFrom
	 */
	@JsonProperty("merchantNetPriceFrom")
	public Integer getMerchantNetPriceFrom()
	{
		return merchantNetPriceFrom;
	}

	/**
	 * 
	 * @param merchantNetPriceFrom
	 *            The merchantNetPriceFrom
	 */
	@JsonProperty("merchantNetPriceFrom")
	public void setMerchantNetPriceFrom(Integer merchantNetPriceFrom)
	{
		this.merchantNetPriceFrom = merchantNetPriceFrom;
	}

	/**
	 * 
	 * @return The videoCount
	 */
	@JsonProperty("videoCount")
	public Integer getVideoCount()
	{
		return videoCount;
	}

	/**
	 * 
	 * @param videoCount
	 *            The videoCount
	 */
	@JsonProperty("videoCount")
	public void setVideoCount(Integer videoCount)
	{
		this.videoCount = videoCount;
	}

	/**
	 * 
	 * @return The duration
	 */
	@JsonProperty("duration")
	public String getDuration()
	{
		return duration;
	}

	/**
	 * 
	 * @param duration
	 *            The duration
	 */
	@JsonProperty("duration")
	public void setDuration(String duration)
	{
		this.duration = duration;
	}

	/**
	 * 
	 * @return The code
	 */
	@JsonProperty("code")
	public String getCode()
	{
		return code;
	}

	/**
	 * 
	 * @param code
	 *            The code
	 */
	@JsonProperty("code")
	public void setCode(String code)
	{
		this.code = code;
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