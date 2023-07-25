package day1_basics;

public class Concatenation {

	public static void main(String[] args) {
	
		
		String firstName = "Aziz";
		String lastName = "Azizi";
				
		int age = 38;
		
		float wage = 55.0f;
		
		double salary = 20000;
		
		System.out.println(firstName + age + wage + salary);
		
		System.out.println(wage + salary);
		
		System.out.println("My name is " + firstName);
		System.out.println(firstName + " is learning java" + " for the amount of " + wage);
		
		//.concat
		
		String fullName = firstName.concat(lastName);
		System.out.println(fullName);
		
		System.out.println("my full name is " + fullName);
		
		System.out.println("My first name is " + firstName + " and my last name is " + lastName);
		
		
 
	}

}
