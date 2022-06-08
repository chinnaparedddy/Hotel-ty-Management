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

@WebServlet(value = "/savehostels")
public class HotelControler  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		String website=req.getParameter("website");
		
		Hotel hotel=new Hotel();
		//hotel.setId(id);
		hotel.setHotel_name(name);
		hotel.setHotel_Address(address);
		hotel.setHotel_email(email);
		hotel.setHotel_website(website);
		
		HotelService hotelService=new HotelService();
		Hotel hotel2=hotelService.saveHotels(hotel);
		if(hotel2!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("adminhome.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("savehotel.jsp");
			requestDispatcher.include(req, resp);
		}
	}
}
