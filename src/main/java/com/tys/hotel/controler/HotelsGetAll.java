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
import com.tys.hotel.service.HotelService;
@WebServlet(value = "/hotels")
public class HotelsGetAll  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HotelService hotelService=new HotelService();
		List<Hotel> hotels=hotelService.getAllHotels();
		if(hotels!=null) {
			req.setAttribute("naresh", hotels);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("hotellist.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("");
			requestDispatcher.forward(req, resp);
		}
	}
}
