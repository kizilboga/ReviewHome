package com.neotech.review04;

public class Methods {
	
	void sayWelcome() {
		
		for (int i=0; i<3;i++) {
			System.out.print(" Welcome");
		}System.out.println();
	}

void sayWelcomeWirhNumbers(int a) {
		
		for (int i=0; i<a;i++) {
			System.out.println(" Welcome");
		}System.out.println();
	}

void selam(String word) {
	
	for (int i=0; i<3;i++) {
		System.out.println(word);
	}System.out.println();
}

void greeting(String word, int a) {
	
	for (int i=0; i<a;i++) {
		System.out.println(word);
	}System.out.println();
}
	
	public static void main(String[] args) {
Methods m= new Methods();
m.sayWelcome();
m.sayWelcomeWirhNumbers(5);
m.selam("Xer");
m.greeting("Selamlar", 4);




		
		

	}

}
