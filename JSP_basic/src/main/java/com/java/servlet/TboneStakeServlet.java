package com.java.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/대전/스테이크/티본")
public class TboneStakeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gupki = request.getParameter("굽기");
		String soup = request.getParameter("스프");
		
		System.out.println("당신이 주문한 것은 Tbone스테이크 입니다.");
		System.out.println("굽기 : "+gupki);
		System.out.println("스프 : "+soup);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
