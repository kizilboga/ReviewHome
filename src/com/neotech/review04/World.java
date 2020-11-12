package com.neotech.review04;

public class World {

	public static void main(String[] args) {
//declaring a baby
		Baby baby1;
		// assigning the baby
		baby1 = new Baby();
		
		baby1.name="Bebiþko";
		baby1.gender='M';
		
		baby1.weight=5;
		
		System.out.println(baby1.name);
		System.out.println(baby1.hairColor);

		baby1.hairColor="White";
		System.out.println(baby1.hairColor);
		System.out.println("-----------------------------");
		Baby baby2= new Baby();
		baby2.name="feriþa";
		baby2.gender='F';
		baby2.hairColor="yellow";
		baby2.weight=3;
		
		System.out.println(baby2.name);
		
		baby2.name="fatma";
		System.out.println(baby2.name);
		
		System.out.println("-----------------------------");
		baby2.talk();
		baby2.read(3);
		
		baby1.talking("papa", 3);
	}

}
