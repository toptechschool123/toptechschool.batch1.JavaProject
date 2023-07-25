package day2_loops;

public class Nested_loop {

	public static void main(String[] args) {
	
		 
		 // nested contains outer loop and inner loop
	/*	
		for (int i =1; i<5; ++i) {
			
			System.out.println("Hello");
			  for(int j = 1; j <=5; ++j) {
				  
				  System.out.println("hi");
			   
				 // System.out.println(i + " " + j);
			  }
			  
			  System.out.println();
		}
		 
		*/
	/*	
		
		// 1, 12, 123, 1234, 12345

		for (int i = 1; i <= 5; ++i) {
			
			  for(int j = 1; j <=i; ++j) {
			   
				  System.out.print( i);
			  }
			 
			  
			  System.out.println();
		}
		
		*/
	/*	
		// 1, 22, 333, 4444, 55555
		for (int i = 1; i <= 5; ++i) {
			
			  for(int j = 1; j <=i; ++j) {
			   
				System.out.print(i);
			// System.out.print(i + " " + j);
			  }
		 
			  
			  System.out.println();
		} 
		*/	
		
		// multiplication table
	
		/*
		for( int a = 1; a<=10; a++) { // 1 iteration
			
			for(int b = 1; b<=10; b++) {   // complete iteration
				
				System.out.print((a * b) + " ");
				
			}
			
			System.out.println();
		}
		*/
		
		/*
		 * 
		 * // pyramid * , **, *** for(int c = 1; c<=5; c++) { for(int d = 1; d<=c; d++)
		 * {
		 * 
		 * System.out.print("*"); }
		 * 
		 * System.out.println(); }
		 */
	
		
		
		for(int c = 1; c<=5; c++) {
			for(int d = 1; d<=3; d++) {
				
				System.out.println( c + " " + d);
			}
			
			System.out.println();
		
	}

}
}