package day3_Arrays;

public class Practice {

	public static void main(String[] args) {

		int a = 3;
		//int b = 2, 4,5;
		// []
		
		int [] c = { 1, 2, 3, 4};
		
		// Object array
		
		Object [] d = { 'a', "book", 3, 2.2, true };
		for(Object x : d) {
			System.out.println(x);
		}
		
		String y [][] = { {"pen", "book", "eraser"} , {"cat", "dog", "horse"} };
		
		// for loops: double or two for loop
		
		for(int i =0; i<y.length; i++) {
			for(int j = 0; j<3; j++) {
				
				System.out.print(y[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
