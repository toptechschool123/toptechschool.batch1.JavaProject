package day14_ExceptionHandling;

public class Exceptions2 {

	public static void main(String[] args) {
		myException();

	}
	
	public static void myException() {
		// INS
		
		try {
		int a, b;
		a = 10;
		b = 0;
		int [] numbs= { 1, 2, 3, 4};
		System.out.println(numbs[5]);
		System.out.println(a/b);
		
	
		} catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println(" arrayindex error");
			
		}catch(ArithmeticException e) {
			
			System.out.println("math error");
		
		} catch ( Exception e) {
			System.out.println(e);
			
		} 
		
		finally {
			System.out.println(" database closed");
		}
		}
		
	}


