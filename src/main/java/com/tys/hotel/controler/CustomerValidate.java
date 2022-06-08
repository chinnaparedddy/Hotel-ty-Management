package com.tys.hotel.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tys.hotel.service.CustomerService;
@WebServlet(value = "/customers")
public class CustomerValidate  extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		long phone=Long.parseLong(req.getParameter("phone"));
		
		CustomerService customerService=new CustomerService();
		 int customer=customerService.validCustomer(email, phone);
		
		
		if(customer>0) {
			HttpSession httpSession=req.getSession();
			httpSession.getAttribute("email");
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("customerview.jsp");
			 requestDispatcher.forward(req, resp);
		 }else {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("customer.jsp");
			 requestDispatcher.include(req, resp);
		 }
	}
}
