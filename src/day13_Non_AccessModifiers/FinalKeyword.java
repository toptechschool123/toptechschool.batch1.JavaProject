package day13_Non_AccessModifiers;

import day13_AccessModifiers.Access_Modifiers;

public class FinalKeyword extends Access_Modifiers {

	

	public static void main(String[] args) {

		FinalKeyword  f = new FinalKeyword ();
		
		System.out.println(f.name);// protected  
		//System.out.println(f.age); // default
		System.out.println(f.salary); // 
		System.out.println();
		
		f.myData();

	}
	

	
	

}
