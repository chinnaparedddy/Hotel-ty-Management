package com.tys.hotel.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tys.hotel.dto.Customer;
import com.tys.hotel.dto.Room;
import com.tys.hotel.service.CustomerService;

@WebServlet(value = "/savecustomers")
public class SaveCustomer extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		long phone=Long.parseLong(req.getParameter("phone"));
		
		//Room room=new Room();
		Customer customer=new Customer();
		customer.setName(name);
		customer.setEmail(email);
		customer.setGender(gender);
		customer.setPhone(phone);
		//customer.setRoom(room);
		
		CustomerService customerService=new CustomerService();
		 Customer customer2=customerService.saveCustomers(customer);
		 if(customer2!=null) {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("customer.jsp");
			 requestDispatcher.forward(req, resp);
		 }else {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("customersave.jsp");
			 requestDispatcher.include(req, resp);
		 }
		
	}
}
