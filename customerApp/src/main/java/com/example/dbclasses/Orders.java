package com.example.dbclasses;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Orders {
	
	@Id
	private String id;
	private String product;
	private String price;
	
	private String custId;
	

	public Orders() {
		
		// TODO Auto-generated constructor stub
	}
	public Orders(String id, String product, String price, String custId) {
		super();
		this.id = id;
		this.product = product;
		this.price = price;
		this.custId = custId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
}
