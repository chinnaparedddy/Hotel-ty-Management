package com.tys.hotel.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tys.hotel.service.HotelService;
@WebServlet(value = "/admin")
public class AdminLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		
		if(email.equals("naresh@gmail.com")&&password.equals("naresh123")) {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("adminhome.jsp");
			 requestDispatcher.forward(req, resp);
		 }else {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("Login.jsp");
			 requestDispatcher.include(req, resp);
		 }
	}
}
