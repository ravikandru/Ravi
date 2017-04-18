package com.mtc.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Hibernate {
	
	private static SessionFactory sessionfactory;
	
	static{
		
		Configuration configuration = new Configuration();
		
		//Load the xml for the details about the database 
		configuration.configure();
		
		//map the documents to the tables 
		configuration.addAnnotatedClass(com.mtc.app.entity.Product.class);
		
		//
		
		ServiceRegistry serviceregistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		sessionfactory = configuration.buildSessionFactory(serviceregistry);
	}
	
	public static SessionFactory getSessionfactory() {
		return sessionfactory;
	}

}
