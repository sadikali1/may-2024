package com.operator;

public class AssignmentOperator {

	public static void main(String[] args) {
		// =, +=, -=, *=, /=, %=
		int a = 20;
		int b = 10;

		a += 5; // a = a + 5
		System.out.println("+=: " + a);

		a -= b; // a = a - b
		System.out.println("-=: " + a);

		a *= b; // a = a * b
		System.out.println("*=: " + a);

		a /= b; // a = a / b
		System.out.println("/=: " + a);

		a %= b; // a = a % b
		System.out.println("%=: " + a);
	}
}
