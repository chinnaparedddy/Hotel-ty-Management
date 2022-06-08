package com.tys.hotel.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tys.hotel.dto.Customer;


public class CustomerDao {


	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	public Customer saveCustomer(Customer customer) {
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		return customer;
	}
	public int validateCustomer(String email,long phone) {
		entityTransaction.begin();
		String sql="select c from Customer c where c.email=?1 and c.phone=?2";
		Query query=entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, phone);
		int res=query.getMaxResults();
		entityTransaction.commit();
		return res;
	}
}

