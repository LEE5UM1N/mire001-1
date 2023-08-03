package com.java.dto;

public class Student implements Comparable<Student>{
	//�л�����(�б���,�й�, �̸�, �г�, �а�, �������, �ּ�, ����ó,����)
	
	public static String school="�̷���";
	public String studentNum;
	public String name ="----";
	public int grade = -1;
	public String major ="";
	public String birth = "XXXX-XX-XX";
	public String address ="";
	public String contact ="XXX-XXXX-XXXX";
	public String state="����";
	
	
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









