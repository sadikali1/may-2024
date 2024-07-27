package com.operator;

public class LogicalOperator {
	
	public static void main(String[] args) {
		// &&, ||, !
		int a = 20;
		int b = 30;
		int c = 40;

		System.out.println(a > b && a++ < c); 
					// false && true = false
					// true && false = false
					// true && true = true
					// false && false = false
		
		
		System.out.println(a); // 21);
		
		System.out.println(a > b || a < c); 
				// false || true = true
				// true || false = true
		        // true || true = true
			    // false || false = false
		
		
		System.out.println(!(a > b)); // !false = true
	}

}

// logical operator 	
