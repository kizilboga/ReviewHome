package com.neotech.review04;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="elma";
		System.out.println(str.length());
		
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());
		System.out.println(str);
		System.out.println(str.toLowerCase());
		
		System.out.println(str.equals("Elma"));
		System.out.println(str.equalsIgnoreCase("Elma"));
		System.out.println("-------");
		
		System.out.println(str.contains("Lm"));
		System.out.println(str.contains("Lm".toLowerCase()));
		
		System.out.println(str.startsWith("el"));
		System.out.println(str.endsWith("ma"));
		System.out.println(str.startsWith("lm", 1)); // starting index
		System.out.println(str.startsWith("EL".toLowerCase()));
		System.out.println(str.startsWith("el"));
		
		System.out.println("-----------");
		System.out.println(str.concat(" ").concat("   ").concat(str));
		
		String str1= str.toUpperCase().concat(" Beyza");
		System.out.println(str1);
		
		String str2= str.toUpperCase().concat(" Beyza").toLowerCase();
		System.out.println(str2);
		
		System.out.println("idris".toUpperCase().length());
		
		System.out.println(str.trim());
		System.out.println(str.indexOf("e"));
		
		System.out.println("-----------");
		String str5= "de Hayde";
		System.out.println(str.charAt(2));
		System.out.println(str.indexOf('a'));
		System.out.println(str5.indexOf("ay"));
		System.out.println(str5.indexOf("y", 6));
		
		
	}

}
