package com.java.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/RectangleServlet")
public class RectangleServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/rectangle/form.jsp";
		
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/rectangle/result_el.jsp";
	
		request.setCharacterEncoding("utf-8" );
		
		String width = request.getParameter("width");
		String height = request.getParameter("height");
		
		Map<String,String> margin = new HashMap<String,String>();
		margin.put("top", request.getParameter("margin.top"));
		margin.put("left", request.getParameter("margin.left"));
		margin.put("bottom", request.getParameter("margin.bottom"));
		margin.put("right", request.getParameter("margin.right"));
		
		Map<String,String> padding = new HashMap<String,String>();
		padding.put("top", request.getParameter("padding.top"));
		padding.put("left", request.getParameter("padding.left"));
		padding.put("bottom", request.getParameter("padding.bottom"));
		padding.put("right", request.getParameter("padding.right"));
		
		
		String content = request.getParameter("content");
		
		
		request.setAttribute("width", width);
		request.setAttribute("height", height);
		request.setAttribute("margin", margin);
		request.setAttribute("padding", padding);
		request.setAttribute("content", content);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}




