package com.array;

public class ExampleArray {
	
	int a ;
	
	public static void main(String[] args) {
        // Array is a collection of similar type of elements that have a contiguous memory location.
        // Array is a reference data type object.
        
        int[] numbers = new int[5];
        
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
		//int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        
        numbers[0] = 100;
        numbers[1] = 200;
        
		/*
		 * for (int i = 0; i < numbers.length; i++) 
		 * { 
		 * 	System.out.println(numbers[i]); 
		 * }
		 */
		for (int i : numbers) {
			System.out.println(i);
		}
		
		
	}

}
