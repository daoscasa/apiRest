package com.ibm.model;

public class User {
	private Integer Id;
	private String userName;
	private String name;
	private Property[] idProperty;
	private Integer rating;
	
	public User(){
		
	}
	
	public User(Integer id, String userName, String name, Property[] idProperty, Integer rating) {
		super();
		Id = id;
		this.userName = userName;
		this.name = name;
		this.idProperty = idProperty;
		this.rating = rating;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Property[] getIds() {
		return idProperty;
	}

	public void setIds(Property[] ids) {
		this.idProperty = ids;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	
	

}
