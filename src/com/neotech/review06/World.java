package com.neotech.review06;

public class World {
	
	
public static void main(String[] args) {
	
	Person p= new Person();
	p.name= "flori";
	p.weight=160;
	p.disp();
	System.out.println("-----");
	
	Person p2 = new Person("idris", 175, 34);
	p2.disp();
	
}
}
