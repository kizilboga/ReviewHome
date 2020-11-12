package com.neotech.review05;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Today i am not happy, i am very exhausted.";

		String[] array = str.split("happy");
		System.out.println(array.length);
		
		for (String element: array) {
			System.out.println(element);
		}
		
		for  (int i=0; i<array.length; i++) {
			
			System.out.println(array[i]);
		}
		System.out.println("-------------------");
		str="I like 5 and 7 because i 8 nine";
		array= str.split("5");
		System.out.println(array.length);
		
		for (String element: array)
		{
			System.out.println(element);
		}

	}

}
