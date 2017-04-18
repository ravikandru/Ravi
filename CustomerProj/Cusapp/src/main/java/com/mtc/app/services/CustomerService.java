package com.mtc.app.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.mtc.app.dao.ProductDao;
import com.mtc.app.entity.Customer;

@Path("customerService")
public class CustomerService {
	
	@Path("/add")
	@POST
	public void addCustomer(@FormParam("id") int id,@FormParam("name") String name,@FormParam("email")String email,@FormParam("city") String city){
		
		Customer customer = new Customer(id,name,email,city);
		
		System.out.println(customer.getId());
		System.out.println(customer.getEmail());
		
		ProductDao.addProduct(customer);
		
		
		
	}

}
