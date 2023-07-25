package day3_Arrays;

import java.util.Arrays;

public class Object_Array {

	public static void main(String[] args) {

   // array stores same datatype multiple values;
		
	// different dataTypes 
		
		// Object array: stores different data types values
		
		Object a []= { 5, 'A',"book", true, 2.2 };
		
		for(Object var: a) {
			
			System.out.println(var);
	
		}
		
		
		// how to compare tw arrays
		int b [] = { 1, 2, 3, 4};
		int c [] = { 3, 5, 6, 7};
		
		System.out.println(Arrays.equals(b,c));
		System.out.println(Arrays.binarySearch(b, 4));

	}

}
