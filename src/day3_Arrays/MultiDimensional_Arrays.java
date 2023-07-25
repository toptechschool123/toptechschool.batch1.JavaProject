package day3_Arrays;

public class MultiDimensional_Arrays {

	public static void main(String[] args) {

			// 5, 10, 15, 20
		
		// Multi dimenional array:  2D array or 3D array
		// 10, 20, 30        // index Num 10 = 
		// 40, 50, 60
		
		int a [] [] = { {5,10, 15} , {20, 30, 40} };
		
		String b [][] = { { "book", "pen", "pencil"} , {"name", "addres", "city"  }};
		
		// index numbers: 
		/*
		 * System.out.println(a[0][0]); System.out.println(b[0][0]);
		 * 
		 * System.out.println(a[0][1]);
		 * 
		 * System.out.println(b[1][0]);
		 * 
		 * System.out.println(b[1][2]);
		 */	
		
	//	System.out.println("*****************");
		
	for(int i =0; i<b.length; i++) {
		
		for(int j= 0; j<3; j++) {
			
			System.out.print(b[i][j] + " ");
		}
		System.out.println();
		
		//System.out.println("*****************");
		
		/*
		 * int arr [][] = new int [2][2]; // 1, 2 // 3, 5
		 * 
		 * arr[0][0] = 1; arr[0][1] = 2;
		 * 
		 * arr[1][0]= 3; arr[1][1] =5;
		 * 
		 */
		
		//System.out.println(arr[1][0]);
		
		/*
		 * for(int e=0; e<2; e++) { for(int j =0; j<2; j++) {
		 * 
		 * System.out.print(arr[e][j] + " ");
		 * 
		 * }
		 * 
		 * System.out.println(); }
		 */
	}
	
	}
}

