package com.neotech.review05;

public class USA {
	private String capitalCity = "Washington DC";
	protected String mainState = "New York";
	public String bestSchool = "NeoTech Academy";
	String state = "NJ";
	
private void SelectPresident() {
	System.out.println("Elect president from USA");
	
}

protected void nBa() {
	
	System.out.println("There are teams from USA and Canada");
}

public void speakEnglish () {
	
	System.out.println("You can speak from anywhere");
}


	public static void main(String[] args) {

		USA a = new USA();
		System.out.println(a.capitalCity);
		System.out.println(a.mainState);
		System.out.println(a.bestSchool);

a.SelectPresident();
a.nBa();
a.speakEnglish();
	}

}
