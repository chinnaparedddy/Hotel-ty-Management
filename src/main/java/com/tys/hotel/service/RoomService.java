package com.tys.hotel.service;

import java.util.List;

import com.tys.hotel.dao.RoomDao;
import com.tys.hotel.dto.Room;

public class RoomService {

	RoomDao roomDao=new RoomDao();
	public Room saveRoom(Room room) {
		return roomDao.saveRoom(room);
	}
	public List<Room> getAllRoom(){
		return roomDao.getAllRooms();
	}
}
