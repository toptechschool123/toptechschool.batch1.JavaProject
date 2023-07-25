package day4_OOP;

public class Home {
	
	// class elements/members: 
	// class has elements like object, method, variable/data
	// class has elements like object, method, variable/data
	// class variables
	String name = " java";
	int age = 20;
	char grade = 'a';
	
	
	public static void main(String[] args) {
		

// how to create an objec of  a class ?
		
		Home a = new Home();
		
		
		// how to call a method ? 
		
		a.exam();
		a.method2();
		
		System.out.println(a.name);
		System.out.println(a.age);
		
		
		
	}
	
		
	
	void exam() {
		
		System.out.println("the students numbers");
		System.out.println( 3+4);
		
		// 200 lines of code
	
	
		
		
	}
	
	void method2() {
		
		int x = 4;
		int y = 5;
		System.out.println( x*y);
		System.out.println(" I am in mehtod 2");
		
	}
	void method3() {
		
		System.out.println(" I am in method 3");
		
	}

}
