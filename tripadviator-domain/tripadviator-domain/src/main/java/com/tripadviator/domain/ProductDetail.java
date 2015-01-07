package com.tripadviator.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tripadviator.domain.user.UserPhoto;
import com.tripadviator.domain.user.UserReview;
import com.tripadviator.domain.user.UserVideo;

@Document(collection = "product_detail")
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProductDetail extends AbstractEntity implements Serializable
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4071975376981002902L;

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
	
	private String voucherRequirements;
	
	private boolean tourGradesAvailable;
	
	private boolean hotelPickup;
	
	private List<UserPhoto> userPhotos;
	
	private List<UserReview> reviews;
	
	private List<UserVideo> videos;
	
	private List<TourGrade> tourGrades;
	
	private List<AgeBand> ageBands;
	
	
	private List<BookingQuestion> bookingQuestions;
	
	private List<String> highlights;
	
	private List<String> salesPoints;
	
	private Map<Integer, Integer> ratingCounts;
	
	private String termsAndConditions;
	
	private String location;
	
	private String country;
	
	private String description;
	
	private String itinerary;
	
	private List<ProductPhoto> productPhotos;
	
	private String voucherOption;
	
	private Integer destinationId;
	
	private String city;
	
	private List<String> inclusions;
	
	private List<String> exclusions;
	
	private String region;
	
	private String operates;
	
	private String departurePoint;
	
	private String returnDetails;
	
	private String departureTime;
	
	private String departureTimeComments;
	
	private String mapURL;
	
	private List<String> additionalInfo;
	
	private String specialOffer;
	
	private String duration;
	
	private String shortDescription;
	
	private String code;
	
	private String supplierCode;
	
	private String title;
	
	private String thumbnailURL;
	
	private boolean specialReservation;
	
	private Integer photoCount;
	
	private Integer reviewCount;
	
	private Integer rating;
	
	private Integer videoCount;
	
	private boolean onSale;
	
	private String shortTitle;
	
	private Integer translationLevel;
	
	private Integer primaryDestinationId;
	
	private String primaryDestinationName;
	
	private Double rrp;
	
	private String rrpformatted;
	
	private Double price;
	
	private String priceFormatted;
	
	private Double merchantNetPriceFrom;
	
	private String merchantNetPriceFromFormatted;
	
	private Double savingAmount;
	
	private String savingAmountFormated;
	
	private boolean specialOfferAvailable;
	
	private String thumbnailHiResURL;

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

	public String getVoucherRequirements() {
		return voucherRequirements;
	}

	public void setVoucherRequirements(String voucherRequirements) {
		this.voucherRequirements = voucherRequirements;
	}

	public boolean isTourGradesAvailable() {
		return tourGradesAvailable;
	}

	public void setTourGradesAvailable(boolean tourGradesAvailable) {
		this.tourGradesAvailable = tourGradesAvailable;
	}

	public boolean isHotelPickup() {
		return hotelPickup;
	}

	public void setHotelPickup(boolean hotelPickup) {
		this.hotelPickup = hotelPickup;
	}

	public List<UserPhoto> getUserPhotos() {
		return userPhotos;
	}

	public void setUserPhotos(List<UserPhoto> userPhotos) {
		this.userPhotos = userPhotos;
	}

	public List<UserReview> getReviews() {
		return reviews;
	}

	public void setReviews(List<UserReview> reviews) {
		this.reviews = reviews;
	}

	public List<UserVideo> getVideos() {
		return videos;
	}

	public void setVideos(List<UserVideo> videos) {
		this.videos = videos;
	}

	public List<TourGrade> getTourGrades() {
		return tourGrades;
	}

	public void setTourGrades(List<TourGrade> tourGrades) {
		this.tourGrades = tourGrades;
	}

	public List<AgeBand> getAgeBands() {
		return ageBands;
	}

	public void setAgeBands(List<AgeBand> ageBands) {
		this.ageBands = ageBands;
	}

	public List<BookingQuestion> getBookingQuestions() {
		return bookingQuestions;
	}

	public void setBookingQuestions(List<BookingQuestion> bookingQuestions) {
		this.bookingQuestions = bookingQuestions;
	}

	public List<String> getHighlights() {
		return highlights;
	}

	public void setHighlights(List<String> highlights) {
		this.highlights = highlights;
	}

	public List<String> getSalesPoints() {
		return salesPoints;
	}

	public void setSalesPoints(List<String> salesPoints) {
		this.salesPoints = salesPoints;
	}

	public Map<Integer, Integer> getRatingCounts() {
		return ratingCounts;
	}

	public void setRatingCounts(Map<Integer, Integer> ratingCounts) {
		this.ratingCounts = ratingCounts;
	}

	public String getTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(String termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItinerary() {
		return itinerary;
	}

	public void setItinerary(String itinerary) {
		this.itinerary = itinerary;
	}

	public List<ProductPhoto> getProductPhotos() {
		return productPhotos;
	}

	public void setProductPhotos(List<ProductPhoto> productPhotos) {
		this.productPhotos = productPhotos;
	}

	public String getVoucherOption() {
		return voucherOption;
	}

	public void setVoucherOption(String voucherOption) {
		this.voucherOption = voucherOption;
	}

	public Integer getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(Integer destinationId) {
		this.destinationId = destinationId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getInclusions() {
		return inclusions;
	}

	public void setInclusions(List<String> inclusions) {
		this.inclusions = inclusions;
	}

	public List<String> getExclusions() {
		return exclusions;
	}

	public void setExclusions(List<String> exclusions) {
		this.exclusions = exclusions;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getOperates() {
		return operates;
	}

	public void setOperates(String operates) {
		this.operates = operates;
	}

	public String getDeparturePoint() {
		return departurePoint;
	}

	public void setDeparturePoint(String departurePoint) {
		this.departurePoint = departurePoint;
	}

	public String getReturnDetails() {
		return returnDetails;
	}

	public void setReturnDetails(String returnDetails) {
		this.returnDetails = returnDetails;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDepartureTimeComments() {
		return departureTimeComments;
	}

	public void setDepartureTimeComments(String departureTimeComments) {
		this.departureTimeComments = departureTimeComments;
	}

	public String getMapURL() {
		return mapURL;
	}

	public void setMapURL(String mapURL) {
		this.mapURL = mapURL;
	}

	public List<String> getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(List<String> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public String getSpecialOffer() {
		return specialOffer;
	}

	public void setSpecialOffer(String specialOffer) {
		this.specialOffer = specialOffer;
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

	public Integer getPhotoCount() {
		return photoCount;
	}

	public void setPhotoCount(Integer photoCount) {
		this.photoCount = photoCount;
	}

	public Integer getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(Integer reviewCount) {
		this.reviewCount = reviewCount;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getVideoCount() {
		return videoCount;
	}

	public void setVideoCount(Integer videoCount) {
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

	public Integer getTranslationLevel() {
		return translationLevel;
	}

	public void setTranslationLevel(Integer translationLevel) {
		this.translationLevel = translationLevel;
	}

	public Integer getPrimaryDestinationId() {
		return primaryDestinationId;
	}

	public void setPrimaryDestinationId(Integer primaryDestinationId) {
		this.primaryDestinationId = primaryDestinationId;
	}

	public String getPrimaryDestinationName() {
		return primaryDestinationName;
	}

	public void setPrimaryDestinationName(String primaryDestinationName) {
		this.primaryDestinationName = primaryDestinationName;
	}

	public Double getRrp() {
		return rrp;
	}

	public void setRrp(Double rrp) {
		this.rrp = rrp;
	}

	public String getRrpformatted() {
		return rrpformatted;
	}

	public void setRrpformatted(String rrpformatted) {
		this.rrpformatted = rrpformatted;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPriceFormatted() {
		return priceFormatted;
	}

	public void setPriceFormatted(String priceFormatted) {
		this.priceFormatted = priceFormatted;
	}

	public Double getMerchantNetPriceFrom() {
		return merchantNetPriceFrom;
	}

	public void setMerchantNetPriceFrom(Double merchantNetPriceFrom) {
		this.merchantNetPriceFrom = merchantNetPriceFrom;
	}

	public String getMerchantNetPriceFromFormatted() {
		return merchantNetPriceFromFormatted;
	}

	public void setMerchantNetPriceFromFormatted(
			String merchantNetPriceFromFormatted) {
		this.merchantNetPriceFromFormatted = merchantNetPriceFromFormatted;
	}

	public Double getSavingAmount() {
		return savingAmount;
	}

	public void setSavingAmount(Double savingAmount) {
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
