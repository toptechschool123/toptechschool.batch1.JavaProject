package day_7_Encapsulation;

public class Encapsulation {
 // instance  variable // class varaible   --- global variable
	public int age = 40; // public --- all over 
	 String name = "Rafi"; // default --- package level
	
	private double wage  ; // private -- class level
	private String empName;
	private String address = "seattle";
	// getter and setter methods with public access modifiers
	public static void main(String[] args) {
		Encapsulation n = new Encapsulation();
		System.out.println(n.address);	

	}
	
	public void myData() {
		int a = 30;
		System.out.println("my data method");
	}

	
	  public void setWage(double wage) { 
		  this.wage = wage; }
	 
	public double getWage() {
		
		return wage;
	}
	
	public void setName(String empName) {
		this.empName = empName;
	}
	
	public String getName() {
		return empName;
	}
	
	public String getAddress() {
		return address;
	}
}
