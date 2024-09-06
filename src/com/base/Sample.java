package com.base;

public class Sample {
	
	public static void verifyChar(String name , String c) {
		
		if(name.contains(c)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}
	
	
	public static void main(String[] args) {
		Sample2 s = new Sample2();
		String c = s.verifyChar;
		verifyChar("Navin",c);
	}

}
