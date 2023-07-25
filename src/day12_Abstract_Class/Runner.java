package day12_Abstract_Class;

public class Runner extends Abstract1 {

	public static void main(String[] args) {


		Runner r = new Runner();
		r.myMethod();
		r.myData();

	}

	@Override
	public void myMethod() {

		System.out.println("hello");
		
	}

	@Override
	public void empData() {


		
	}

	@Override
	public void empSalary() {
		
		
	}

}
