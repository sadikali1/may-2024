package com.excep;

public class Exception2 {

	public static void main(String[] args) {
		Exception2 obj = new Exception2();
		obj.divid(10, 0);
	}
	
	
	
	public void divid(int a, int b) {
		
		if (b == 0) {
			throw new MyException("Divide by zero exception, please provide valid number of b which is not equal to zero");
		}
		
		int c = a / b;
		System.out.println("Result : " + c);
		
	}
}
