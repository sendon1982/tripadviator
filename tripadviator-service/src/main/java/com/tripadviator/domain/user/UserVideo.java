package com.tripadviator.domain.user;

import java.io.Serializable;

public class UserVideo implements Serializable
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -417619617875542671L;

	
	/**

source: "YOUTUBE",
description: "Take an exhilarating helicopter flight from Las Vegas to the Grand Canyon West Rim. Fly over Lake Mead and Hoover Dam before landing deep in the canyon for a Champagne picnic. On your return, fly low over the famous Las Vegas Strip. When you land, your limousine will whisk you back to your hotel.",
shortDescription: "Take an exhilarating helicopter flight from Las Vegas to the Grand Canyon West Rim. Fly over Lake Mead and Hoover Dam before landing deep in the canyon for a Champagne picnic. On your return, fly low over the famous Las Vegas Strip. When you land, your limousine will whisk you back to your hotel.",
productCode: "2280AAHT",
title: "Grand Canyon All-American Helicopter Tour",
thumbnailURL: "http://cache.graphicslib.viator.com/graphicslib/mm/30/grand-canyon-all-american-helicopter-tour-154230-154tall.jpg",
ownerId: -1,
videoId: "nQrmGx8hT84?vq=hd720",
photoHiResURL: "http://cache.graphicslib.viator.com/graphicslib/mm/30/grand-canyon-all-american-helicopter-tour-154230-1004x522.jpg",
copyright: "",
thumbnailMediumURL: "http://cache.graphicslib.viator.com/graphicslib/mm/30/grand-canyon-all-american-helicopter-tour-154230-580x302.jpg"
	 */
	
	private Integer sortOrder;
	
	private String ownerName;
	
	private String ownerCountry;
	
	private String productTitle;
	
	private String ownerAvatarURL;
	
	private boolean privateFlag;
	
	private String source;
	
	private String description;
	
	private String shortDescription;
	
	private String productCode;
	
	private String title;
	
	private String thumbnailURL;
	
	private Long ownerId;
	
	private String videoId;
	
	private String photoHiResURL;
	
	private String copyright;
	
	private String thumbnailMediumURL;

	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerCountry() {
		return ownerCountry;
	}

	public void setOwnerCountry(String ownerCountry) {
		this.ownerCountry = ownerCountry;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getOwnerAvatarURL() {
		return ownerAvatarURL;
	}

	public void setOwnerAvatarURL(String ownerAvatarURL) {
		this.ownerAvatarURL = ownerAvatarURL;
	}

	public boolean isPrivate() {
		return privateFlag;
	}

	public void setPrivate(boolean privateFlag) {
		this.privateFlag = privateFlag;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnailURL() {
		return thumbnailURL;
	}

	public void setThumbnailURL(String thumbnailURL) {
		this.thumbnailURL = thumbnailURL;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getPhotoHiResURL() {
		return photoHiResURL;
	}

	public void setPhotoHiResURL(String photoHiResURL) {
		this.photoHiResURL = photoHiResURL;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getThumbnailMediumURL() {
		return thumbnailMediumURL;
	}

	public void setThumbnailMediumURL(String thumbnailMediumURL) {
		this.thumbnailMediumURL = thumbnailMediumURL;
	}
	
	
	
}
