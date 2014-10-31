package com.tripadviator.serivce.product.response;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.tripadviator.serivce.base.AbstractBean;

public class Product extends AbstractBean
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4456358576744195992L;
	
	@Id
	private Long id;

	private int sortOrder;
	
	public String supplierName;
	
	public String currencyCode;
	
	public List<Integer> catIds;
	
	public List<Integer> subCatIds;
	
	public String webURL;
	
	public String specialReservationDetails;
	
	public int panoramaCount;
	
	public boolean merchantCancellable;
	
	public String bookingEngineId;
	
	public String duration;
	
	public String shortDescription;
	
	
	public String code;
	public String supplierCode;
	public String title;
	
	public String thumbnailURL;
	public boolean specialReservation;
	public int photoCount;
	public int reviewCount;
	public int rating;
	public int videoCount;
	public boolean onSale;
	
	
	public String shortTitle;
	public int translationLevel;
	public int primaryDestinationId;
	public int primaryDestinationName;
	public int rrp;
	public String rrpformatted;
	public double price;
	public String priceFormatted;
	public int merchantNetPriceFrom;
	public String merchantNetPriceFromFormatted;
	public int savingAmount;
	public String savingAmountFormated;
	public boolean specialOfferAvailable;
	public String thumbnailHiResURL;
	
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public List<Integer> getCatIds() {
		return catIds;
	}
	public void setCatIds(List<Integer> catIds) {
		this.catIds = catIds;
	}
	public List<Integer> getSubCatIds() {
		return subCatIds;
	}
	public void setSubCatIds(List<Integer> subCatIds) {
		this.subCatIds = subCatIds;
	}
	public String getWebURL() {
		return webURL;
	}
	public void setWebURL(String webURL) {
		this.webURL = webURL;
	}
	public String getSpecialReservationDetails() {
		return specialReservationDetails;
	}
	public void setSpecialReservationDetails(String specialReservationDetails) {
		this.specialReservationDetails = specialReservationDetails;
	}
	public int getPanoramaCount() {
		return panoramaCount;
	}
	public void setPanoramaCount(int panoramaCount) {
		this.panoramaCount = panoramaCount;
	}
	public boolean isMerchantCancellable() {
		return merchantCancellable;
	}
	public void setMerchantCancellable(boolean merchantCancellable) {
		this.merchantCancellable = merchantCancellable;
	}
	public String getBookingEngineId() {
		return bookingEngineId;
	}
	public void setBookingEngineId(String bookingEngineId) {
		this.bookingEngineId = bookingEngineId;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSupplierCode() {
		return supplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
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
	public boolean isSpecialReservation() {
		return specialReservation;
	}
	public void setSpecialReservation(boolean specialReservation) {
		this.specialReservation = specialReservation;
	}
	public int getPhotoCount() {
		return photoCount;
	}
	public void setPhotoCount(int photoCount) {
		this.photoCount = photoCount;
	}
	public int getReviewCount() {
		return reviewCount;
	}
	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getVideoCount() {
		return videoCount;
	}
	public void setVideoCount(int videoCount) {
		this.videoCount = videoCount;
	}
	public boolean isOnSale() {
		return onSale;
	}
	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}
	public String getShortTitle() {
		return shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}
	public int getTranslationLevel() {
		return translationLevel;
	}
	public void setTranslationLevel(int translationLevel) {
		this.translationLevel = translationLevel;
	}
	public int getPrimaryDestinationId() {
		return primaryDestinationId;
	}
	public void setPrimaryDestinationId(int primaryDestinationId) {
		this.primaryDestinationId = primaryDestinationId;
	}
	public int getPrimaryDestinationName() {
		return primaryDestinationName;
	}
	public void setPrimaryDestinationName(int primaryDestinationName) {
		this.primaryDestinationName = primaryDestinationName;
	}
	public int getRrp() {
		return rrp;
	}
	public void setRrp(int rrp) {
		this.rrp = rrp;
	}
	public String getRrpformatted() {
		return rrpformatted;
	}
	public void setRrpformatted(String rrpformatted) {
		this.rrpformatted = rrpformatted;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPriceFormatted() {
		return priceFormatted;
	}
	public void setPriceFormatted(String priceFormatted) {
		this.priceFormatted = priceFormatted;
	}
	public int getMerchantNetPriceFrom() {
		return merchantNetPriceFrom;
	}
	public void setMerchantNetPriceFrom(int merchantNetPriceFrom) {
		this.merchantNetPriceFrom = merchantNetPriceFrom;
	}
	public String getMerchantNetPriceFromFormatted() {
		return merchantNetPriceFromFormatted;
	}
	public void setMerchantNetPriceFromFormatted(
			String merchantNetPriceFromFormatted) {
		this.merchantNetPriceFromFormatted = merchantNetPriceFromFormatted;
	}
	public int getSavingAmount() {
		return savingAmount;
	}
	public void setSavingAmount(int savingAmount) {
		this.savingAmount = savingAmount;
	}
	public String getSavingAmountFormated() {
		return savingAmountFormated;
	}
	public void setSavingAmountFormated(String savingAmountFormated) {
		this.savingAmountFormated = savingAmountFormated;
	}
	public boolean isSpecialOfferAvailable() {
		return specialOfferAvailable;
	}
	public void setSpecialOfferAvailable(boolean specialOfferAvailable) {
		this.specialOfferAvailable = specialOfferAvailable;
	}
	public String getThumbnailHiResURL() {
		return thumbnailHiResURL;
	}
	public void setThumbnailHiResURL(String thumbnailHiResURL) {
		this.thumbnailHiResURL = thumbnailHiResURL;
	}

	
}
