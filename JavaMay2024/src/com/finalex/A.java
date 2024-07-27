package com.finalex;

public class A {
	
	final int MAX_VALUE;
	static final int MAX ;
	
	static {
		MAX = 100;
		System.out.println("static block");
	}

	
	public A() {
		MAX_VALUE = 100;
	}
	

	public void display() {
		System.out.println(MAX_VALUE);
	}

	public static void main(String[] args) {
		final String name;
		name = "World";
	
		A a = new A();
		a.display();
	}

}


// final keyword is used to restrict the user.
// final can be used in many context. Final can be: 
// 1. variable
// 2. method
// 3. class

// The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable.
// It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only.

// If you make any method as final, you cannot override it. 
// A final method is inherited by any subclass.

// final class can't be inherited 
// A final class may not be subclassed.
//


