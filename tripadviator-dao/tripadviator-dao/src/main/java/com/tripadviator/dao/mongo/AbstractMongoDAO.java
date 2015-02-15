package com.tripadviator.dao.mongo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tripadviator.dao.DAO;

public class AbstractMongoDAO implements DAO 
{
	private static final Log log = LogFactory.getLog(AbstractMongoDAO.class);
	
	private static final String DASH = "-";

	@Override
	public <T> T queryForObject(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> void save(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> void update(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> void delete(T t) {
		// TODO Auto-generated method stub

	}

	/**
	 * TopX will be in this format [startIndex-endIndex], like "1-10", "1-100"
	 * 
	 * @param topX
	 * @return
	 */
	public Long getSizeFromTopX(String topX)
	{
		String[] arrayTopX = topX.split(DASH);
		Long startIndex = Long.parseLong(arrayTopX[0]);
		Long endIndex = Long.parseLong(arrayTopX[1]);
		
		log.info(String.format("Parsing topX [%s] into startIndex [%s] and endIndex [%s]", topX, startIndex, endIndex));

		long result = endIndex - startIndex + 1;
		
		log.info(String.format("Size from topX [%s] is [%s]", topX, result));
		
		return result;
	}
}
