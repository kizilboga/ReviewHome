package com.neotech.review04;

public class TestEnsar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ensar e = new Ensar();
		e.add();
		e.addNumb(6, 9);
		e.addGive(5, 8);
		
		System.out.println(e.addGive(7, 9));
		System.out.println(e.noGive());
	}

}
