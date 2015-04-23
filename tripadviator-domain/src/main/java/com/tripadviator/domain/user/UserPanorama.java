package com.tripadviator.domain.user;

import java.io.Serializable;

public class UserPanorama implements Serializable
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4477690575431842792L;
	
	private Long panoramaID;
	
	private String title;
	
	private String shhortDescription;
	
	private String panoramaSource;
	
	private Long panoramaSourceID;
	
	
	private boolean isEditorsPick;
	
	private String thumbnailURL;
	
	private String photoHiResURL;
	
    private String thumbnailSize; 
    
    private String thumbnailHiResSize; 
    
    private String thumbnailMediumSize ;
    
    public UserPanorama() 
    {

    }
    
    public UserPanorama(String thumbnailSize, String thumbnailHiResSize, String thumbnailMediumSize) 
    {
        this.thumbnailSize = thumbnailSize; 
        this.thumbnailHiResSize = thumbnailHiResSize;
        this.thumbnailMediumSize = thumbnailMediumSize ;
    }

	public Long getPanoramaID()
	{
		return panoramaID;
	}

	public void setPanoramaID(Long panoramaID)
	{
		this.panoramaID = panoramaID;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getShhortDescription()
	{
		return shhortDescription;
	}

	public void setShhortDescription(String shhortDescription)
	{
		this.shhortDescription = shhortDescription;
	}

	public String getPanoramaSource()
	{
		return panoramaSource;
	}

	public void setPanoramaSource(String panoramaSource)
	{
		this.panoramaSource = panoramaSource;
	}

	public Long getPanoramaSourceID()
	{
		return panoramaSourceID;
	}

	public void setPanoramaSourceID(Long panoramaSourceID)
	{
		this.panoramaSourceID = panoramaSourceID;
	}

	public boolean isEditorsPick()
	{
		return isEditorsPick;
	}

	public void setEditorsPick(boolean isEditorsPick)
	{
		this.isEditorsPick = isEditorsPick;
	}

	public String getThumbnailURL()
	{
		return thumbnailURL;
	}

	public void setThumbnailURL(String thumbnailURL)
	{
		this.thumbnailURL = thumbnailURL;
	}

	public String getPhotoHiResURL()
	{
		return photoHiResURL;
	}

	public void setPhotoHiResURL(String photoHiResURL)
	{
		this.photoHiResURL = photoHiResURL;
	}

	public String getThumbnailSize()
	{
		return thumbnailSize;
	}

	public void setThumbnailSize(String thumbnailSize)
	{
		this.thumbnailSize = thumbnailSize;
	}

	public String getThumbnailHiResSize()
	{
		return thumbnailHiResSize;
	}

	public void setThumbnailHiResSize(String thumbnailHiResSize)
	{
		this.thumbnailHiResSize = thumbnailHiResSize;
	}

	public String getThumbnailMediumSize()
	{
		return thumbnailMediumSize;
	}

	public void setThumbnailMediumSize(String thumbnailMediumSize)
	{
		this.thumbnailMediumSize = thumbnailMediumSize;
	}
    
}
