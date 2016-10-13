	package com.ibm.model;

public class Property {
	private Integer id;
	private String name;
	private String direction;
	private String[] services;
	private String details;
	private Rooms[] idRoom;
	
	public Property() {
	
	}

	public Property(Integer id, String name, String direction, String[] services, String details, Rooms[] idRoom) {
		super();
		this.id = id;
		this.name = name;
		this.direction = direction;
		this.services = services;
		this.details = details;
		this.idRoom = idRoom;
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

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String[] getServices() {
		return services;
	}

	public void setServices(String[] services) {
		this.services = services;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Rooms[] getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(Rooms[] idRoom) {
		this.idRoom = idRoom;
	}
	
	
	
	
	

}
