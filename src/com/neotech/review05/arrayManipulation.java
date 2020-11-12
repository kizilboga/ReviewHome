package com.neotech.review05;

public class arrayManipulation {

	public static void main(String[] args) {

		int[] a = { 4, 17, 9, 1, 3 };
		int[] b = { 4, 17, 19, 1, 3 };
		arrayManipulation am = new arrayManipulation();
		am.largetNum(a);
		System.out.println("Largest " +am.largetNum(a));

		System.out.println("Sum " + am.sumNum(b));
		
		System.out.println("Average " + am.aveNum(b));

	}

	private double aveNum(int[] array) {
		int sum=0;

		for (int el : array) {
			sum +=el;
		}
		double av=sum*1.0 / array.length;
		return av;
	}

	public int largetNum(int[] array) {
		int largest = array[0];

		for (int el : array) {
			if (el > largest) {
				largest = el;
			}
		}
		return largest;
	}

	protected int sumNum(int[] array) {
		int sum = 1;

		for (int el : array) {
			sum = sum * el;
		}
		return sum;
	}

}
