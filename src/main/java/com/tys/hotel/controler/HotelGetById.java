package com.tys.hotel.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tys.hotel.dto.Hotel;
import com.tys.hotel.service.HotelService;
@WebServlet(value = "/viewhotel")
public class HotelGetById  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		HotelService hotelService=new HotelService();
		Hotel hotel=hotelService.hotelgetById(id);
		if(hotel!=null) {
			req.setAttribute("hotel", hotel);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("viewhotel.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("viewhotel");
			requestDispatcher.include(req, resp);
		}
		
	}
}
