package com.neotech.review06;

public class Dermatologist extends Doctor{

	String dermaId;
	
	Dermatologist (){
		
	}
	
Dermatologist (String name, int salary, String licenceId){
super(name, salary,licenceId);
	//		super.name=name;
//		super.salary=salary;
//		super.licenceId= licenceId;
	}
	
	public void skintrt(String dermaId) {
		
	System.out.println(name + salary +dermaId);	
	}
	
}
