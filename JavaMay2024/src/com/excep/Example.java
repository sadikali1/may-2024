package com.excep;

public class Example {
	
	static String name = "QA";
	
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 0;
		
		try {
			c = a / b;
			System.out.println(name.length());
			System.out.println("Hi this is try block");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception : " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception : " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Runtime Exception : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		} finally {
			System.out.println("Hi this is finally block");
		}
		
		//System.out.println(name.length());
		System.out.println("Result : " + c);
	}

}

// Exception Handling in Java
// Exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

// Exception Handling is a mechanism to handle runtime errors such as ClassNotFound, IO, SQL, Remote etc.
// There are two types of exceptions:
	// checked -- compile time exception 
	// unchecked -- runtime exception


// Unchecked -- runtime exception: unchecked at runtime. If some code within a method throws an unchecked exception, then the method does not need to specify the exception using throws keyword.
// checked -- compile time exception: checked at compile time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using throws keyword.

// Exception Handling Keywords:
	// try
	// catch
	// finally
	// throw
	// throws

// try block: The code which is prone to exceptions is placed in the try block. The syntax for try block is:
// try {
// 	// code vulnerable to exceptions
//	}
// catch block: The catch block is used to handle the exception. The syntax for catch block is:
// catch(Exception e) {
// 	// code to handle the exception
// }

// finally block: The finally block is used to execute the important code of the program. The syntax for finally block is:
// finally {
// 	// code to be executed
// }
// The finally block always executes whether exception is handled or not.
// The finally block is executed even if an unexpected exception occurs.
// The finally block is used to close the resources like database connection, file connection etc.

