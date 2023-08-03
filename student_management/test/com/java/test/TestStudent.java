package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.java.comparator.StudentNameComparator;
import com.java.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		System.out.println(Student.school);
		
		Student stu2 = new Student();
		stu2.studentNum = "9825346";

		Student stu1 = new Student();
		stu1.studentNum = "9765437";
		
		Set<Student> stuSet = new HashSet<Student>();
		stuSet.add(stu1);
		stuSet.add(stu2);
		
		System.out.println(stuSet);
		
		Student stu3 = new Student();
		stu3.studentNum = "9825346";
		
		stuSet.add(stu3);
		System.out.println(stuSet);
		System.out.println(stuSet.contains(stu3));
		
		stuSet.remove(stu3);
		System.out.println(stuSet);
		
		System.out.println("===============================");
		
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(stu1);
		stuList.add(stu2);
		
		System.out.println(stuList);
		
		Student stu4 = new Student();
		stu4.studentNum = "3165437";
		stuList.add(stu4);
		
		Student stu5 = new Student();
		stu5.studentNum = "1265437";
		stuList.add(stu5);
		
		Collections.sort(stuList);
		System.out.println(stuList);
		
		Collections.sort(stuList,Collections.reverseOrder());
		System.out.println(stuList);
		
		System.out.println("======================================");
		
		TreeSet<Student> stuTreeSet = new TreeSet<Student>(new StudentNameComparator());
		stu1.name="±è";
		stuTreeSet.add(stu1);
		stu2.name="ÃÖ";
		stuTreeSet.add(stu2);
		stu3.name="¹Ú";
		stuTreeSet.add(stu3);
		stu4.name="ÀÌ";
		stuTreeSet.add(stu4);
		stu5.name="°­";
		stuTreeSet.add(stu5);
		
		System.out.println(stuTreeSet);
		Iterator<Student> it = stuTreeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().name);
		}
		
		System.out.println("================================");
		Map<String,Student> stuMap = new TreeMap<String,Student>();
		stuMap.put(stu1.name,stu1);
		stuMap.put(stu2.name,stu2);
		stuMap.put(stu3.name,stu3);
		stuMap.put(stu4.name,stu4);
		stuMap.put(stu5.name,stu5);
		
		System.out.println(stuMap);
		String stuNum=stuMap.get(stu4.name).studentNum;
		
	}

}
