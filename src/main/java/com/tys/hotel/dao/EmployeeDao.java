package com.tys.hotel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tys.hotel.dto.Employee;


public class EmployeeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
    public Employee saveEmployee(Employee employee) {
    	entityTransaction.begin();
    	entityManager.persist(employee);
    	entityTransaction.commit();
    	return employee;
    }
    public int ValidateEmployee(String email,long phone) {
    	entityTransaction.begin();
    	String sql="select e from Employee e where e.email=?1 and e.phone=?2";
    	Query query=entityManager.createQuery(sql);
    	query.setParameter(1, email);
    	query.setParameter(2, phone);
    	int res=query.getMaxResults();
    	entityTransaction.commit();
    	return res;
    }
}

