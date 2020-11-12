package com.neotech.review04;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "erkan";
		s1.gradeLevel = 6;
		s1.sNumber = 36;

		Student s2 = new Student();
		s2.name = "serkan";
		s2.gradeLevel = 06;
		s2.sNumber = 306;

		Teacher t1 = new Teacher();
		t1.name = "Sabaj";
		t1.salary = 45;
		t1.subject = "Java";
		
		System.out.println("Call methods----");
		s1.study();
		s2.sleep();
		
		t1.teach();
		

	}

}
