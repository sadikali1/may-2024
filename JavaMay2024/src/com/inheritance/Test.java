package com.inheritance;

public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.run();
		dog.eat();
		
		Cat cat = new Cat();
		cat.meow();
		cat.run();
		cat.eat();
		
	}

}

// Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.
// The class that is inherited is known as the parent class, superclass, or base class.
// The class that does the inheriting is known as the child class, subclass, or derived class.
// Inheritance is a key feature of object-oriented programming.
// Inheritance allows a class to reuse code from another class.
// Inheritance allows for the creation of a hierarchy of classes.

// The extends keyword is used to create a subclass.
// The subclass inherits all the fields and methods from the superclass.

//Types of inheritance:
//1. Single Inheritance
//2. Multilevel Inheritance
//3. Hierarchical Inheritance
//4. Multiple Inheritance
//5. Hybrid Inheritance

