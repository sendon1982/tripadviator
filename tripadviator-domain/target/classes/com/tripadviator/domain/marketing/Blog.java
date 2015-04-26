package com.tripadviator.domain.marketing;

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
@JsonPropertyOrder(
{ "sortOrder", "title", "sourceURL", "author", "publicationDate", "link",
		"enclosureLength", "sequenceID", "enclosureType", "blogId",
		"enclosureURL", "tags", "description", "content" })
public class Blog
{

	@JsonProperty("sortOrder")
	private Integer sortOrder;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("sourceURL")
	private String sourceURL;
	
	@JsonProperty("author")
	private String author;
	
	@JsonProperty("publicationDate")
	private String publicationDate;
	
	@JsonProperty("link")
	private String link;
	
	@JsonProperty("enclosureLength")
	private Integer enclosureLength;
	
	@JsonProperty("sequenceID")
	private Integer sequenceID;
	
	@JsonProperty("enclosureType")
	private String enclosureType;
	
	@JsonProperty("blogId")
	private String blogId;
	
	@JsonProperty("enclosureURL")
	private String enclosureURL;
	
	@JsonProperty("tags")
	private String tags;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("content")
	private String content;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The sortOrder
	 */
	@JsonProperty("sortOrder")
	public Integer getSortOrder()
	{
		return sortOrder;
	}

	/**
	 * 
	 * @param sortOrder
	 *            The sortOrder
	 */
	@JsonProperty("sortOrder")
	public void setSortOrder(Integer sortOrder)
	{
		this.sortOrder = sortOrder;
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
	 * @return The sourceURL
	 */
	@JsonProperty("sourceURL")
	public String getSourceURL()
	{
		return sourceURL;
	}

	/**
	 * 
	 * @param sourceURL
	 *            The sourceURL
	 */
	@JsonProperty("sourceURL")
	public void setSourceURL(String sourceURL)
	{
		this.sourceURL = sourceURL;
	}

	/**
	 * 
	 * @return The author
	 */
	@JsonProperty("author")
	public String getAuthor()
	{
		return author;
	}

	/**
	 * 
	 * @param author
	 *            The author
	 */
	@JsonProperty("author")
	public void setAuthor(String author)
	{
		this.author = author;
	}

	/**
	 * 
	 * @return The publicationDate
	 */
	@JsonProperty("publicationDate")
	public String getPublicationDate()
	{
		return publicationDate;
	}

	/**
	 * 
	 * @param publicationDate
	 *            The publicationDate
	 */
	@JsonProperty("publicationDate")
	public void setPublicationDate(String publicationDate)
	{
		this.publicationDate = publicationDate;
	}

	/**
	 * 
	 * @return The link
	 */
	@JsonProperty("link")
	public String getLink()
	{
		return link;
	}

	/**
	 * 
	 * @param link
	 *            The link
	 */
	@JsonProperty("link")
	public void setLink(String link)
	{
		this.link = link;
	}

	/**
	 * 
	 * @return The enclosureLength
	 */
	@JsonProperty("enclosureLength")
	public Integer getEnclosureLength()
	{
		return enclosureLength;
	}

	/**
	 * 
	 * @param enclosureLength
	 *            The enclosureLength
	 */
	@JsonProperty("enclosureLength")
	public void setEnclosureLength(Integer enclosureLength)
	{
		this.enclosureLength = enclosureLength;
	}

	/**
	 * 
	 * @return The sequenceID
	 */
	@JsonProperty("sequenceID")
	public Integer getSequenceID()
	{
		return sequenceID;
	}

	/**
	 * 
	 * @param sequenceID
	 *            The sequenceID
	 */
	@JsonProperty("sequenceID")
	public void setSequenceID(Integer sequenceID)
	{
		this.sequenceID = sequenceID;
	}

	/**
	 * 
	 * @return The enclosureType
	 */
	@JsonProperty("enclosureType")
	public String getEnclosureType()
	{
		return enclosureType;
	}

	/**
	 * 
	 * @param enclosureType
	 *            The enclosureType
	 */
	@JsonProperty("enclosureType")
	public void setEnclosureType(String enclosureType)
	{
		this.enclosureType = enclosureType;
	}

	/**
	 * 
	 * @return The blogId
	 */
	@JsonProperty("blogId")
	public String getBlogId()
	{
		return blogId;
	}

	/**
	 * 
	 * @param blogId
	 *            The blogId
	 */
	@JsonProperty("blogId")
	public void setBlogId(String blogId)
	{
		this.blogId = blogId;
	}

	/**
	 * 
	 * @return The enclosureURL
	 */
	@JsonProperty("enclosureURL")
	public String getEnclosureURL()
	{
		return enclosureURL;
	}

	/**
	 * 
	 * @param enclosureURL
	 *            The enclosureURL
	 */
	@JsonProperty("enclosureURL")
	public void setEnclosureURL(String enclosureURL)
	{
		this.enclosureURL = enclosureURL;
	}

	/**
	 * 
	 * @return The tags
	 */
	@JsonProperty("tags")
	public String getTags()
	{
		return tags;
	}

	/**
	 * 
	 * @param tags
	 *            The tags
	 */
	@JsonProperty("tags")
	public void setTags(String tags)
	{
		this.tags = tags;
	}

	/**
	 * 
	 * @return The description
	 */
	@JsonProperty("description")
	public String getDescription()
	{
		return description;
	}

	/**
	 * 
	 * @param description
	 *            The description
	 */
	@JsonProperty("description")
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * 
	 * @return The content
	 */
	@JsonProperty("content")
	public String getContent()
	{
		return content;
	}

	/**
	 * 
	 * @param content
	 *            The content
	 */
	@JsonProperty("content")
	public void setContent(String content)
	{
		this.content = content;
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