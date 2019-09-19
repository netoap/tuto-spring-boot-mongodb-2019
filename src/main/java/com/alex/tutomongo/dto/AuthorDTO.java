package com.alex.tutomongo.dto;

import java.io.Serializable;

import com.alex.tutomongo.domain.User;

public class AuthorDTO implements Serializable{
	
	private String id;
	private String name;
		
	public AuthorDTO() {
		super();
	}

	public AuthorDTO(User user) {
		super();
		this.setId(user.getId());
		this.setName(user.getName());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
