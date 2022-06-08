package com.tys.hotel.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tys.hotel.dto.Employee;
import com.tys.hotel.service.EmployeService;

@WebServlet(value = "/saveemployee")
public class EmployeeControler extends HttpServlet {
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String designation=req.getParameter("designation");
		long phone = Long.parseLong(req.getParameter("phone"));
		
		
		
		Employee employee=new Employee();
		employee.setName(name);
		employee.setEmail(email);
		employee.setDesignation(designation);
		employee.setPhone(phone);
		EmployeService employeService=new EmployeService();
		 Employee employee2=employeService.saveEmployee(employee);
		 if(employee2!=null) {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("adminhome.jsp");
			 requestDispatcher.forward(req, resp);
		 }else {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("saveemp.jsp");
			 requestDispatcher.include(req, resp);
		 }
	
	}
}

