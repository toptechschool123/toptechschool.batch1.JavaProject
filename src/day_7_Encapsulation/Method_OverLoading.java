package day_7_Encapsulation;

public class Method_OverLoading {

	public static void main(String[] args) {
		
		// instantiate  // instance
		
		Method_OverLoading m = new Method_OverLoading();
		Method_OverLoading m1 = new Method_OverLoading(5000);
		Method_OverLoading m2 = new Method_OverLoading("note", 9000);
		Method_OverLoading m3 = new Method_OverLoading(4000, "pen");
		m.myData();
		m.myData(100);
		m.myData(30, "sdet");
		m.myData("book", 10);
		m.myData(100.3);
		
	}
	
	public void myData() {
		
		System.out.println("hi");
	}
	
	public void myData(int a) {
		System.out.println(a);
	
	}
	
	public void myData(String name , int age) {
		System.out.println(name + age);
	}
	public void myData(int age, String name) {
		System.out.println( age + name);
	}
	public void myData(double a) {
		System.out.println(a);
	
	}
	public Method_OverLoading (){  // difference between method and constructor: cons. does not have return type
		                    // cons. name is the same as className
							// cons. is invoked when object of the class is created
		
		
		System.out.println(" it is constructor ");
	}
	
	public Method_OverLoading(int a) { 
		
		System.out.println(a);
	}
	
	public Method_OverLoading (String name , int age) {
		System.out.println(name + " " + age);
	}
	
   public Method_OverLoading (int age , String name) {
		System.out.println(age + " "  + name);
	}
	
}
