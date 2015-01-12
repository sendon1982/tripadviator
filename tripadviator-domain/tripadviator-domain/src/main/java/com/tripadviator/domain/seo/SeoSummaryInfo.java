package com.tripadviator.domain.seo;

import java.io.Serializable;

public class SeoSummaryInfo implements Serializable
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -777653496561085949L;

	private Integer sortOrder;
	
	private Integer panoramaCount;
	
	private String webURL;
	
	private String userName;
	
	private String publishedDate;
	
	private String title;
	
	private Integer rating;
	
	private Integer destinationId;
	
	private String thumbnailURL;
	
	private Integer photoCount;
	
	private Integer reviewCount;
	
	private String seoType;
	
	private String pageTitle;
	
	private Integer seoId;
	
	private Integer productCount;
	
	private boolean editorsPick;
	
	private Keyword keywords;
	
	private Integer primaryDestinationId;
	
	private String primaryDestinationName;
	
	private String thumbnailHiResURL;
	
	private boolean showPhotos;
	
	private String tabTitle;
	
	private String descriptionIntro;
	
	private String descriptionText;
	
	private boolean showReviews;
	
	private Double attractionLatitude;
	
	private Double attractionLongitude;
	
	private String attractionStreetAddress;
	
	private String attractionCity;
	
	private String attractionState;
	
	private Integer keywordCount;
	
	private String overviewSummary;
	
	private String pagePrimaryLanguage;

	public Integer getSortOrder()
	{
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder)
	{
		this.sortOrder = sortOrder;
	}

	public Integer getPanoramaCount()
	{
		return panoramaCount;
	}

	public void setPanoramaCount(Integer panoramaCount)
	{
		this.panoramaCount = panoramaCount;
	}

	public String getWebURL()
	{
		return webURL;
	}

	public void setWebURL(String webURL)
	{
		this.webURL = webURL;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPublishedDate()
	{
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate)
	{
		this.publishedDate = publishedDate;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public Integer getRating()
	{
		return rating;
	}

	public void setRating(Integer rating)
	{
		this.rating = rating;
	}

	public Integer getDestinationId()
	{
		return destinationId;
	}

	public void setDestinationId(Integer destinationId)
	{
		this.destinationId = destinationId;
	}

	public String getThumbnailURL()
	{
		return thumbnailURL;
	}

	public void setThumbnailURL(String thumbnailURL)
	{
		this.thumbnailURL = thumbnailURL;
	}

	public Integer getPhotoCount()
	{
		return photoCount;
	}

	public void setPhotoCount(Integer photoCount)
	{
		this.photoCount = photoCount;
	}

	public Integer getReviewCount()
	{
		return reviewCount;
	}

	public void setReviewCount(Integer reviewCount)
	{
		this.reviewCount = reviewCount;
	}

	public String getSeoType()
	{
		return seoType;
	}

	public void setSeoType(String seoType)
	{
		this.seoType = seoType;
	}

	public String getPageTitle()
	{
		return pageTitle;
	}

	public void setPageTitle(String pageTitle)
	{
		this.pageTitle = pageTitle;
	}

	public Integer getSeoId()
	{
		return seoId;
	}

	public void setSeoId(Integer seoId)
	{
		this.seoId = seoId;
	}

	public Integer getProductCount()
	{
		return productCount;
	}

	public void setProductCount(Integer productCount)
	{
		this.productCount = productCount;
	}

	public boolean isEditorsPick()
	{
		return editorsPick;
	}

	public void setEditorsPick(boolean editorsPick)
	{
		this.editorsPick = editorsPick;
	}

	public Keyword getKeywords()
	{
		return keywords;
	}

	public void setKeywords(Keyword keywords)
	{
		this.keywords = keywords;
	}

	public Integer getPrimaryDestinationId()
	{
		return primaryDestinationId;
	}

	public void setPrimaryDestinationId(Integer primaryDestinationId)
	{
		this.primaryDestinationId = primaryDestinationId;
	}

	public String getPrimaryDestinationName()
	{
		return primaryDestinationName;
	}

	public void setPrimaryDestinationName(String primaryDestinationName)
	{
		this.primaryDestinationName = primaryDestinationName;
	}

	public String getThumbnailHiResURL()
	{
		return thumbnailHiResURL;
	}

	public void setThumbnailHiResURL(String thumbnailHiResURL)
	{
		this.thumbnailHiResURL = thumbnailHiResURL;
	}

	public boolean isShowPhotos()
	{
		return showPhotos;
	}

	public void setShowPhotos(boolean showPhotos)
	{
		this.showPhotos = showPhotos;
	}

	public String getTabTitle()
	{
		return tabTitle;
	}

	public void setTabTitle(String tabTitle)
	{
		this.tabTitle = tabTitle;
	}

	public String getDescriptionIntro()
	{
		return descriptionIntro;
	}

	public void setDescriptionIntro(String descriptionIntro)
	{
		this.descriptionIntro = descriptionIntro;
	}

	public String getDescriptionText()
	{
		return descriptionText;
	}

	public void setDescriptionText(String descriptionText)
	{
		this.descriptionText = descriptionText;
	}

	public boolean isShowReviews()
	{
		return showReviews;
	}

	public void setShowReviews(boolean showReviews)
	{
		this.showReviews = showReviews;
	}

	public Double getAttractionLatitude()
	{
		return attractionLatitude;
	}

	public void setAttractionLatitude(Double attractionLatitude)
	{
		this.attractionLatitude = attractionLatitude;
	}

	public Double getAttractionLongitude()
	{
		return attractionLongitude;
	}

	public void setAttractionLongitude(Double attractionLongitude)
	{
		this.attractionLongitude = attractionLongitude;
	}

	public String getAttractionStreetAddress()
	{
		return attractionStreetAddress;
	}

	public void setAttractionStreetAddress(String attractionStreetAddress)
	{
		this.attractionStreetAddress = attractionStreetAddress;
	}

	public String getAttractionCity()
	{
		return attractionCity;
	}

	public void setAttractionCity(String attractionCity)
	{
		this.attractionCity = attractionCity;
	}

	public String getAttractionState()
	{
		return attractionState;
	}

	public void setAttractionState(String attractionState)
	{
		this.attractionState = attractionState;
	}

	public Integer getKeywordCount()
	{
		return keywordCount;
	}

	public void setKeywordCount(Integer keywordCount)
	{
		this.keywordCount = keywordCount;
	}

	public String getOverviewSummary()
	{
		return overviewSummary;
	}

	public void setOverviewSummary(String overviewSummary)
	{
		this.overviewSummary = overviewSummary;
	}

	public String getPagePrimaryLanguage()
	{
		return pagePrimaryLanguage;
	}

	public void setPagePrimaryLanguage(String pagePrimaryLanguage)
	{
		this.pagePrimaryLanguage = pagePrimaryLanguage;
	}
	
	
}
