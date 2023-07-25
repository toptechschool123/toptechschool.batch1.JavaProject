package day6_Constructors;

public class This_keyword {

	String name;
	int age; 
	
	public static void main(String[] args) {
// This keyword
		This_keyword k = new This_keyword("pen", 20);
		
		k.method();
		
		
	}
	
	This_keyword (String n , int a	){
		
		this.name = n;
		this.age = a;
		System.out.println(name);
		System.out.println(age);
		
	}
	void method() {
		int name = 500;
		System.out.println(name);
		
		
	}

}
