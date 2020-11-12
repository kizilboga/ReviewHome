package com.neotech.review06;

public class HospitalApplication {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Doctor d1= new Doctor("idris", 90000, "23reto");
d1.checkUp("zeynep");

Dermatologist d2 = new Dermatologist();
d2.name="mert";
d2.salary=95000;
d2.dermaId="0007";
d2.checkUp("erik");
d2.skintrt(d2.licenceId);

Dermatologist d3=new Dermatologist ("hasan", 12000, "0046");
d3.skintrt("00456");
	

}
}
