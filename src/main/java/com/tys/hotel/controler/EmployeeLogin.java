package com.tys.hotel.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tys.hotel.service.EmployeService;
@WebServlet(value = "/employLogin")
public class EmployeeLogin  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("phone"));
		
		EmployeService employeService=new EmployeService();
		int result=employeService.validateEmployee(email, phone);
		if(result>0) {
			
			HttpSession httpSession=req.getSession();
			httpSession.setAttribute("email",result);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("employeehome.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("employeelogin.jsp");
			requestDispatcher.include(req, resp);
		}
	}
}
