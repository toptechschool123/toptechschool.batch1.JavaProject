package day12_Interface;

public interface Interface1 {
	
	public abstract void myData();
	public abstract void emData();
	public abstract void emSalary();

	
	default void myMethod() {
		System.out.println("hi there"); // java version 8 
	}
	
	
	public static void empAddress() {
		System.out.println("hello there");
	}
}
