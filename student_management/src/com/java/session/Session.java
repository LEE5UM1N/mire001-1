package com.java.session;

import com.java.dto.WebStudent;

public class Session {
	
	private static Session instance = new Session();
	private Session() {}
	public static Session getSession() {
		return instance;
	}
	
	private WebStudent student;
	public WebStudent getStudent() {
		return student;
	}
	public void setStudent(WebStudent student) {
		this.student = student;
	}
	
}
