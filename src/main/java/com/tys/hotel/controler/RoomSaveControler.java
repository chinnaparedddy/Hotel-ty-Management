package com.tys.hotel.controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tys.hotel.dto.Hotel;
import com.tys.hotel.dto.Room;
import com.tys.hotel.service.RoomService;
@WebServlet(value = "/roomsaves")
public class RoomSaveControler extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String type=req.getParameter("type");
		double cost=Double.parseDouble(req.getParameter("cost"));
		
		Room room=new Room();
		room.setType(type);
		room.setCost(cost);
		Hotel hotel = new Hotel();
		room.setHotel(hotel);
		
		List<Room> rooms=new ArrayList<Room>();
		rooms.add(room);
	
	    RoomService roomService=new RoomService();
	    Room room3= roomService.saveRoom(room);

		 if(room3!=null) {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("print.jsp");
			 requestDispatcher.forward(req, resp);
			
		 }else {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("saveroom.jsp");
			 requestDispatcher.include(req, resp);
		 }

	}
}
