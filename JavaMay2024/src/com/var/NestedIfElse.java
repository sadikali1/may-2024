package com.var;

public class NestedIfElse {
	
	public static void main(String[] args) {
		
		int age = 36;
		int weight = 50;
		
		if(age > 18) {
			
			if (weight > 45) {
				System.out.println("Eligible for blood donation");
			}else {
				System.out.println("Not eligible for blood donation weight is less than 45");
			}
		}else {
			System.out.println("Person is not eligible for blood donation, his age is less than 18");
		}
	}

}
