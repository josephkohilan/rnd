package com.rnd.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao {
	
	@Autowired
	public SessionFactory sessionFactory;
	
	public Session getSession() {
		Session session = null != sessionFactory.getCurrentSession() ? sessionFactory.getCurrentSession() : sessionFactory.openSession();
		return session;
	}
	
}
