package com.neotech.review06;

public class Doctor {
String name;
int salary;
String licenceId;

public Doctor() {
	
	
}

public Doctor(String name, int salary, String licenceId) {
	this.name=name;
	this.salary=salary;
	this.licenceId= licenceId;
	
}

public void checkUp(String patient) {
	System.out.println("Doctor " +name + " is checking "+ patient);
	
}
}
