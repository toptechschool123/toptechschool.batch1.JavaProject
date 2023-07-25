package day15_ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		// research ;
		
		method(44);
		myData();
	}
	
	
	public static void myData() {
		int a, b;
		a= 100;
		b = 20;
		
		if( a>b	) {
			
			throw new ArrayIndexOutOfBoundsException ("a is less than b");
			
		}
		else System.out.println(" b is greater");
		
	}
	
	public static void myMethod() {
		
		
	}
	
	public static void method(int age) {
		
		if(age<20) {
			
			throw new ArithmeticException ("you are under age");
		}
		else System.out.println("you are allowed in ");
	}

}
