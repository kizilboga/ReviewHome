package com.neotech.review05;

public class FamilyMember {

	String name ;
	static String  lastName;
	int age;
	static String City;
	
	void printFullName () {
		
		System.out.println(name + " " + lastName + " "+ age);
	}
	
	static void printSabit () {
		System.out.println(lastName + " "+City );
	}
}
