package com.cons;

public class Student {

	public String name;
	public int age;
	public long mobile;
	public String email;

	public Student(String name, int age, long mobile, String email) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.email = email;
	}

	public void details() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Mobile: " + this.mobile);
		System.out.println("Email: " + this.email);
	}

	public static void main(String[] args) {

		Student s1 = new Student("Raj", 20, 1234567890, "raj@test.com");
		s1.details();

		Student s2 = new Student("Rajesh", 22, 3895495609L, "rajesh@test.com");
		s2.details();

		Student s3 = new Student("Atul", 36, 3895495609L, "atul@test.com");
		s3.details();

	}

	// This keyword in Java: This keyword in Java is a reference variable that
	// refers to the current object.
}
