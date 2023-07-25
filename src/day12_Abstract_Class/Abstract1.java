package day12_Abstract_Class;

public abstract class Abstract1 {

	// obstract class can not be instantiated
	// abstract key word is used to make a class and methods abstract
	// abstract method does not have a body.
	// abstract class can have both concrete/regular method and abstract methods
	// abstract class can be implemented by a child using inheritance
	

	public void myData() {

		System.out.println("hi there");

	}

	public abstract void myMethod();

	public abstract void empData();
	public abstract void empSalary();
}