package com.spring.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.command.MemberRegistCommand;

@Controller
public class MemberController {

	@RequestMapping(value="/student/regist",method=RequestMethod.GET)
	public void doGet() {}
	
	@RequestMapping(value="/student/regist",method=RequestMethod.POST)
	public String doPost(MemberRegistCommand command,HttpServletRequest request) throws ServletException, IOException {
	
		//service.regist(command);
		
		
		String url="/student/regist_success";
		request.setAttribute("command", command);
		return url;
	}

}
