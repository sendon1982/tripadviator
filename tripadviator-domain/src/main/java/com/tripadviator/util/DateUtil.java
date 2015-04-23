package com.tripadviator.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DateUtil 
{
    private static final Log log = LogFactory.getLog(DateUtil.class);
    
    private static final String UTC_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'+0000'";
    
    private static final String UTC_DATE_FORMAT = "yyyy-MM-dd";
    
    private static final String AM_PM_TIMEONLY = "h:mm a";
    
    private static final String HOUR_24_TIME = "HH:mm";
    
   
    public static String getUTCDateTime(Date date) 
    { 
        if(date == null) 
        { 
            return ""; 
        } 
        else 
        { 
            SimpleDateFormat dateFormatUTC = new SimpleDateFormat(UTC_DATE_TIME_FORMAT);
            return dateFormatUTC.format(date);
        }
    }
    
    
    public static String getUTCDate(Date date) 
    { 
        if(date == null) 
        { 
            return ""; 
        } 
        else 
        { 
            SimpleDateFormat dateFormatUTC = new SimpleDateFormat(UTC_DATE_FORMAT);
            return dateFormatUTC.format(date);
        } 
    }
    
    /**
     * Format the time into a nice am/pm string or use the 24 hour time if 
     * @param date
     * @param hour24time
     * @return
     */
    public static String getTimeFormatted(Date date, boolean hour24time) { 
        if(date == null)
        {
        	return ""; 
        }
            
        if(hour24time) 
        { 
            SimpleDateFormat format = new SimpleDateFormat(HOUR_24_TIME);
            return format.format(date);
        } 
        else 
        {  
            SimpleDateFormat format = new SimpleDateFormat(AM_PM_TIMEONLY);
            return format.format(date);
        }
    }

    public static Date getDateFromUTC(String utcDate) 
    {
        try 
        { 
            SimpleDateFormat dateFormatUTC = new SimpleDateFormat(UTC_DATE_FORMAT);
            return dateFormatUTC.parse(utcDate);
        } 
        catch(Exception ex) 
        { 
            log.error("Could not parse the string as a utc date!", ex); 
            throw new RuntimeException("Problem parsing UTC date format!"); 
        }
    }
    
    public static Date getDateTimeFromUTC(String utcDateTime) 
    {
        try 
        { 
            SimpleDateFormat dateFormatUTC = new SimpleDateFormat(UTC_DATE_TIME_FORMAT);
            return dateFormatUTC.parse(utcDateTime);
        } 
        catch(Exception ex) 
        { 
            log.error("Could not parse the string as a utc date time!", ex); 
            throw new RuntimeException("Problem parsing UTC date time format!"); 
        }
    }

    /**
     * Given a numeric "date piece" pad with 0 if more than the no
     * @param date
     * @return 
     */
    public static String padDate(int date) 
    { 
        if(date < 10) 
        { 
            return "0" + date;
        } 
        else 
        { 
            return "" + date;   
        } 
    }
    

	/**
	 * Get current date/time
	 * 
	 * @return
	 */
	public static Date getCurrentDate()
	{
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}
    
}
