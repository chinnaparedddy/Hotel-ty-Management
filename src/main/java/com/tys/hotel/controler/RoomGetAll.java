package com.tys.hotel.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tys.hotel.dto.Hotel;
import com.tys.hotel.dto.Room;
import com.tys.hotel.service.HotelService;
import com.tys.hotel.service.RoomService;
@WebServlet(value = "/rooms")
public class RoomGetAll extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RoomService roomService=new RoomService();
		List<Room>  rooms=roomService.getAllRoom();
		//System.out.println(rooms.size());
		
		if(rooms.size()>0) {
			req.setAttribute("karthik", rooms);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("roomlist.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("employeehome.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
