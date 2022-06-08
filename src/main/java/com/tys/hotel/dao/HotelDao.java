package com.tys.hotel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tys.hotel.dto.Hotel;

public class HotelDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public Hotel saveHotel(Hotel hotel) {
		entityTransaction.begin();
		entityManager.persist(hotel);
	
		entityTransaction.commit();
		return hotel;
	}
	public List<Hotel> getAllHotel(){
		entityTransaction.begin();
		String sql="select h from Hotel h";
		Query query=entityManager.createQuery(sql);
		return query.getResultList();
		
	}
	public Hotel hotelGetById(int id) {
		entityTransaction.begin();
		Hotel hotel=entityManager.find(Hotel.class, id);
		entityTransaction.commit();
		return hotel;
	}
	
}
