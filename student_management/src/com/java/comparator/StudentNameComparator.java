package com.java.comparator;

import java.util.Comparator;

import com.java.dto.Student;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {
		
		return stu1.name.compareTo(stu2.name);
	}

}
