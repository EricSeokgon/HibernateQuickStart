package com.hadeslee.edu.hib.domain;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	static{
		try{
			Configuration configuration = new Configuration();
			configuration.configure();		
			
			
		}catch(Throwable t){
			throw new ExceptionInInitializerError(t);
		}
	}

}
