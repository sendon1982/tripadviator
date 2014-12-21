package com.tripadviator.domain.user;

import java.io.Serializable;

public class UserPhoto implements Serializable
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8289396040996852888L;
	
	private Integer sortOrder;

	private String ownerName;
	
	private String ownerCountry;
	
	private String productTitle;
	
	private String ownerAvatarURL;
	
	private String productCode;
	
	private String title;
	
	private String caption;
	
	private String thumbnailURL;
	
	private Integer ownerId;
	
	private boolean editorsPick;
	
	private Long photoId;
	
	private String photoURL;
	
	private String photoHiResURL;
	
	private String photoMediumResURL;
	
	private String timeUploaded;
	
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

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getThumbnailURL() {
		return thumbnailURL;
	}

	public void setThumbnailURL(String thumbnailURL) {
		this.thumbnailURL = thumbnailURL;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public boolean isEditorsPick() {
		return editorsPick;
	}

	public void setEditorsPick(boolean editorsPick) {
		this.editorsPick = editorsPick;
	}

	public Long getPhotoId() {
		return photoId;
	}

	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public String getPhotoHiResURL() {
		return photoHiResURL;
	}

	public void setPhotoHiResURL(String photoHiResURL) {
		this.photoHiResURL = photoHiResURL;
	}

	public String getPhotoMediumResURL() {
		return photoMediumResURL;
	}

	public void setPhotoMediumResURL(String photoMediumResURL) {
		this.photoMediumResURL = photoMediumResURL;
	}

	public String getTimeUploaded() {
		return timeUploaded;
	}

	public void setTimeUploaded(String timeUploaded) {
		this.timeUploaded = timeUploaded;
	}

}
