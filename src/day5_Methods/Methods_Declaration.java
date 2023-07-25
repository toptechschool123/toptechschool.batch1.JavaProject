package day5_Methods;

public class Methods_Declaration {
	// local variables
	// instance variable 
	// class variable  : static keyword
	String name = "book";
	static String name2 = "static key word does not need an object reference";
	/*
	 * 1-How to create a method: 
	 * 2- How to call a method : we can call a method by using the object reference of a class
	 * 3- How to create an object of a class
	 * 4- public keyword: it is accessible from anywhere
	 * 5- Access Modifiers: public , protected, default, private
	 * 6- How to pass parameters inside the method
	 * 7- what is return type and return statement
	 * 
	 */
	public static void main(String[] args) {
		
		Methods_Declaration obj = new Methods_Declaration(); 
		System.out.println(obj.name);
		System.out.println(name2);
		obj.method1();
		
		obj.method2();
		
		obj.method3(6, "pen");
		obj.method4();
		obj.method5(9,8);
		obj.method6("house", "seattle");
	}
	
	void method1() {
		
		String name = "Rafi"; // local variable
		System.out.println(name);
		System.out.println(" it is method 1");
	}
	
	public void method2() {
		
		System.out.println("it is method 2");
	}
	
	public void method3(int a , String b) {
		
		 
		 
		System.out.println(a + " " + b);
	}
	
	public  int method4() {
		
		  int a = 40; 
		  int b = 50;
		 int c = a + b;
		 System.out.println(c);
		 return c;
	
	
	}
	
	public int method5(int a, int b) {
		
		System.out.println(a );
		System.out.println(b);
		return a & b;
	
		
	}
	
	public String method6(String name, String address) {
		
	String info = name + address;
		System.out.println(info);
	return info;
	

		
	}

	

}
