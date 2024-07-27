package com.poy;

public class MethodOverloading {
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add(10.5, 20.5);
		obj.add(10, 20.5);
	}
	
	public void add() {
		int a = 20;
		int b = 30;
		int c = a +b;
		System.out.println(c);
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public void add(double a, double b) {
		System.out.println(a + b);
	}
	
	public void add(int a, double b) {
		System.out.println(a + b);
	}
	
	public void add(double a, int b) {
		System.out.println(a + b);
	}
	
	public void add(int a, int b, double c) {
		System.out.println(a + b + c);
	}
	
	public void add(String name1, String name2) {
		System.out.println(name1 + name2);
	}
}

// Method Overloading: When a class has multiple methods with the same name but different parameters, it is known as method overloading.
// It increases the readability of the program.
// It makes the program more flexible.
//	- The method is called based on the number of arguments.
//	- The method is called based on the data type of the arguments.
//	- The method is called based on the sequence of data type of the arguments.

