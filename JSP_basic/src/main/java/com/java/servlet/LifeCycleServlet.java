package com.java.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {
	@Override
	public void destroy() {
		System.out.println("destroy()");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("init()");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		String name = config.getInitParameter("name");
		String nickname = config.getInitParameter("nickname");
		
		System.out.println("name : "+name);
		System.out.println("nickname : "+nickname);
	}
	
	
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doDelete()");
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPut()");
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
	}
}
