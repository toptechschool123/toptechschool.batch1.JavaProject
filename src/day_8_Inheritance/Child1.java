package day_8_Inheritance;

public class Child1 extends Parent {

	double wage = 300000;
	public static void main(String[] args) {

		// the extend keyword is used to establish inheritance
		// one class can extend only one class at a time
		// if a class has a final modifier, that class cannot be extended/inherited by other classes
		// private members of a class cannot be inherited/extended
		// method 
		Child1 c = new Child1();
		
		c.parentMethod();

		
		
	//	System.out.println(c.ad);
		System.out.println(c.getAddress());
		
	}
}
