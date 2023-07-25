package day3_Arrays;

public class Array_3 {

	public static void main(String[] args) {

			// primitve datatypes: int, byte, short, long, char, double, float
		
		// age, salary, wage, etc, 
		
	//	int age, wage, salary = 20, 30, 40;
		
		String name = "Rafi";
			
		// array stores multiple  same data type values in a datatype
		// arrays are static, once you create it , you cannot change the size.
		
		
		int a [] = {1, 2, 3, 4}; // array literal 
		int [] b = {1, 2, 3, 4 };
		
		System.out.println(a[3]);
		
		short c [] = {30, 40, 50, 60};
		
		// assign 
		c[3]=70;
		
		System.out.println(c[3]);
		
		int d [] = new int[3];
		
		// initialize the array
		
		d[0]= 10;
		d[1]= 20;
		d[2]= 30;
		
		System.out.println(d[2]);
		
		// for loop
		
		for(int i = 0; i<d.length; i++) {
			
			System.out.println(d[i]);
		}
		
		// for each loop
		// syntax: for (dataTyep variable : arrayNam)
		for(int numbers: d) {
			System.out.println(numbers + " ******************");
		}
		
		String names [] = { "book", "pen", "pencil" } ;
		
		names[0] = "BOOK";
		
		for(String stationery : names) {
			System.out.println(stationery);
		}
		
		
	}

}
