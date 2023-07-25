package day5_Methods;

public class This_keyword {

	//int age = 20; // instance variable 
	static int age = 40; // class variable
	
	public static void main(String[] args) {
			
		This_keyword o = new This_keyword();
		
		o.getData();
		//System.out.println(o.age);
		System.out.println(age);


	}
	
	public void getData() {
		
		int age = 30; // local variable
		System.out.println(age);
	}

}
