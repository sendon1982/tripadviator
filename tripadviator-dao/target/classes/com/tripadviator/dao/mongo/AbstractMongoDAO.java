package com.tripadviator.dao.mongo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.tripadviator.dao.DAO;

public class AbstractMongoDAO implements DAO 
{
	private static final Log log = LogFactory.getLog(AbstractMongoDAO.class);
	
	private static final String DASH = "-";
	
	@Autowired
	private MongoTemplate mongoTemplate;

	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

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
	public Integer getSizeFromTopX(String topX)
	{
		String[] arrayTopX = topX.split(DASH);
		Integer startIndex = Integer.parseInt(arrayTopX[0]);
		Integer endIndex = Integer.parseInt(arrayTopX[1]);
		
		log.info(String.format("Parsing topX [%s] into startIndex [%s] and endIndex [%s]", topX, startIndex, endIndex));

		Integer result = endIndex - startIndex + 1;
		
		log.info(String.format("Size from topX [%s] is [%s]", topX, result));
		
		return result;
	}
}
