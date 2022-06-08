package com.tys.hotel.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value = "/logout")
public class LogOutControler extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		HttpSession httpSession=req.getSession();
		httpSession.invalidate();
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("MainPage.jsp");
		requestDispatcher.forward(req, resp);
	}
}
