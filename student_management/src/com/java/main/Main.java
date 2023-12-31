package com.java.main;

import java.util.Scanner;

import com.java.dto.MyeongSukWebStudent;
import com.java.dto.WebStudent;
import com.java.session.Session;

public class Main {

	public static void main(String[] args) {
		// з儅薑爾(з廓, 檜葷, з喇, з婁, 儅喇錯橾, 輿模, 翱塊籀,鼻鷓)

		WebStudent[] students; 
		final int STUDENT_NUM;

		Scanner scann = new Scanner(System.in);

		System.out.print("з儅 熱>");
		STUDENT_NUM = scann.nextInt();
		scann.nextLine();
		students = new WebStudent[STUDENT_NUM];
		for(int i=0;i<STUDENT_NUM;i++) {
			students[i]=new MyeongSukWebStudent();
		}
		
		String menu;

		do {
			
			System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
			if(Session.getSession().getStudent()==null) {
				System.out.println("弛     1.з儅蛔煙  弛  2.з儅褻��  弛  3.з儅熱薑  弛  4.з儅餉薯  弛 5.煎斜檣    弛");
			}else {
				System.out.println("弛     1.з儅蛔煙  弛  2.з儅褻��  弛  3.з儅熱薑  弛  4.з儅餉薯  弛 5.煎斜嬴醒  弛");
			}
			System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
			System.out.print("詭景 (謙猿:q)>");
			menu = scann.nextLine();

			switch (menu) {
			case "1": //з儅蛔煙
				System.out.println("\n\n");
				System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
				System.out.println("弛  1.з儅蛔煙                                               弛");
				System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
				// з廓, 檜葷, з喇, з婁, 儅喇錯橾, 輿模, 翱塊籀,鼻鷓
				for(int i=0;i<STUDENT_NUM;i++) {
					System.out.println("["+(i+1)+"廓簞 з儅 薑爾 殮溘]");
					
					System.out.print("嬴檜蛤 >");
					students[i].setId(scann.nextLine());
					
					System.out.print("ぬ蝶錶萄 >");
					students[i].setPwd(scann.nextLine());
					
					System.out.print("з廓 ex)2305889001 >");
					students[i].studentNum = scann.nextLine();
				
					System.out.print("檜葷 ex)�垮瘚� >");
					students[i].name = scann.nextLine();
					
					System.out.print("з喇 >");
					students[i].grade = scann.nextInt();scann.nextLine();

					System.out.print("з婁 ex)薑爾鱔褐奢з >");
					students[i].major = scann.nextLine();

					System.out.print("儅喇錯橾 ex)2023-05-26 >");
					students[i].birth = scann.nextLine();

					System.out.print("輿模 (衛/紫 掘/捱 翕/賊) >");
					students[i].address = scann.nextLine();

					System.out.print("翱塊籀 ex)010-1234-5678 >");
					students[i].contact = scann.nextLine();

					System.out.print("鼻鷓 ex)營з/褸機/�痯�/營瞳 >");
					students[i].state = scann.nextLine();
					
					System.out.println("\n\n\n");
					System.out.println("з儅蛔煙 唸婁 �飛�");
					System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
					System.out.printf("  01.嬴檜蛤     : %s\n", students[i].getId());
					System.out.printf("  02.ぬ蝶錶萄     : %s\n", students[i].getPwd());
					System.out.printf("  03.з廓     : %s\n", students[i].studentNum);
					System.out.printf("  04.檜葷     : %s\n", students[i].name);
					System.out.printf("  05.з喇     : %d\n", students[i].grade);
					System.out.printf("  06.з婁     : %s\n", students[i].major);
					System.out.printf("  07.儅喇錯橾 : %s\n", students[i].birth);
					System.out.printf("  08.輿模     : %s\n", students[i].address);
					System.out.printf("  09.翱塊籀   : %s\n", students[i].contact);
					System.out.printf("  10.鼻鷓     : %s\n", students[i].state);
					System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
					System.out.print("嬴鼠酈釭 援腦撮蹂.");
					scann.nextLine();
				}
				break;
			case "2": //з儅褻��
				
				boolean flag=true;
				while(flag) {
				
					boolean hasData = false;
					for(int i=0;i<STUDENT_NUM;i++) {
						hasData = hasData || (students[i]!=null && students[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("殮溘脹 з儅薑爾陛 橈蝗棲棻.\n\n\n");
						break;
					}
					
					System.out.println("牖廓\tз廓\t檜葷\tз喇\tз婁\t鼻鷓");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),students[i].studentNum,students[i].name,
								students[i].grade,students[i].major,students[i].state);
					}
					System.out.print("鼻撮爾晦 廓�� (釭陛晦:q)>");
					String num = scann.nextLine();
					
					switch(num) {
					case "q":case "Q":
						flag=false;
						continue;
					}
					
					int index = Integer.parseInt(num);
					
					System.out.println("\n\n\n");
					System.out.println("з儅褻�� 唸婁 �飛�");
					System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
					System.out.printf("  1.з廓     : %s\n", students[index-1].studentNum);
					System.out.printf("  2.檜葷     : %s\n", students[index-1].name);
					System.out.printf("  3.з喇     : %d\n", students[index-1].grade);
					System.out.printf("  4.з婁     : %s\n", students[index-1].major);
					System.out.printf("  5.儅喇錯橾 : %s\n", students[index-1].birth);
					System.out.printf("  6.輿模     : %s\n", students[index-1].address);
					System.out.printf("  7.翱塊籀   : %s\n", students[index-1].contact);
					System.out.printf("  8.鼻鷓     : %s\n", students[index-1].state);
					System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
					System.out.print("嬴鼠酈釭 援腦撮蹂.");
					scann.nextLine();
					System.out.println("\n\n\n\n");
				}
				break;
			case "3": //з儅熱薑

				flag=true;
				while(flag) {
				
					boolean hasData = false;
					for(int i=0;i<STUDENT_NUM;i++) {
						hasData = hasData || (students[i].studentNum!=null && students[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("殮溘脹 з儅薑爾陛 橈蝗棲棻.\n\n\n");
						break;
					}
					
					System.out.println("牖廓\tз廓\t檜葷\tз喇\tз婁\t鼻鷓");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),students[i].studentNum,students[i].name,students[i].grade,
									  students[i].major,students[i].state);
					}
					System.out.print("熱薑з儅 廓�� (釭陛晦:q)>");
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
						System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
						System.out.printf("  1.з廓     : %s\n", students[index].studentNum);
						System.out.printf("  2.檜葷     : %s\n", students[index].name);
						System.out.printf("  3.з喇     : %d\n", students[index].grade);
						System.out.printf("  4.з婁     : %s\n", students[index].major);
						System.out.printf("  5.儅喇錯橾 : %s\n", students[index].birth);
						System.out.printf("  6.輿模     : %s\n", students[index].address);
						System.out.printf("  7.翱塊籀   : %s\n", students[index].contact);
						System.out.printf("  8.鼻鷓     : %s\n", students[index].state);
						System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
						System.out.print("熱薑 о跡 摹鷗 (釭陛晦:q)>");
						menu = scann.nextLine();
						switch (menu) {
						case "1": //з廓
							System.out.print("з廓>");
							students[index].studentNum = scann.nextLine();
							break;
						case "2": //檜葷
							System.out.print("檜葷>");
							students[index].name = scann.nextLine();
							break;
						case "3": //з喇
							System.out.print("з喇>");
							students[index].grade = scann.nextInt();scann.nextLine();
							break;
						case "4": //з婁
							System.out.print("з婁>");
							students[index].major= scann.nextLine();
							break;
						case "5": //儅喇錯橾
							System.out.print("儅喇錯橾>");
							students[index].birth = scann.nextLine();
							break;
						case "6": //輿模
							System.out.print("輿模>");
							students[index].address = scann.nextLine();
							break;
						case "7": //翱塊籀
							System.out.print("翱塊籀>");
							students[index].contact = scann.nextLine();
							break;
						case "8": //鼻鷓
							System.out.print("鼻鷓>");
							students[index].state = scann.nextLine();
							break;
						case "q":
						case "Q":
							System.out.println("з儅熱薑擊 謙猿м棲棻.");
							flag2=false;
							continue;
						default:
						}
					}while(flag2);
				}
				break;
			case "4": //з儅餉薯
				flag=true;
				while(flag) {
				
					boolean hasData = false;
					for(int i=0;i<STUDENT_NUM;i++) {
						hasData = hasData || (students[i].studentNum!=null && students[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("殮溘脹 з儅薑爾陛 橈蝗棲棻.\n\n\n");
						break;
					}
					
					System.out.println("牖廓\tз廓\t檜葷\tз喇\tз婁\t鼻鷓");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),students[i].studentNum,students[i].name,students[i].grade,
									  students[i].major,students[i].state);
					}
					System.out.print("餉薯з儅 廓�� (釭陛晦:q)>");
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
					
