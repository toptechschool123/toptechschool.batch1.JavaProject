package day3_Arrays;

public class Arrays {

	public static void main(String[] args) {

		
		/*
		 * int age = (30), (20), (10); String names = "Rafi" , "najib", "Aziz"; double
		 * wage = 40;
		 */
		//System.out.println(names);
		
		//Array   , [], index , 0 1, 2, 3, ....
		
		
		int [] arr = { 30, 20, 10}; // array literal 
		int [] arr1 = new int [3];
		
		String [] abc = { "Rafi", "Najib", "Aziz" };
		
		String a [] = { "apple", "orange" };
		
		
		for(int i = 0; i<abc.length; i++) {
			
			System.out.println(abc[i]);
		}

		
		for(int c = 0; c<3; c++) {
			
			System.out.println(arr[c]);
		}

	}

}
