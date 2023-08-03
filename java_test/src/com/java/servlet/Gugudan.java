package com.java.servlet;

public class Gugudan {
	
	public static void exe() {

		for(int dan=2;dan<10;dan++) {
			System.out.println(dan+"단 입니다");
			for(int gop=1;gop<10;gop++) {
				System.out.println(dan+" * "+gop+" = "+(dan*gop));
			}
			System.out.println();
		}
	}
}
