package com.mobileDao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import mobile.help.Mobile;
 

public class MobileDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("my-persistence-unit");
	
	
	//creating  table
	public Mobile save(Mobile mobile)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(mobile);
		et.commit();
		
		return mobile;
	}
	
	//fetching data from table
		Mobile m=new Mobile();
	public Mobile findby(int mobileId)
	{
		EntityManager em=emf.createEntityManager();
		
		return em.find(Mobile.class,mobileId);
		
	}
	
	public Mobile update(Mobile mobile)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(mobile);
		et.commit();
		
		return mobile;
	}
	
	public Mobile deleteById( int mobileId)
	{
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		m =em.find(Mobile.class,mobileId);
		if(m!=null)
		{
			em.remove(m);
		}
		em.getTransaction().commit();
	
		return m;
	}
	
	public List<Mobile> findAll()
	{
		EntityManager em=emf.createEntityManager();
		List<Mobile> list=em.createQuery("select m from Mobile m",Mobile.class).getResultList();
		return list;
	}

}
