package day3_Arrays;

public class Array2 {

	public static void main(String[] args) {

		/*
		 * 
		 * int [] abc = { 10, 20, 30, 40, 50 }; // index 0
		 * 
		 * String [] a = { "book", "pen", "pencil" };
		 * 
		 * System.out.println(abc[7]);
		 * 
		 * System.out.println(a[0]);
		 * 
		 * 
		 * 
		 * for(int i =0; i<5; i++) {
		 * 
		 * System.out.println(abc[i]); }
		 * 
		 * 
		 * 
		 * for(int i =0; i<2; i++) {
		 * 
		 * System.out.println(a[i]);
		 * 
		 * }
		 * 
		 * int [] b = new int[4]; // declare an array
		 * 
		 * b[0]= 5; b[1] = 10; b[2] = 15; b[3] = 20;
		 * 
		 * System.out.println(b[3]);
		 * 
		 * String [] arr = new String [5];
		 * 
		 * arr[0]="apple"; arr[1]="orange"; arr[2]="cherry"; arr[3]="banana";
		 * arr[4]="melon";
		 * 
		 * // arr [4] = " watermelon";
		 * 
		 * for(String y : arr) { System.out.println(y); } // for(int i = 0;
		 * i<arr.length; i++) { // System.out.println(arr[i]); // }
		 * 
		 * // for each loop for(String b:arr) {
		 * 
		 * System.out.println(b);
		 * 
		 * }
		 * 
		 * int [] x = new int[3];
		 * 
		 * x[0]= 10; x[1]= 20; x[2]= 30;
		 * 
		 * // x[0] = 50;
		 * 
		 * for(int a: x) { System.out.println(a); }
		 */
		
		Object[] ar = { 30, "Rafi", 'A', 3.3 };

		for (Object obj : ar) {

			System.out.println(obj);
		}

	}
}