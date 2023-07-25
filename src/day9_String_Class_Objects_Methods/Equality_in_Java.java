package day9_String_Class_Objects_Methods;

public class Equality_in_Java {

	public static void main(String[] args) {

			// Equality in java:
		
	String a = "book";
	String b = "book";
	
	String c = new String("book");
	
	System.out.println(a==b); // true
	System.out.println(a == c); // false
	
	// equal method string
	
	System.out.println(a.equals(c));

	}

}
