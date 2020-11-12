package com.neotech.review04;

public class MethodsWithReturn {
	boolean isOdd(int num) {
		boolean result;

		if (num % 2 == 1) {
			result = true;
		} else {
			result = false;

		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Tahir";
		System.out.println(name.length());
		
		MethodsWithReturn m=new MethodsWithReturn();
		System.out.println(m.isOdd(7));
		
		boolean res= m.isOdd(12);
		System.out.println(res);
		

	}

}
