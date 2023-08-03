package com.java.dto;

public class Student implements Comparable<Student>{
	//학생정보(학교명,학번, 이름, 학년, 학과, 생년월일, 주소, 연락처,상태)
	
	public static String school="미래고";
	public String studentNum;
	public String name ="----";
	public int grade = -1;
	public String major ="";
	public String birth = "XXXX-XX-XX";
	public String address ="";
	public String contact ="XXX-XXXX-XXXX";
	public String state="재학";
	
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if(obj instanceof Student) {
			Student other = (Student)obj;
			if(other.studentNum.equals(studentNum)) {
				result=true;
			}
		}
		return result;
	}
	@Override
	public String toString() {
		return studentNum+":"+name;
	}
	
	@Override
	public int compareTo(Student other) {
		return this.studentNum.compareTo(other.studentNum);
	}

}









