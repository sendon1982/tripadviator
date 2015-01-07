package com.tripadviator.domain.booking;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.Serializable;

import com.tripadviator.util.DateUtil;

public class ProductAvailability implements Serializable
{
	
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3235726305929883614L;
	
	private String productCode; 
	
    private Date firstAvailableDate;
    
    private Date lastAvailableDate;
    
    private List<TourGradeAvailability> availability;
    
    public ProductAvailability() 
    {
    	
    }
    
    public ProductAvailability(String productCode, Date firstAvailableDate, Date lastAvailableDate) 
    { 
        this.productCode = productCode; 
        this.firstAvailableDate = firstAvailableDate;
        this.lastAvailableDate = lastAvailableDate; 
    }
    
    public String getLastAvailableDate() 
    {
        return  DateUtil.getUTCDate(lastAvailableDate);
    }
    
    public void setLastAvailableDate(Date lastAvailDate) 
    {
        this.lastAvailableDate = lastAvailDate;
    }
    
    public String getProductCode() 
    {
        return productCode;
    }
    
    public void setProductCode(String productCode) 
    {
        this.productCode = productCode;
    }
    
    public String getFirstAvailableDate() 
    {
            return DateUtil.getUTCDate(firstAvailableDate);
    }
    
    public void setFirstAvailableDate(Date firstAvailableDate) 
    {
        this.firstAvailableDate = firstAvailableDate;
    }
    
    public List<TourGradeAvailability> getAvailability() 
    {
        if(availability == null)
        {
        	availability = new ArrayList<TourGradeAvailability>(); 
        }
        
        return availability;
    }
    
    public void setAvailability(List<TourGradeAvailability> availability) 
    {
        this.availability = availability;
    } 
}
