package com.mtc.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.entity.Product;
import com.mtc.app.util.Hibernate;

public class ProductDao {
	
	public  static Product fecthProductById(int id){
		
		SessionFactory sessionFactory = Hibernate.getSessionfactory();
		
		Session session= sessionFactory.openSession();
		
		Product product = session.get(Product.class, id);
		
		return product;
	}

}
