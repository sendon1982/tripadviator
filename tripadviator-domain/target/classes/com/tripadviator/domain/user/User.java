package com.tripadviator.domain.user;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tripadviator.domain.AbstractEntity;

@Document(collection = "user_detail")
@JsonIgnoreProperties(ignoreUnknown=true)
public class User extends AbstractEntity implements Serializable
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1477966376530895773L;
	
	private String userId;
	
	private String email;

	private String userName;
	
	private String salt;
	
	private String password;

	private String firstName;
	
	private String lastName;
	
	private Gender gender;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
