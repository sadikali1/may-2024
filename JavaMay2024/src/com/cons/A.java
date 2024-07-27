package com.cons;

public class A {
	
	public A() {
        System.out.println("A");
    }
    
    
	public A(int i) {
		System.out.println("A int");
	}
	
	public A(String s) {
		System.out.println("A string");
	}
	
	public A(String s, int i) {
		System.out.println("A string int");
	}
	
	public A(int i, String s) {
		System.out.println("A int string");
	}
	
	public static void main(String[] args) {
		A a = new A();
		A a1 = new A(10);
		A a2 = new A("Hello");
		A a3 = new A("Hello", 10);
		A a4 = new A(10, "Hello");
	}

}

// Constructor in Java: In Java, a constructor is a block of codes similar to the method. It is called when an instance of the object is created, and memory is allocated for the object.
// It is a special type of method which is used to initialize the object.
// Every time an object is created using the new() keyword, at least one constructor is called.
// It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.
// There are two types of constructors in Java: Default constructor and Parameterized constructor.
// default constructor: A constructor is called "default constructor" when it doesn’t have any parameter.
// Parameterized constructor: A constructor is called "parameterized constructor" when it has parameters.
// 	
