package com.str;

public class StringExample {

	public static void main(String[] args) {
		/*
		String s1 = "John";

		System.out.println(s1.hashCode());
		//System.out.println(name);

		
		s1 = s1 + " Doe";
		//System.out.println(name);
		System.out.println(s1.hashCode());
		
		String s2 = "John";
		System.out.println(s2.hashCode());*/
		
		/*
		String qa = "QA Automation Test";
		
		System.out.println(qa.length());
		System.out.println(qa.charAt(4));
		System.out.println(qa.toUpperCase());
		System.out.println(qa.toLowerCase());
		
		String name = "  John Doe  ";
		System.out.println(name.trim());
		System.out.println(name.replace("John", "Jane"));
		System.out.println(qa.substring(3));
		
		String name1 = "John,Doe,Jane,Smith";
		String[] names = name1.split(",");
		
		String a = "John";
		String b = "John";
		String c = new String("John");
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a == c);
		*/
		
		String qa = "QA Automation Test";
		System.out.println(qa.contains("Automation1"));
		System.out.println(qa.startsWith("QA"));
		System.out.println(qa.endsWith("Test1"));
		
		qa = qa.concat(" Engineer");
		System.out.println(qa);
		
	}

}


// String is a sequence of characters. 
// In Java, objects of String are immutable which means a constant and cannot be changed once created.

// function of String --- 

// Predefine function 
	// length() - return the length of the string
    // charAt() - return the character at the specified index//
    // toUpperCase() - convert the string to uppercase
    // toLowerCase() - convert the string to lowercase
    // trim() - remove the leading and trailing spaces
	 // replace() - replace the character
        // substring() - return the substring of the string
        // split() - split the string
        // equals() - compare the string
        // equalsIgnoreCase() - compare the string ignoring the case
        // contains() - check if the string contains a sequence of characters
        // startsWith() - check if the string starts with a sequence of characters
        // endsWith() - check if the string ends with a sequence of characters
        // isEmpty() - check if the string is empty
        // concat() - concatenate the string
  


// User define function