package com.java.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// uri : /background/css

//@WebServlet("/background/css")
public class BackgroundServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String viewURL= "/backgroundForm.jsp";
		
		request.getRequestDispatcher(viewURL).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String viewURL = "/backgroundForm.jsp";

		String color = request.getParameter("color");
		
		request.setAttribute("color",color);
		request.getRequestDispatcher(viewURL).forward(request, response);
		
	}

}
