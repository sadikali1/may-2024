package com.array;

public class ArrayString {

	public static void main(String[] args) {

			String[] name = new String[4];
			name[0] = "John";
			name[1] = "Doe";
			name[2] = "Jane";
			name[3] = "Smith";
			
	
			//String[] name = {"John", "Doe", "Jane", "Smith"};
			
			System.out.println(name.length);
			System.out.println(name[0]);
			System.out.println(name[1]);
			System.out.println(name[2]);
			System.out.println(name[3]);
			
			for (String i : name) {
				System.out.println(i);
			}
			
			for (int i = 0; i < name.length; i++) {
				System.out.println(name[i]);
			}

	}

}

