package com.str;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		//StringBuffer obj = new StringBuffer("QA Automation Test");
		StringBuilder obj = new StringBuilder("QA Automation Test");
		
		
		System.out.println(obj);
		
		System.out.println(obj.length());
		System.out.println(obj.capacity());
		
		System.out.println(obj.append(" Engineer"));
		System.out.println(obj.insert(3, " "));
		System.out.println(obj.delete(3, 4));
		//System.out.println(obj.reverse());
		//System.out.println(obj.replace(0, 2, "Hello"));
		//System.out.println(obj.substring(3));
		//System.out.println(obj.substring(3, 7));
		
		System.out.println(obj.delete(1, 5));
	}

}


// polymorphism is the ability of an object to take on many forms.

// There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism.

// compile-time polymorphism is method overloading, static polymorphism
// runtime polymorphism is method overriding, dynamic polymorphism