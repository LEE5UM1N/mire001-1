package com.java.main;

import java.util.Scanner;

import com.java.dto.MyeongSukWebStudent;
import com.java.dto.WebStudent;
import com.java.session.Session;

public class Main {

	public static void main(String[] args) {
		// ÇÐ»ýÁ¤º¸(ÇÐ¹ø, ÀÌ¸§, ÇÐ³â, ÇÐ°ú, »ý³â¿ùÀÏ, ÁÖ¼Ò, ¿¬¶ôÃ³,»óÅÂ)

		WebStudent[] students; 
		final int STUDENT_NUM;

		Scanner scann = new Scanner(System.in);

		System.out.print("ÇÐ»ý ¼ö>");
		STUDENT_NUM = scann.nextInt();
		scann.nextLine();
		students = new WebStudent[STUDENT_NUM];
		for(int i=0;i<STUDENT_NUM;i++) {
			students[i]=new MyeongSukWebStudent();
		}
		
		String menu;

		do {
			
			System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
			if(Session.getSession().getStudent()==null) {
				System.out.println("¦¢     1.ÇÐ»ýµî·Ï  ¦¢  2.ÇÐ»ýÁ¶È¸  ¦¢  3.ÇÐ»ý¼öÁ¤  ¦¢  4.ÇÐ»ý»èÁ¦  ¦¢ 5.·Î±×ÀÎ    ¦¢");
			}else {
				System.out.println("¦¢     1.ÇÐ»ýµî·Ï  ¦¢  2.ÇÐ»ýÁ¶È¸  ¦¢  3.ÇÐ»ý¼öÁ¤  ¦¢  4.ÇÐ»ý»èÁ¦  ¦¢ 5.·Î±×¾Æ¿ô  ¦¢");
			}
			System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
			System.out.print("¸Þ´º (Á¾·á:q)>");
			menu = scann.nextLine();

			switch (menu) {
			case "1": //ÇÐ»ýµî·Ï
				System.out.println("\n\n");
				System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
				System.out.println("¦¢  1.ÇÐ»ýµî·Ï                                               ¦¢");
				System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
				// ÇÐ¹ø, ÀÌ¸§, ÇÐ³â, ÇÐ°ú, »ý³â¿ùÀÏ, ÁÖ¼Ò, ¿¬¶ôÃ³,»óÅÂ
				for(int i=0;i<STUDENT_NUM;i++) {
					System.out.println("["+(i+1)+"¹øÂ° ÇÐ»ý Á¤º¸ ÀÔ·Â]");
					
					System.out.print("¾ÆÀÌµð >");
					students[i].setId(scann.nextLine());
					
					System.out.print("ÆÐ½º¿öµå >");
					students[i].setPwd(scann.nextLine());
					
					System.out.print("ÇÐ¹ø ex)2305889001 >");
					students[i].studentNum = scann.nextLine();
				
					System.out.print("ÀÌ¸§ ex)È«±æµ¿ >");
					students[i].name = scann.nextLine();
					
					System.out.print("ÇÐ³â >");
					students[i].grade = scann.nextInt();scann.nextLine();

					System.out.print("ÇÐ°ú ex)Á¤º¸Åë½Å°øÇÐ >");
					students[i].major = scann.nextLine();

					System.out.print("»ý³â¿ùÀÏ ex)2023-05-26 >");
					students[i].birth = scann.nextLine();

					System.out.print("ÁÖ¼Ò (½Ã/µµ ±¸/±º µ¿/¸é) >");
					students[i].address = scann.nextLine();

					System.out.print("¿¬¶ôÃ³ ex)010-1234-5678 >");
					students[i].contact = scann.nextLine();

					System.out.print("»óÅÂ ex)ÀçÇÐ/Á¹¾÷/ÈÞÇÐ/ÀçÀû >");
					students[i].state = scann.nextLine();
					
					System.out.println("\n\n\n");
					System.out.println("ÇÐ»ýµî·Ï °á°ú È­¸é");
					System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
					System.out.printf("  01.¾ÆÀÌµð     : %s\n", students[i].getId());
					System.out.printf("  02.ÆÐ½º¿öµå     : %s\n", students[i].getPwd());
					System.out.printf("  03.ÇÐ¹ø     : %s\n", students[i].studentNum);
					System.out.printf("  04.ÀÌ¸§     : %s\n", students[i].name);
					System.out.printf("  05.ÇÐ³â     : %d\n", students[i].grade);
					System.out.printf("  06.ÇÐ°ú     : %s\n", students[i].major);
					System.out.printf("  07.»ý³â¿ùÀÏ : %s\n", students[i].birth);
					System.out.printf("  08.ÁÖ¼Ò     : %s\n", students[i].address);
					System.out.printf("  09.¿¬¶ôÃ³   : %s\n", students[i].contact);
					System.out.printf("  10.»óÅÂ     : %s\n", students[i].state);
					System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
					System.out.print("¾Æ¹«Å°³ª ´©¸£¼¼¿ä.");
					scann.nextLine();
				}
				break;
			case "2": //ÇÐ»ýÁ¶È¸
				
				boolean flag=true;
				while(flag) {
				
					boolean hasData = false;
					for(int i=0;i<STUDENT_NUM;i++) {
						hasData = hasData || (students[i]!=null && students[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("ÀÔ·ÂµÈ ÇÐ»ýÁ¤º¸°¡ ¾ø½À´Ï´Ù.\n\n\n");
						break;
					}
					
					System.out.println("¼ø¹ø\tÇÐ¹ø\tÀÌ¸§\tÇÐ³â\tÇÐ°ú\t»óÅÂ");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),students[i].studentNum,students[i].name,
								students[i].grade,students[i].major,students[i].state);
					}
					System.out.print("»ó¼¼º¸±â ¹øÈ£ (³ª°¡±â:q)>");
					String num = scann.nextLine();
					
					switch(num) {
					case "q":case "Q":
						flag=false;
						continue;
					}
					
					int index = Integer.parseInt(num);
					
					System.out.println("\n\n\n");
					System.out.println("ÇÐ»ýÁ¶È¸ °á°ú È­¸é");
					System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
					System.out.printf("  1.ÇÐ¹ø     : %s\n", students[index-1].studentNum);
					System.out.printf("  2.ÀÌ¸§     : %s\n", students[index-1].name);
					System.out.printf("  3.ÇÐ³â     : %d\n", students[index-1].grade);
					System.out.printf("  4.ÇÐ°ú     : %s\n", students[index-1].major);
					System.out.printf("  5.»ý³â¿ùÀÏ : %s\n", students[index-1].birth);
					System.out.printf("  6.ÁÖ¼Ò     : %s\n", students[index-1].address);
					System.out.printf("  7.¿¬¶ôÃ³   : %s\n", students[index-1].contact);
					System.out.printf("  8.»óÅÂ     : %s\n", students[index-1].state);
					System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
					System.out.print("¾Æ¹«Å°³ª ´©¸£¼¼¿ä.");
					scann.nextLine();
					System.out.println("\n\n\n\n");
				}
				break;
			case "3": //ÇÐ»ý¼öÁ¤

				flag=true;
				while(flag) {
				
					boolean hasData = false;
					for(int i=0;i<STUDENT_NUM;i++) {
						hasData = hasData || (students[i].studentNum!=null && students[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("ÀÔ·ÂµÈ ÇÐ»ýÁ¤º¸°¡ ¾ø½À´Ï´Ù.\n\n\n");
						break;
					}
					
					System.out.println("¼ø¹ø\tÇÐ¹ø\tÀÌ¸§\tÇÐ³â\tÇÐ°ú\t»óÅÂ");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),students[i].studentNum,students[i].name,students[i].grade,
									  students[i].major,students[i].state);
					}
					System.out.print("¼öÁ¤ÇÐ»ý ¹øÈ£ (³ª°¡±â:q)>");
					String num = scann.nextLine();
					
					switch(num) {
					case "q":case "Q":
						flag=false;
						continue;
					}
					
					boolean flag2=true;
					
					int index=Integer.parseInt(num)-1;
					
					do {
						System.out.println("\n\n\n");
						System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
						System.out.printf("  1.ÇÐ¹ø     : %s\n", students[index].studentNum);
						System.out.printf("  2.ÀÌ¸§     : %s\n", students[index].name);
						System.out.printf("  3.ÇÐ³â     : %d\n", students[index].grade);
						System.out.printf("  4.ÇÐ°ú     : %s\n", students[index].major);
						System.out.printf("  5.»ý³â¿ùÀÏ : %s\n", students[index].birth);
						System.out.printf("  6.ÁÖ¼Ò     : %s\n", students[index].address);
						System.out.printf("  7.¿¬¶ôÃ³   : %s\n", students[index].contact);
						System.out.printf("  8.»óÅÂ     : %s\n", students[index].state);
						System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
						System.out.print("¼öÁ¤ Ç×¸ñ ¼±ÅÃ (³ª°¡±â:q)>");
						menu = scann.nextLine();
						switch (menu) {
						case "1": //ÇÐ¹ø
							System.out.print("ÇÐ¹ø>");
							students[index].studentNum = scann.nextLine();
							break;
						case "2": //ÀÌ¸§
							System.out.print("ÀÌ¸§>");
							students[index].name = scann.nextLine();
							break;
						case "3": //ÇÐ³â
							System.out.print("ÇÐ³â>");
							students[index].grade = scann.nextInt();scann.nextLine();
							break;
						case "4": //ÇÐ°ú
							System.out.print("ÇÐ°ú>");
							students[index].major= scann.nextLine();
							break;
						case "5": //»ý³â¿ùÀÏ
							System.out.print("»ý³â¿ùÀÏ>");
							students[index].birth = scann.nextLine();
							break;
						case "6": //ÁÖ¼Ò
							System.out.print("ÁÖ¼Ò>");
							students[index].address = scann.nextLine();
							break;
						case "7": //¿¬¶ôÃ³
							System.out.print("¿¬¶ôÃ³>");
							students[index].contact = scann.nextLine();
							break;
						case "8": //»óÅÂ
							System.out.print("»óÅÂ>");
							students[index].state = scann.nextLine();
							break;
						case "q":
						case "Q":
							System.out.println("ÇÐ»ý¼öÁ¤À» Á¾·áÇÕ´Ï´Ù.");
							flag2=false;
							continue;
						default:
						}
					}while(flag2);
				}
				break;
			case "4": //ÇÐ»ý»èÁ¦
				flag=true;
				while(flag) {
				
					boolean hasData = false;
					for(int i=0;i<STUDENT_NUM;i++) {
						hasData = hasData || (students[i].studentNum!=null && students[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("ÀÔ·ÂµÈ ÇÐ»ýÁ¤º¸°¡ ¾ø½À´Ï´Ù.\n\n\n");
						break;
					}
					
					System.out.println("¼ø¹ø\tÇÐ¹ø\tÀÌ¸§\tÇÐ³â\tÇÐ°ú\t»óÅÂ");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),students[i].studentNum,students[i].name,students[i].grade,
									  students[i].major,students[i].state);
					}
					System.out.print("»èÁ¦ÇÐ»ý ¹øÈ£ (³ª°¡±â:q)>");
					String num = scann.nextLine();
					
					switch(num) {
					case "q":case "Q":
						flag=false;
						continue;
					}
					
					int index = Integer.parseInt(num)-1;
					
					students[index].studentNum = "";
					students[index].name="";
					students[index].grade = 0;
					students[index].major = "";
					students[index].birth = "";
					students[index].address = "";
					students[index].contact = "";
					students[index].state = "";
					
					System.out.printf("\n%d¹ø ÇÐ»ýÀ» »èÁ¦Çß½À´Ï´Ù.\n\n",(index+1));
					System.out.print("¾Æ¹«Å°³ª ´©¸£¼¼¿ä.");
					scann.nextLine();
				}
				break;
			case "5":
				boolean hasData = false;
				for(int i=0;i<STUDENT_NUM;i++) {
					hasData = hasData || (students[i].studentNum!=null && students[i].studentNum.length()>0);
				}
				
				if (!hasData) {
					System.out.println("ÀÔ·ÂµÈ ÇÐ»ýÁ¤º¸°¡ ¾ø½À´Ï´Ù.\n\n\n");
					break;
				}
				
				if(Session.getSession().getStudent()!=null) {  // ·Î±×¾Æ¿ô
					Session.getSession().setStudent(null);
					break;
				}
				String id=null;
				String pwd=null;
				System.out.print("¾ÆÀÌµð > ");
				id = scann.nextLine();
				System.out.print("ÆÐ½º¿öµå > ");
				pwd = scann.nextLine();
				
				for(int i=0;i<STUDENT_NUM;i++) {
					if(students[i].login(id, pwd)) {
						Session.getSession().setStudent(students[i]);
						i=STUDENT_NUM;
						continue;
					}
				}
				
				
				break;
			case "q":case "Q": //Á¾·á
				System.out.println("ÇÁ·Î±×·¥À» Á¾·áÇÕ´Ï´Ù.");
				return;
			default:
			}

		} while (true);
	}

}
