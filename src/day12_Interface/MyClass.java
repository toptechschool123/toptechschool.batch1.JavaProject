package day12_Interface;

public class MyClass implements Interface1,Interface2{

	public static void main(String[] args) {

		MyClass c = new MyClass();
		
		c.myMethod();
		Interface1.empAddress();
	
	}

	@Override
	public void myData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emSalary() {
		// TODO Auto-generated method stub
		
	}

	public void empRoles() {
		// TODO Auto-generated method stub
		
	}

	public void empNames() {
		// TODO Auto-generated method stub
		
	}

	public void empCities() {
		// TODO Auto-generated method stub
		
	}

}
