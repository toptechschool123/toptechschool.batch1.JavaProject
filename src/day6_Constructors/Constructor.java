package day6_Constructors;

public class Constructor {

 int age = 30;
 int r;

	public static void main(String[] args) {
   
		// class name
		// no return type
		// we can initialize instance varible inside the constructor
		// we can pass parameters inside the constructor
		//Constructor c = new Constructor();
		// this keyword
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(10.1);
		Constructor c3 = new Constructor(30, "pen");
		Constructor c4 = new Constructor(20.2, "kabul", 80);
	
	


	}

	void myMethod() {

		System.out.println("hi");
	
		
	}

	Constructor() {
	
		System.out.println("I am inside constructor");
    
	}
	
	Constructor(double a){
		System.out.println(a);
		System.out.println("first constructor");
		
	}
	
	Constructor(int b, String c){
		
		System.out.println(b);
		System.out.println(c);
		
	}
	
	Constructor(double x, String y, int z){
		
		System.out.println(x );
		System.out.println(y);
		System.out.println(z);
	}
	
	

}
