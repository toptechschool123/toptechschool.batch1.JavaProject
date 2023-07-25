package day3_Arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		// How to declare and initialize
		
		
		//int [] array = new int[3];
		
		String [] arr2 = new String [4];
		arr2[0] = "Tom";
		arr2[1] = "Bob";
		arr2[2]=  "Jack";
		arr2[3] = "apple";
		
		Arrays.sort(arr2);
		for(String b : arr2) {
			System.out.println(b);
			
		}
	/*	}
		for(int a = 0; a<arr2.length; a++) {
			System.out.println(arr2[a]);
		}
		
		
		int [] arr3 = { 100, 20, 30, 40, 50};
		
		//System.out.println(arr3);
		Arrays.sort(arr3);
		for(int a : arr3) {
			System.out.println(a);
		}
		/*
		 * for(int i = 0; i< arr3.length ; i ++) { System.out.println(arr3[i]);
		 * 
		 * }
		 */
	}

}
