package com.tys.hotel.service;

import java.util.List;

import com.tys.hotel.dao.HotelDao;
import com.tys.hotel.dto.Hotel;

public class HotelService {

	HotelDao hotelDao=new HotelDao();
	
	public Hotel saveHotels(Hotel hotel) {
		return hotelDao.saveHotel(hotel);
	}
	public List<Hotel> getAllHotels(){
		return hotelDao.getAllHotel();
	}
	public Hotel hotelgetById(int id) {
		return hotelDao.hotelGetById(id);
	}
}
