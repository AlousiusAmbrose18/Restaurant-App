package com.Restaurant.Application.Respclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Restaurant.Application.Entity.RestaurantEntity;

public class RestaurantRep {
	
	Configuration cfg = new Configuration();
	RestaurantEntity r;
	
	public void addRestaurant(RestaurantEntity res)
	{
		
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(res);
		transaction.commit();
	}
	
	public RestaurantEntity getResById(Integer id)
	{
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		return session.get(RestaurantEntity.class, id);
		
	}
	
	public void updateConAndCityById(String con, String city,Integer id)
	{
		r = getResById(id);
		
		if(r!=null)
		{
			r.setContactNum(con);
			r.setCity(city);
			
			cfg.configure();
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(r);
			transaction.commit();
			
			System.out.println("Update SuccessFully");
		}
		else System.err.println("No Record Found !!!");
		
	}
	
	public void deleteById(Integer id)
	{
		r = getResById(id);
		
		if(r!=null)
		{
				cfg.configure();
				SessionFactory sessionFactory = cfg.buildSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				session.delete(r);
				transaction.commit();
				System.out.println("Deleted SuccessFully");
		}
		else System.err.println("No Record Available");
		
	}

}
