package com.abs;

public interface IA extends IC, IB{
	
	 String name = "IA";
	 int age = 10;
	
	 void showIA();

	 void printIA();

}


// Interface can have only public static final variables
// Interface can have only abstract methods
// by default, all the methods are public and abstract
// by default, all the variables are public static final
// Interface cannot have constructors
// Interface cannot have instance block
// Interface cannot have static block
// Interface cannot have instance variables
// Interface cannot have static variables
// interface can implement in a class using implements keyword
// interface can extend in a interface using extends keyword
// 

