package com.neotech.review06;

public class Student {

	String name;
	int age;

	static String school;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void disp() {
		int age = 5;
		System.out.println("My name is " + name + " " + "age: " + this.age + " school is: " + school);
	}

	public static void main(String[] args) {
		Student.school = "NeoTech";
		Student s2 = new Student("idris", 34);
		s2.disp();
		
		Student s3 = new Student("agim", 24);
		s3.disp();

	}
}
