package com.tys.hotel.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String hotel_name;
	private String hotel_email;
	private String hotel_Address;
	private String hotel_website;
    @OneToMany(mappedBy = "hotel")
    private List<Room> room ;
    
	public List<Room> getRoom() {
		return room;
	}

	public void setRoom(List<Room> room) {
		this.room = room;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getHotel_email() {
		return hotel_email;
	}

	public void setHotel_email(String hotel_email) {
		this.hotel_email = hotel_email;
	}

	public String getHotel_Address() {
		return hotel_Address;
	}

	public void setHotel_Address(String hotel_Address) {
		this.hotel_Address = hotel_Address;
	}

	public String getHotel_website() {
		return hotel_website;
	}

	public void setHotel_website(String hotel_website) {
		this.hotel_website = hotel_website;
	}

}
