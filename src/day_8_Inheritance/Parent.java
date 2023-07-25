package day_8_Inheritance;

public class Parent {
		private String address = "WA";
		String name = "sdet";
		int wage = 3000;
		double salary = 40000;
		
	public static void main(String[] args) {



	}
	
	public void parentMethod() {
		System.out.println(name);
		System.out.println("parent method");
	}
	public String getAddress() {
		return address;
	}
	
}
