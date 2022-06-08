package com.tys.hotel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tys.hotel.dto.Room;

public class RoomDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Room saveRoom(Room room) {
		entityTransaction.begin();
		entityManager.persist(room);
		entityTransaction.commit();
		return room;
	}
	public List<Room> getAllRooms() {
		entityTransaction.begin();
		String sql="select r from Room r";
		Query query=entityManager.createQuery(sql);
		return query.getResultList();
		
	}
}
