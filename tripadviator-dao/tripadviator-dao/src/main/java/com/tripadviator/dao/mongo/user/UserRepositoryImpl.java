package com.tripadviator.dao.mongo.user;

import org.springframework.stereotype.Repository;

import com.tripadviator.dao.mongo.AbstractMongoDAO;
import com.tripadviator.domain.user.User;

@Repository("userRepository")
public class UserRepositoryImpl extends AbstractMongoDAO implements UserRepository 
{
	@Override
	public User save(User s) 
	{
		getMongoTemplate().save(s);

		// Fetch the user by its email and return to the calling method
		return getUserByEmail(s.getEmail());
	}

	@Override
	public User getUserById(String id) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail(String email) 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
