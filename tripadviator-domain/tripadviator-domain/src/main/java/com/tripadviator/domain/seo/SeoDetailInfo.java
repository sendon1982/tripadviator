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
import com.tripadviator.domain.user.UserPhoto;
import com.tripadviator.domain.user.UserReview;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder(
{ "panoramaCount", "webURL", "userName", "publishedDate", "userPhotos",
		"reviews", "products", "ratingCounts", "infoPageOverview1",
		"infoPageOverview2", "attractionAdmission", "attractionTransit",
		"attractionOpenHours", "infoPageOverviewTitle1",
		"infoPageOverviewTitle2", "title", "editorsPick", "keywords", "rating",
		"destinationId", "thumbnailURL", "photoCount", "reviewCount",
		"seoType", "pageTitle", "seoId", "productCount", "thumbnailHiResURL",
		"primaryDestinationId", "primaryDestinationName", "descriptionIntro",
		"descriptionText", "showPhotos", "attractionLatitude",
		"attractionLongitude", "attractionStreetAddress", "attractionCity",
		"attractionState", "keywordCount", "overviewSummary",
		"pagePrimaryLanguage", "tabTitle", "showReviews" })

public class SeoDetailInfo implements Serializable
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1890486133271737503L;

	@JsonProperty("panoramaCount")
	private Integer panoramaCount;
	
	@JsonProperty("webURL")
	private String webURL;
	
	@JsonProperty("userName")
	private String userName;
	
	@JsonProperty("publishedDate")
	private String publishedDate;
	
	@JsonProperty("userPhotos")
	private List<UserPhoto> userPhotos = new ArrayList<UserPhoto>();
	
	@JsonProperty("reviews")
	private List<UserReview> reviews = new ArrayList<UserReview>();
	
	@JsonProperty("products")
	private List<SeoProduct> products = new ArrayList<SeoProduct>();
	
	@JsonProperty("ratingCounts")
	private Map<String, Integer> ratingCounts;
	
	@JsonProperty("infoPageOverview1")
	private String infoPageOverview1;
	
	@JsonProperty("infoPageOverview2")
	private String infoPageOverview2;
	
	@JsonProperty("attractionAdmission")
	private String attractionAdmission;
	
	@JsonProperty("attractionTransit")
	private String attractionTransit;
	
	@JsonProperty("attractionOpenHours")
	private String attractionOpenHours;
	
	@JsonProperty("infoPageOverviewTitle1")
	private String infoPageOverviewTitle1;
	
	@JsonProperty("infoPageOverviewTitle2")
	private String infoPageOverviewTitle2;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("editorsPick")
	private Boolean editorsPick;
	
	@JsonProperty("keywords")
	private List<Keyword> keywords = new ArrayList<Keyword>();
	
	@JsonProperty("rating")
	private Float rating;
	@JsonProperty("destinationId")
	private Integer destinationId;
	@JsonProperty("thumbnailURL")
	private String thumbnailURL;
	@JsonProperty("photoCount")
	private Integer photoCount;
	@JsonProperty("reviewCount")
	private Integer reviewCount;
	@JsonProperty("seoType")
	private String seoType;
	@JsonProperty("pageTitle")
	private String pageTitle;
	@JsonProperty("seoId")
	private Integer seoId;
	@JsonProperty("productCount")
	private Integer productCount;
	@JsonProperty("thumbnailHiResURL")
	private String thumbnailHiResURL;
	@JsonProperty("primaryDestinationId")
	private Integer primaryDestinationId;
	@JsonProperty("primaryDestinationName")
	private String primaryDestinationName;
	@JsonProperty("descriptionIntro")
	private String descriptionIntro;
	@JsonProperty("descriptionText")
	private String descriptionText;
	@JsonProperty("showPhotos")
	private Boolean showPhotos;
	@JsonProperty("attractionLatitude")
	private Float attractionLatitude;
	@JsonProperty("attractionLongitude")
	private Float attractionLongitude;
	@JsonProperty("attractionStreetAddress")
	private String attractionStreetAddress;
	@JsonProperty("attractionCity")
	private String attractionCity;
	@JsonProperty("attractionState")
	private String attractionState;
	@JsonProperty("keywordCount")
	private Integer keywordCount;
	@JsonProperty("overviewSummary")
	private String overviewSummary;
	@JsonProperty("pagePrimaryLanguage")
	private String pagePrimaryLanguage;
	@JsonProperty("tabTitle")
	private String tabTitle;
	@JsonProperty("showReviews")
	private Boolean showReviews;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
	 * @return The userName
	 */
	@JsonProperty("userName")
	public String getUserName()
	{
		return userName;
	}

	/**
	 * 
	 * @param userName
	 *            The userName
	 */
	@JsonProperty("userName")
	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	/**
	 * 
	 * @return The publishedDate
	 */
	@JsonProperty("publishedDate")
	public String getPublishedDate()
	{
		return publishedDate;
	}

	/**
	 * 
	 * @param publishedDate
	 *            The publishedDate
	 */
	@JsonProperty("publishedDate")
	public void setPublishedDate(String publishedDate)
	{
		this.publishedDate = publishedDate;
	}

	/**
	 * 
	 * @return The userPhotos
	 */
	@JsonProperty("userPhotos")
	public List<UserPhoto> getUserPhotos()
	{
		return userPhotos;
	}

	/**
	 * 
	 * @param userPhotos
	 *            The userPhotos
	 */
	@JsonProperty("userPhotos")
	public void setUserPhotos(List<UserPhoto> userPhotos)
	{
		this.userPhotos = userPhotos;
	}

	/**
	 * 
	 * @return The reviews
	 */
	@JsonProperty("reviews")
	public List<UserReview> getReviews()
	{
		return reviews;
	}

	/**
	 * 
	 * @param reviews
	 *            The reviews
	 */
	@JsonProperty("reviews")
	public void setReviews(List<UserReview> reviews)
	{
		this.reviews = reviews;
	}

	/**
	 * 
	 * @return The products
	 */
	@JsonProperty("products")
	public List<SeoProduct> getProducts()
	{
		return products;
	}

	/**
	 * 
	 * @param products
	 *            The products
	 */
	@JsonProperty("products")
	public void setProducts(List<SeoProduct> products)
	{
		this.products = products;
	}

	/**
	 * 
	 * @return The ratingCounts
	 */
	@JsonProperty("ratingCounts")
	public Map<String, Integer> getRatingCounts()
	{
		return ratingCounts;
	}

	/**
	 * 
	 * @param ratingCounts
	 *            The ratingCounts
	 */
	@JsonProperty("ratingCounts")
	public void setRatingCounts(Map<String, Integer> ratingCounts)
	{
		this.ratingCounts = ratingCounts;
	}

	/**
	 * 
	 * @return The infoPageOverview1
	 */
	@JsonProperty("infoPageOverview1")
	public String getInfoPageOverview1()
	{
		return infoPageOverview1;
	}

	/**
	 * 
	 * @param infoPageOverview1
	 *            The infoPageOverview1
	 */
	@JsonProperty("infoPageOverview1")
	public void setInfoPageOverview1(String infoPageOverview1)
	{
		this.infoPageOverview1 = infoPageOverview1;
	}

	/**
	 * 
	 * @return The infoPageOverview2
	 */
	@JsonProperty("infoPageOverview2")
	public String getInfoPageOverview2()
	{
		return infoPageOverview2;
	}

	/**
	 * 
	 * @param infoPageOverview2
	 *            The infoPageOverview2
	 */
	@JsonProperty("infoPageOverview2")
	public void setInfoPageOverview2(String infoPageOverview2)
	{
		this.infoPageOverview2 = infoPageOverview2;
	}

	/**
	 * 
	 * @return The attractionAdmission
	 */
	@JsonProperty("attractionAdmission")
	public String getAttractionAdmission()
	{
		return attractionAdmission;
	}

	/**
	 * 
	 * @param attractionAdmission
	 *            The attractionAdmission
	 */
	@JsonProperty("attractionAdmission")
	public void setAttractionAdmission(String attractionAdmission)
	{
		this.attractionAdmission = attractionAdmission;
	}

	/**
	 * 
	 * @return The attractionTransit
	 */
	@JsonProperty("attractionTransit")
	public String getAttractionTransit()
	{
		return attractionTransit;
	}

	/**
	 * 
	 * @param attractionTransit
	 *            The attractionTransit
	 */
	@JsonProperty("attractionTransit")
	public void setAttractionTransit(String attractionTransit)
	{
		this.attractionTransit = attractionTransit;
	}

	/**
	 * 
	 * @return The attractionOpenHours
	 */
	@JsonProperty("attractionOpenHours")
	public String getAttractionOpenHours()
	{
		return attractionOpenHours;
	}

	/**
	 * 
	 * @param attractionOpenHours
	 *            The attractionOpenHours
	 */
	@JsonProperty("attractionOpenHours")
	public void setAttractionOpenHours(String attractionOpenHours)
	{
		this.attractionOpenHours = attractionOpenHours;
	}

	/**
	 * 
	 * @return The infoPageOverviewTitle1
	 */
	@JsonProperty("infoPageOverviewTitle1")
	public String getInfoPageOverviewTitle1()
	{
		return infoPageOverviewTitle1;
	}

	/**
	 * 
	 * @param infoPageOverviewTitle1
	 *            The infoPageOverviewTitle1
	 */
	@JsonProperty("infoPageOverviewTitle1")
	public void setInfoPageOverviewTitle1(String infoPageOverviewTitle1)
	{
		this.infoPageOverviewTitle1 = infoPageOverviewTitle1;
	}

	/**
	 * 
	 * @return The infoPageOverviewTitle2
	 */
	@JsonProperty("infoPageOverviewTitle2")
	public String getInfoPageOverviewTitle2()
	{
		return infoPageOverviewTitle2;
	}

	/**
	 * 
	 * @param infoPageOverviewTitle2
	 *            The infoPageOverviewTitle2
	 */
	@JsonProperty("infoPageOverviewTitle2")
	public void setInfoPageOverviewTitle2(String infoPageOverviewTitle2)
	{
		this.infoPageOverviewTitle2 = infoPageOverviewTitle2;
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
	 * @return The editorsPick
	 */
	@JsonProperty("editorsPick")
	public Boolean getEditorsPick()
	{
		return editorsPick;
	}

	/**
	 * 
	 * @param editorsPick
	 *            The editorsPick
	 */
	@JsonProperty("editorsPick")
	public void setEditorsPick(Boolean editorsPick)
	{
		this.editorsPick = editorsPick;
	}

	/**
	 * 
	 * @return The keywords
	 */
	@JsonProperty("keywords")
	public List<Keyword> getKeywords()
	{
		return keywords;
	}

	/**
	 * 
	 * @param keywords
	 *            The keywords
	 */
	@JsonProperty("keywords")
	public void setKeywords(List<Keyword> keywords)
	{
		this.keywords = keywords;
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
	 * @return The seoType
	 */
	@JsonProperty("seoType")
	public String getSeoType()
	{
		return seoType;
	}

	/**
	 * 
	 * @param seoType
	 *            The seoType
	 */
	@JsonProperty("seoType")
	public void setSeoType(String seoType)
	{
		this.seoType = seoType;
	}

	/**
	 * 
	 * @return The pageTitle
	 */
	@JsonProperty("pageTitle")
	public String getPageTitle()
	{
		return pageTitle;
	}

	/**
	 * 
	 * @param pageTitle
	 *            The pageTitle
	 */
	@JsonProperty("pageTitle")
	public void setPageTitle(String pageTitle)
	{
		this.pageTitle = pageTitle;
	}

	/**
	 * 
	 * @return The seoId
	 */
	@JsonProperty("seoId")
	public Integer getSeoId()
	{
		return seoId;
	}

	/**
	 * 
	 * @param seoId
	 *            The seoId
	 */
	@JsonProperty("seoId")
	public void setSeoId(Integer seoId)
	{
		this.seoId = seoId;
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
	 * @return The descriptionIntro
	 */
	@JsonProperty("descriptionIntro")
	public String getDescriptionIntro()
	{
		return descriptionIntro;
	}

	/**
	 * 
	 * @param descriptionIntro
	 *            The descriptionIntro
	 */
	@JsonProperty("descriptionIntro")
	public void setDescriptionIntro(String descriptionIntro)
	{
		this.descriptionIntro = descriptionIntro;
	}

	/**
	 * 
	 * @return The descriptionText
	 */
	@JsonProperty("descriptionText")
	public String getDescriptionText()
	{
		return descriptionText;
	}

	/**
	 * 
	 * @param descriptionText
	 *            The descriptionText
	 */
	@JsonProperty("descriptionText")
	public void setDescriptionText(String descriptionText)
	{
		this.descriptionText = descriptionText;
	}

	/**
	 * 
	 * @return The showPhotos
	 */
	@JsonProperty("showPhotos")
	public Boolean getShowPhotos()
	{
		return showPhotos;
	}

	/**
	 * 
	 * @param showPhotos
	 *            The showPhotos
	 */
	@JsonProperty("showPhotos")
	public void setShowPhotos(Boolean showPhotos)
	{
		this.showPhotos = showPhotos;
	}

	/**
	 * 
	 * @return The attractionLatitude
	 */
	@JsonProperty("attractionLatitude")
	public Float getAttractionLatitude()
	{
		return attractionLatitude;
	}

	/**
	 * 
	 * @param attractionLatitude
	 *            The attractionLatitude
	 */
	@JsonProperty("attractionLatitude")
	public void setAttractionLatitude(Float attractionLatitude)
	{
		this.attractionLatitude = attractionLatitude;
	}

	/**
	 * 
	 * @return The attractionLongitude
	 */
	@JsonProperty("attractionLongitude")
	public Float getAttractionLongitude()
	{
		return attractionLongitude;
	}

	/**
	 * 
	 * @param attractionLongitude
	 *            The attractionLongitude
	 */
	@JsonProperty("attractionLongitude")
	public void setAttractionLongitude(Float attractionLongitude)
	{
		this.attractionLongitude = attractionLongitude;
	}

	/**
	 * 
	 * @return The attractionStreetAddress
	 */
	@JsonProperty("attractionStreetAddress")
	public String getAttractionStreetAddress()
	{
		return attractionStreetAddress;
	}

	/**
	 * 
	 * @param attractionStreetAddress
	 *            The attractionStreetAddress
	 */
	@JsonProperty("attractionStreetAddress")
	public void setAttractionStreetAddress(String attractionStreetAddress)
	{
		this.attractionStreetAddress = attractionStreetAddress;
	}

	/**
	 * 
	 * @return The attractionCity
	 */
	@JsonProperty("attractionCity")
	public String getAttractionCity()
	{
		return attractionCity;
	}

	/**
	 * 
	 * @param attractionCity
	 *            The attractionCity
	 */
	@JsonProperty("attractionCity")
	public void setAttractionCity(String attractionCity)
	{
		this.attractionCity = attractionCity;
	}

	/**
	 * 
	 * @return The attractionState
	 */
	@JsonProperty("attractionState")
	public String getAttractionState()
	{
		return attractionState;
	}

	/**
	 * 
	 * @param attractionState
	 *            The attractionState
	 */
	@JsonProperty("attractionState")
	public void setAttractionState(String attractionState)
	{
		this.attractionState = attractionState;
	}

	/**
	 * 
	 * @return The keywordCount
	 */
	@JsonProperty("keywordCount")
	public Integer getKeywordCount()
	{
		return keywordCount;
	}

	/**
	 * 
	 * @param keywordCount
	 *            The keywordCount
	 */
	@JsonProperty("keywordCount")
	public void setKeywordCount(Integer keywordCount)
	{
		this.keywordCount = keywordCount;
	}

	/**
	 * 
	 * @return The overviewSummary
	 */
	@JsonProperty("overviewSummary")
	public String getOverviewSummary()
	{
		return overviewSummary;
	}

	/**
	 * 
	 * @param overviewSummary
	 *            The overviewSummary
	 */
	@JsonProperty("overviewSummary")
	public void setOverviewSummary(String overviewSummary)
	{
		this.overviewSummary = overviewSummary;
	}

	/**
	 * 
	 * @return The pagePrimaryLanguage
	 */
	@JsonProperty("pagePrimaryLanguage")
	public String getPagePrimaryLanguage()
	{
		return pagePrimaryLanguage;
	}

	/**
	 * 
	 * @param pagePrimaryLanguage
	 *            The pagePrimaryLanguage
	 */
	@JsonProperty("pagePrimaryLanguage")
	public void setPagePrimaryLanguage(String pagePrimaryLanguage)
	{
		this.pagePrimaryLanguage = pagePrimaryLanguage;
	}

	/**
	 * 
	 * @return The tabTitle
	 */
	@JsonProperty("tabTitle")
	public String getTabTitle()
	{
		return tabTitle;
	}

	/**
	 * 
	 * @param tabTitle
	 *            The tabTitle
	 */
	@JsonProperty("tabTitle")
	public void setTabTitle(String tabTitle)
	{
		this.tabTitle = tabTitle;
	}

	/**
	 * 
	 * @return The showReviews
	 */
	@JsonProperty("showReviews")
	public Boolean getShowReviews()
	{
		return showReviews;
	}

	/**
	 * 
	 * @param showReviews
	 *            The showReviews
	 */
	@JsonProperty("showReviews")
	public void setShowReviews(Boolean showReviews)
	{
		this.showReviews = showReviews;
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