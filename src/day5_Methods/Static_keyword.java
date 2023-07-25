package day5_Methods;

public class Static_keyword {

	static int a = 20;
	int b ; // 0
	String address; // null
	static String name = "book";
	// The static keyword belongs to the class  rather than an instance of the class.
	// we can call a 
	public static void main(String[] args) {
		
		Static_keyword s = new Static_keyword();
		
		s.myMethod();
		myMethod2();// call the method directly
		Static_keyword.myMethod2(); // call the static method by className
		
		System.out.println(a);
		System.out.println(s.b);
		System.out.println(name);
		System.out.println(s.address + " " + s.b);
	}
	
	public void myMethod() {
		
		int age = 20 ;
		
		
		System.out.println(a);
	}
	
	public static void myMethod2() {
		
		System.out.println("helloooooooo");
		
	}

}
