package com.isoftstone.cxf.iteye.entry;

import java.io.Serializable;

public class User implements Serializable {

	private Integer id;

	private String name;

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = new Integer(id);
		this.name = name;
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

}
