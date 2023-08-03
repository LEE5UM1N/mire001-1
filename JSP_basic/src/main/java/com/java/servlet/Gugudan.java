package com.java.servlet;

import java.io.PrintWriter;

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
	public static void exe(PrintWriter out) {

		for(int dan=2;dan<10;dan++) {
			out.println(dan+"단 입니다");
			for(int gop=1;gop<10;gop++) {
				out.println(dan+" * "+gop+" = "+(dan*gop));
			}
			out.println();
		}
	}
}
