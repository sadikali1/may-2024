package com.var;

public class LoopExample1 {
	
	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <= 10; i++) {
		 *  System.out.println(i);
		 *   }
         */
		
		/*
		for (int i = 1; i <= 10; i++) {
			System.out.println(2 * i);
		} */
		
		
		for (int i = 1; i <= 5; i++) { //outer loop
		
			for (int j = 1; j <= 10; j++) { //inner loop
				System.out.println(i+" * " + j + " = " + i * j);
			}
		}
		
	}

}
