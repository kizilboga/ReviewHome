package com.neotech.review05;

public class FamilyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FamilyMember fm= new FamilyMember();
		fm.name="Tahir";
		fm.age=60;
		FamilyMember.lastName="Kýzýlboða";
		FamilyMember.City="Bingöl";
		
		fm.printFullName();
		
		FamilyMember fm1= new FamilyMember();
		fm1.name="Naile";
		fm1.age=59;
		fm1.printFullName();
		
		FamilyMember.printSabit();
	}

}
