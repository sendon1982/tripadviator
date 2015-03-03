package com.tripadviator.dao.mongo.user;

import com.tripadviator.domain.user.User;

public interface UserRepository
{
	public User save(User user);
	
	/**
	 * Get user by id
	 *   
	 * @param id
	 * @return
	 */
	public User getUserById(String id);
	
	/**
	 * Get user by email address
	 *   
	 * @param email
	 * @return
	 */
	public User getUserByEmail(String email);
	
	
}
