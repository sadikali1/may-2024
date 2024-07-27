package com.example;

public class Student {
	
	public String name;
	public int age;
	public long mobile;
	public String email;
	static public String college = "ABC College";
	
	public void details() {
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mobile: " + mobile);
        System.out.println("Email: " + email);
        System.out.println("college: " + college);
    }
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
        s1.name = "Raj";
        s1.age = 20;
        s1.mobile = 1234567890;
        s1.email = "john@test.com";
        
        s1.details();
        
        Student s2 = new Student();
        s2.name = "Rajesh";
        s2.age = 22;
        s2.mobile = 3895495609L;
        s2.email = "raj@test.com";
    
        Student.college = "XYZ College";
        s2.details();
        
        Student s3 = new Student();
        s3.name = "Atul";
        s3.age = 36;
        s3.mobile = 3895495609L;
        s3.email = "atul@test.com";
        s3.details();
		
	}
	

}
