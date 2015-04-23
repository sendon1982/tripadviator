package com.tripadviator.domain.taxonomy;

import java.util.HashMap;
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
@JsonPropertyOrder({
"sortOrder",
"subcategoryName",
"subcategoryId",
"categoryId"
})
public class SubCategory {

@JsonProperty("sortOrder")
private Integer sortOrder;
@JsonProperty("subcategoryName")
private String subcategoryName;
@JsonProperty("subcategoryId")
private Integer subcategoryId;
@JsonProperty("categoryId")
private Integer categoryId;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The sortOrder
*/
@JsonProperty("sortOrder")
public Integer getSortOrder() {
return sortOrder;
}

/**
* 
* @param sortOrder
* The sortOrder
*/
@JsonProperty("sortOrder")
public void setSortOrder(Integer sortOrder) {
this.sortOrder = sortOrder;
}

/**
* 
* @return
* The subcategoryName
*/
@JsonProperty("subcategoryName")
public String getSubcategoryName() {
return subcategoryName;
}

/**
* 
* @param subcategoryName
* The subcategoryName
*/
@JsonProperty("subcategoryName")
public void setSubcategoryName(String subcategoryName) {
this.subcategoryName = subcategoryName;
}

/**
* 
* @return
* The subcategoryId
*/
@JsonProperty("subcategoryId")
public Integer getSubcategoryId() {
return subcategoryId;
}

/**
* 
* @param subcategoryId
* The subcategoryId
*/
@JsonProperty("subcategoryId")
public void setSubcategoryId(Integer subcategoryId) {
this.subcategoryId = subcategoryId;
}

/**
* 
* @return
* The categoryId
*/
@JsonProperty("categoryId")
public Integer getCategoryId() {
return categoryId;
}

/**
* 
* @param categoryId
* The categoryId
*/
@JsonProperty("categoryId")
public void setCategoryId(Integer categoryId) {
this.categoryId = categoryId;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}