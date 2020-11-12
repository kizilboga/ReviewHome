package com.neotech.review04;

public class SubstringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "idRis love you very much 12568...";
		System.out.println(str.substring(6));
		
		String ssn = "11045956567";
		System.out.println(ssn.substring(0, 8).replaceAll("[0-9]", "*") + ssn.substring(7, 10));
		System.out.println(str.subSequence(0, 5));
		
		System.out.println(str.substring(5, 13));
		System.out.println(str.replace('c', 'ç'));
		
		System.out.println(str.replace("love", "hate"));
		System.out.println(str.replaceAll("ou", "oop"));
		System.out.println(str.replaceAll("[a-z]", "*"));
		System.out.println(str.replaceAll("[a-zA-Z]", "*"));
		System.out.println(str.replaceAll("[0-9]", "*"));
		
		//last 3 digits of ID No
		System.out.println(ssn.substring(0, 8).replaceAll("[0-9]", "*") + ssn.substring(7, 10));

	}

}
