package com.spring.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring.command.MemberRegistCommand;


//@WebServlet("/student/regist")
public class MemberRegistServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/WEB-INF/views/student/regist.jsp";
		
		request.getRequestDispatcher(url).forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/WEB-INF/views/student/regist_success.jsp";
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pwd=request.getParameter("pwd");
		String email=request.getParameter("email");
		String phone = request.getParameter("phone");
		
		MemberRegistCommand command =new MemberRegistCommand();
		command.setEmail(email);
		command.setId(id);
		command.setPhone(phone);
		command.setPwd(pwd);
		
		//service.regist(command);
		
		request.setAttribute("command", command);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}





