package com.ibm.model;

public class Rooms {
	private Integer id;
	private String name;
	private Integer beds;
	private String details;
	private String Services;
		
	public Rooms() {
		
	}

	public Rooms(Integer id, String name, Integer beds, String details, String services) {
		super();
		this.id = id;
		this.name = name;
		this.beds = beds;
		this.details = details;
		Services = services;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBeds() {
		return beds;
	}

	public void setBeds(Integer beds) {
		this.beds = beds;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getServices() {
		return Services;
	}

	public void setServices(String services) {
		Services = services;
	}
	
	
	
}
