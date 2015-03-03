package com.tripadviator.serivce.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.tripadviator.dao.mongo.user.UserRepository;
import com.tripadviator.domain.user.User;
import com.tripadviator.serivce.exception.UserDuplicateException;
import com.tripadviator.util.UuIdGenerator;


/**
 * Import product information from Viator API service:
 * 
 * URL: http://viatorapi.viator.com/service/content/account/signin
 * 
 * @author Ming
 *
 */
@Service("userService")
public class UserService 
{
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	/**
	 * Users registered for the web site during which their information will be saved into DB.
	 * 
	 * @param user
	 * @return
	 */
	public User signUp(User user)
	{
		user.setUserId(UuIdGenerator.generateKey(user.getEmail()));
		user.setSalt(user.getEmail());
		
		// Encode user's password with salt based on user's Email address
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		try
		{			
			userRepository.save(user);
		}
		catch (DuplicateKeyException e)
		{
			logger.error("Already existing PK", e);
			
			// Try to insert the record again with new UUID by field "displayName"
			try
			{			
				user.setUserId(UuIdGenerator.generateKey(user.getEmail()));
				userRepository.save(user);
			}
			catch (DataIntegrityViolationException ex)
			{
				logger.error("DataIntegrityViolationException", ex);
				throw new UserDuplicateException("Email for the user to register already exists.", ex);
			}
		}
		
		logger.info(String.format("A new user User [%s] just sign in", user.getEmail()));
		
		return user;
	}
	
	public void signIn()
	{
		
	}
	
	
}
