package com.tripadviator.domain;

import java.io.Serializable;
import java.util.Map;

public class TourGrade implements Serializable
{
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7801521955248927463L;

	private Integer sortOrder;
	
	private String currencyCode;
	
	private Map<String, String> langServices;
	
	private String gradeCode;
	
	private Double priceFrom;
	
	private Double merchantNetPriceFrom;
	
	private String merchantNetPriceFromFormatted;
	
	private String priceFromFormatted;
	
	private String gradeTitle;
	
	private String gradeDepartureTime;
	
	private String gradeDescription;
	
	private String defaultLanguageCode;
	
	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Map<String, String> getLangServices() {
		return langServices;
	}

	public void setLangServices(Map<String, String> langServices) {
		this.langServices = langServices;
	}

	public String getGradeCode() {
		return gradeCode;
	}

	public void setGradeCode(String gradeCode) {
		this.gradeCode = gradeCode;
	}

	public Double getPriceFrom() {
		return priceFrom;
	}

	public void setPriceFrom(Double priceFrom) {
		this.priceFrom = priceFrom;
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

	public String getPriceFromFormatted() {
		return priceFromFormatted;
	}

	public void setPriceFromFormatted(String priceFromFormatted) {
		this.priceFromFormatted = priceFromFormatted;
	}

	public String getGradeTitle() {
		return gradeTitle;
	}

	public void setGradeTitle(String gradeTitle) {
		this.gradeTitle = gradeTitle;
	}

	public String getGradeDepartureTime() {
		return gradeDepartureTime;
	}

	public void setGradeDepartureTime(String gradeDepartureTime) {
		this.gradeDepartureTime = gradeDepartureTime;
	}

	public String getGradeDescription() {
		return gradeDescription;
	}

	public void setGradeDescription(String gradeDescription) {
		this.gradeDescription = gradeDescription;
	}

	public String getDefaultLanguageCode() {
		return defaultLanguageCode;
	}

	public void setDefaultLanguageCode(String defaultLanguageCode) {
		this.defaultLanguageCode = defaultLanguageCode;
	}
}
