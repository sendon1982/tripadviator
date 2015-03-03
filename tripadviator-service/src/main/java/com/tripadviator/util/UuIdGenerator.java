package com.tripadviator.util;

import java.util.Calendar;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UuIdGenerator 
{
    private static Log log = LogFactory.getLog(UuIdGenerator.class);
    
    /**
     * Generate UUID for User_Info, Company_Info, School unique ID stored in DB.
	 * 
     * @param source
     * @return
     */
    public static String generateKey(String source) 
    {
    	log.info("Entering the method generateKey()...");
    	
    	StringBuilder sb = new StringBuilder(500);
    	String currentTime = String.valueOf(Calendar.getInstance().getTimeInMillis());
    	sb.append(currentTime);
    	sb.append(source);
    	sb.append(SecureRandomGenerator.generateRandomToken());
    	
		log.info("Exiting the method generateKey()...");
		
		return UUID.nameUUIDFromBytes(sb.toString().getBytes()).toString();
	}
        
    public static void main(String[] args)
	{
		System.out.println(generateKey("sendon1982@gmail.com"));
	}
}
