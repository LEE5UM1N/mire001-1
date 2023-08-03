package com.java.main;

import com.java.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		
		for(int i=0;i<10;i++) {
			System.out.println(new Student().studentNum+"\t"+new Student().name);
		}

	}

}
