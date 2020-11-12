package com.neotech.review06;

public class Person {
	String name;
	int age;
	int weight;

	public Person() {

		System.out.println("DEFAULT constructor");
	}

	public Person(String name,int weight, int age) {

		//System.out.println("My name is " + pname + " 
		//-my weight is " + pweight);
	this.name=name;
	this.weight=weight;
	this.age=age;
	}

	public void sleep() {

		System.out.println("I am sleeping ");
	}

	void eat() {

		System.out.println("I am eating ");
	}

	protected void disp() {
		System.out.println("My name is " + name + " "
				+ "my weight is " + weight + " "
						+ "age: "+age);
	}
}