					System.out.printf("\n%d廓 з儅擊 餉薯ц蝗棲棻.\n\n",(index+1));
					System.out.print("嬴鼠酈釭 援腦撮蹂.");
					scann.nextLine();
				}
				break;
			case "5":
				boolean hasData = false;
				for(int i=0;i<STUDENT_NUM;i++) {
					hasData = hasData || (students[i].studentNum!=null && students[i].studentNum.length()>0);
				}
				
				if (!hasData) {
					System.out.println("殮溘脹 з儅薑爾陛 橈蝗棲棻.\n\n\n");
					break;
				}
				
				if(Session.getSession().getStudent()!=null) {  // 煎斜嬴醒
					Session.getSession().setStudent(null);
					break;
				}
				String id=null;
				String pwd=null;
				System.out.print("嬴檜蛤 > ");
				id = scann.nextLine();
				System.out.print("ぬ蝶錶萄 > ");
				pwd = scann.nextLine();
				
				for(int i=0;i<STUDENT_NUM;i++) {
					if(students[i].login(id, pwd)) {
						Session.getSession().setStudent(students[i]);
						i=STUDENT_NUM;
						continue;
					}
				}
				
				
				break;
			case "q":case "Q": //謙猿
				System.out.println("Щ煎斜極擊 謙猿м棲棻.");
				return;
			default:
			}

		} while (true);
	}

}
