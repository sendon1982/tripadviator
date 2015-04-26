package com.tripadviator.dao;

public interface DAO 
{
	public abstract <T> T queryForObject(T t);
	
	public abstract <T> void save(T t);
	
	public abstract <T> void update(T t);
	
	public abstract <T> void delete(T t);
}
