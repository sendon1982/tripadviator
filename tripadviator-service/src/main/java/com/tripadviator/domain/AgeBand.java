package com.tripadviator.domain;

import java.io.Serializable;

public class AgeBand implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4453636322483432491L;

	private Integer sortOrder;
	
	private String description;
	
	private Integer count;
	
	private Integer ageFrom;
	
	private Integer ageTo;
	
	private boolean adult;
	
	private Integer bandId;
	
	private String pluralDescription;
	
	private boolean treatAsAdult;

	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getAgeFrom() {
		return ageFrom;
	}

	public void setAgeFrom(Integer ageFrom) {
		this.ageFrom = ageFrom;
	}

	public Integer getAgeTo() {
		return ageTo;
	}

	public void setAgeTo(Integer ageTo) {
		this.ageTo = ageTo;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public Integer getBandId() {
		return bandId;
	}

	public void setBandId(Integer bandId) {
		this.bandId = bandId;
	}

	public String getPluralDescription() {
		return pluralDescription;
	}

	public void setPluralDescription(String pluralDescription) {
		this.pluralDescription = pluralDescription;
	}

	public boolean isTreatAsAdult() {
		return treatAsAdult;
	}

	public void setTreatAsAdult(boolean treatAsAdult) {
		this.treatAsAdult = treatAsAdult;
	}
	
	
	
}
