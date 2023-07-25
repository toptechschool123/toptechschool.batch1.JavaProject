package day14_ExceptionHandling;

import java.io.File;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		myException();
		myMethod();
		myData();
	}

	public static void myException() {

		try {
			int a, b;
			a = 10;
			b = 0;
			System.out.println(a / b);
		}  catch (ArithmeticException e) {
			
			System.out.println("arithmetic error");
			
		}
		

	}

	public static void myMethod() {
		
		try {
			int[] numbers = { 10, 20, 30, 40, 50 };

			System.out.println(numbers[8]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
	}

	public static void myData() {

		System.out.println("hi it is my not lecture about exception handling");

		System.out.println(19 / 12);
	}

}
