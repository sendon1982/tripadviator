package com.tripadviator.domain.user;

public enum Gender 
{
	MALE("M", "Male"),
	FEMAILE("F", "Female");
	
	private String symbal;
	public String getSymbal() {
		return symbal;
	}

	public void setSymbal(String symbal) {
		this.symbal = symbal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	private Gender(String symbal, String name)
	{
		this.symbal = symbal;
		this.name = name;
	}
	
	
}
