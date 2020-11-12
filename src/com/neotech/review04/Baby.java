package com.neotech.review04;

public class Baby {

	String name;
	char gender;
	int weight;
	String hairColor;

	void talk() {
		System.out.println("bla bla bla");
	}

	void cry() {
		System.out.println("Baby cries everytime.");
	}

	void read(int min) {
		System.out.println("Baby reads " + min + " minutes.");
	}

	void talking(String word, int times) {
		for (int i = 0; i < times; i++) {

			System.out.print(word + " ");
		}
		System.out.println();
	}

}
