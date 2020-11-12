package com.neotech.review05;

public class toCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Today i am not happy, i am very exhausted.";

		char[] array= str.toCharArray();
		System.out.println(array.length);
		
		for (char element: array) {
			if (element=='a') {
				System.out.print('e');
			}else {
			System.out.print(element + " ");}
		}
		System.out.println();
		for (int i =array.length-1; i>=0; i--) {
			
			System.out.print(array[i]+ " ");
		}
		
		System.out.println();
		for (int i =array.length-1; i>=0; i--) {
		
		}
		System.out.println(" \t elma");
		
 	}

}
