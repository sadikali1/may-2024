package com.var;

public class MethodExample {

	public static void main(String[] args) {
		MethodExample obj = new MethodExample();
		int a = obj.add(10, 20);
		System.out.println("Sum a: " + a);
		obj.add(30, 20);
		obj.sub();
	}
	
	public int add(int a, int b) {
		int c = a + b;
		System.out.println("Sum: " + c);
		return c;
	}
	
	public void sub() {
		int a = 10;
		int b = 20;
		int c = a - b;
		System.out.println("Sub: " + c);
	}

}
