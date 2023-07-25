package day6_Constructors;

public class Constructor2 {

	public static void main(String[] args) {
		
		// Constructor : It is like method
		// Constructor name should like the className
		// it has no return type
		
		// with parameter or without parameter
		
		Constructor2 c = new Constructor2();
		Constructor2 c1 = new Constructor2("book");
		Constructor2 c2 = new Constructor2(2, 4);
		
		c.myMethod();
		myData();
		c.myMethod2();
		
	}
	
	void myMethod() {
		
		System.out.println("myMethod");
		
	}
	
	public static void myData() {
		System.out.println("myData");
		
	}
	
    Constructor2(){
		
    	System.out.println("it is constructor");
	}
    
     int myMethod2() {
    	
    	int a = 20 ; 
    	System.out.println("myData2");
    	return a;
    }
    
    public String myMethod3() {
    	
    	String name = "sdet";
    	System.out.println(name);
    	return name;
    }
    
    // constructor with parameter
    
    Constructor2(String name){
   
    	System.out.println(name);
    	
    }
    
    // constructor with two parameters
    
    Constructor2(int a , double b){
    	
    	System.out.println(a);
    	System.out.println(b);
    }
	
	
	
	

}
