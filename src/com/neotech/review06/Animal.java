package com.neotech.review06;

public class Animal {
	String name;
	int legs;

//	Animal (String name, int legs){
//		this.name=name;
//		this.legs=3;
//	}
	public void sleep() {
		System.out.println("All animal sleeps");
	}

	public void disp() {
		System.out.println(name + legs);
	}

}

class Wolf extends Animal {

}

class Fox extends Animal {
	String furcolor;
	Fox(String furcolor) {
		this.furcolor=furcolor;
		System.out.println(name + legs + furcolor);
	}
	void fx() {
		System.out.println(name + legs + furcolor);
	}
}

class Bear extends Animal {

	void roar() {
		System.out.println("Bear roars");
	}
}