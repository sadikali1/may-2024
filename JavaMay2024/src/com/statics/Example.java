package com.statics;

public class Example {
	
	static int a = 10;
	int b = 20;
	
	public static void main(String[] args) {
		System.out.println(a);
		test1();
		
		Example e = new Example();
		e.test2();
		System.out.println(e.b);
	}
	
	public void test() {
		test1();
		test2();
		System.out.println(a);
		System.out.println(b);
	}

	
	public static void test1() {
		System.out.println(a);
	}
	
	public void test2() {
		System.out.println(b);
	}
	
	
}


// static method and variables
// static methods and variables are class level methods and variables.
// static methods and variables can be accessed using class name.
// static methods and variables can be accessed without creating object of the class.
// static methods and variables can be accessed using object of the class.
// 
// non static methods and variables are object level methods and variables.
// non static methods and variables can be accessed using object of the class.
// non static methods and variables cannot be accessed using class name.
// non static methods and variables cannot be accessed without creating object of the class.


// within static method we can access only static methods and variables.
// within non static method we can access both static and non static methods and variables.
// within static method we cannot access non static methods and variables.
// We need to Object of the class to access non static methods and variables with in static methods.


