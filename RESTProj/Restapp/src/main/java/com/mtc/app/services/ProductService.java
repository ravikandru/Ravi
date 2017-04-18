package com.mtc.app.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mtc.app.dao.ProductDao;
import com.mtc.app.entity.Product;

@Path("ProductSearch")
public class ProductService {
	
	
//	@Path("/{id}")
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getProduct(@PathParam("id") int id ){
//		
//			
//		return "Given Id is :"+id;
//		
//	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Product getProductById(@PathParam("id") int id ){
		
			Product product = ProductDao.fecthProductById(id);
		
			return product;
		
	}
	

}
