package com.java.dto;

public class MyeongSukWebStudent extends WebStudent{


	@Override
	public boolean login(String id, String pwd) {
		
		boolean result = true;
		
		if(!id.equals(super.getId())) { 
			result = result && false;
		}
		if(!pwd.equals(super.getPwd())) { //로그인 성공
			result = result && false;
		}
		
		return result;
	}

}
