package com.cons;

public class AC extends AB {
	
	
	public AC() {
		super("Raj");
		System.out.println("Default constructor of AC");
	}
	
	public AC(String name) {
		System.out.println("Parameter constructor of AC :"+name);
	}
	
	public AC(String name, int age) {
        System.out.println("Parameter constructor of AC :"+name+" "+age);
	}
	
	public static void main(String[] args) {
		AC ac = new AC("QA");
		
	}

	
	
}


// constructor chaining : calling one constructor from another constructor is called constructor chaining