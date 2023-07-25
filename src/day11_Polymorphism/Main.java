package day11_Polymorphism;

public class Main {

	public static void main(String[] args) {
		/*
		 * 
		 * A a = new A(); a.myMethod();
		 * 
		 * 
		 * A b = new B();
		 * 
		 * b.myMethod();
		 * 
		 * A c = new C(); c.myMethod();
		 * 
		 * 
		 */ 
		B b1 = (B) new A();
		  b1.myMethod();

	}
	
	

}
