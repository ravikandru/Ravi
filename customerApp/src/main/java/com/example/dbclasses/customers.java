package com.example.dbclasses;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class customers {

	
	
	public customers() {
		// TODO Auto-generated constructor stub
	}
	
	public customers(String id, String name, String email) {
		super();
		this.id=id;
		this.name=name;
		this.email= email;
	}
	@Id
	private String id;
	private String name;
	private String email;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
