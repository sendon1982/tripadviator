package com.tripadviator.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SecureRandomGenerator 
{
	// Default Algrithm "SHA1PRNG"
	private final static String TOKEN_PRNG = "SHA1PRNG";
	
	// Default Algrithm length is 32
	private final static int TOKEN_LENGTH = 32;
	
	private final static String TOKEN_LINK_SIGN = "-";
	
	// Source chars used to generate random and secure token
	private final static char[] CHARSET = new char[] { 'A', 'B', 'C', 'D', 'E',
			'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',  '0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 
			'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 
			'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	private SecureRandomGenerator() 
	{
		// Private method to avoid creating object by Constructor
	}

	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		throw new CloneNotSupportedException();
	}
	
	/**
	 * Generate a random and secure token with default PRNG and Length.
	 * 
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String generateRandomToken() 
	{
		return generateRandomToken(TOKEN_PRNG, TOKEN_LENGTH);
	}

	/**
	 * Generate a random and secure token.
	 * 
	 * @param prng
	 * @param length
	 * @return
	 */
	public static String generateRandomToken(String prng, int length) 
	{
		SecureRandom sr = null;
		
		try 
		{
			sr = SecureRandom.getInstance(prng);
		} 
		catch (NoSuchAlgorithmException e) 
		{
			e.printStackTrace();
		}
		
		return generateRandomSeq(sr, length);
	}

	/**
	 * Generate a random and secure sequence.
	 * 
	 * @param sr
	 * @param length
	 * @return
	 */
	private static String generateRandomSeq(SecureRandom sr, int length) 
	{
		// Maxium number is 256 for the security token
		StringBuilder sb = new StringBuilder(256);

		for (int i = 1; i < length + 1; i++) 
		{
			int index = sr.nextInt(CHARSET.length);
			char c = CHARSET[index];
			sb.append(c);

			if ((i % 4) == 0 && i != 0 && i < length) 
			{
				sb.append(TOKEN_LINK_SIGN);
			}
		}

		return sb.toString();
	}
}
