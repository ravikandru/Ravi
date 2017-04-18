package com.mtc.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtc.app.entity.Customer;

import com.mtc.app.util.Hibernate;

public class ProductDao {
	
//	public  static Product fecthProductById(int id){
//		
//		SessionFactory sessionFactory = Hibernate.getSessionfactory();
//		
//		Session session= sessionFactory.openSession();
//		
//		Product product = session.get(Product.class, id);
//		
//		return product;
//	}
	
	public static void addProduct(Customer customer){
		
		SessionFactory sessionFactory = Hibernate.getSessionfactory();
	
		Session session= sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		
		session.save(customer);
		
		transaction.commit();
		
		session.close();
		
		sessionFactory.close();
		
		
	}

}
