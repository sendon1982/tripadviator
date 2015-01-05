package com.tripadviator.domain.user;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tripadviator.domain.AbstractEntity;

@Document(collection = "product_user_review")
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserReview extends AbstractEntity implements Serializable
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1335483474686304105L;
	
	private Integer sortOrder;
	
	private String ownerName;
	
	private String ownerCountry;
	
	private String productTitle;
	
	private String ownerAvatarURL;
	
	private String productCode;
	
	private String review;
	
	private Integer rating;
	
	private String publishedDate;
	
	private Long ownerId;
	
	private String viatorFeedback;
	
	private Long reviewId;
	
	private String submissionDate;
	
	private String viatorNotes;

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

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getViatorFeedback() {
		return viatorFeedback;
	}

	public void setViatorFeedback(String viatorFeedback) {
		this.viatorFeedback = viatorFeedback;
	}

	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public String getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getViatorNotes() {
		return viatorNotes;
	}

	public void setViatorNotes(String viatorNotes) {
		this.viatorNotes = viatorNotes;
	}

}
