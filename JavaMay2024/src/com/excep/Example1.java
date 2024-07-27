package com.excep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Example1 {

	public static void main(String[] args) {

		 // File path is passed as parameter
        File file = new File(
            "C:\\Users\\pankaj\\Desktop\\test.txt");
 
        BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
		    // Declaring a string variable
	        String st;
	        // Condition holds true till
	        // there is character in a string
	        while ((st = br.readLine()) != null)
	 
	            // Print the string
	            System.out.println(st);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
	}

}
// static methods in java
// Encapsulation in java

