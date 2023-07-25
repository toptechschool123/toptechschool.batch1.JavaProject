package day9_String_Class_Objects_Methods;

public class Methods_of_StringClass {

	public static void main(String[] args) {
		
	
	
		String x = " Java is a programming language";
		String k = " Java : is : a : programming : language*****";
		String y = "";
		
		String a = "book";
		String b = "Book";
		
		//;toLowerCase();
		//x.toLowerCase();
		//x.toUpperCase();
		
		System.out.println(x.toLowerCase());
		System.out.println(x.toUpperCase());
		System.out.println(x.length());
		System.out.println(x.trim());
		System.out.println(x.isEmpty());
		System.out.println(y.isEmpty());
		System.out.println(x.concat(" for all"));
		System.out.println(x.startsWith("j"));
		System.out.println(x.indexOf("Java"));
		System.out.println(x.charAt(4));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.contains("b"));
		
		String [] sub = x.split(" ");
		for(String v : sub) { 
			System.out.println(v);
		}
		
		String [] sub1 = x.split(" ", 5);
		for(String m : sub1) { 
			System.out.println(m);
	}
		
		String [] z = k.split(" : ");
		for(String c: z) {
			System.out.println(c);
		}

}
}