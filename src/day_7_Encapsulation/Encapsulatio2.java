package day_7_Encapsulation;

public class Encapsulatio2 {

	public static void main(String[] args) {

		Encapsulation e = new Encapsulation();
		
		e.myData();
		System.out.println(e.age);
		System.out.println(e.name);
		System.out.println();
		
		//e.setWage(1300);
		System.out.println(e.getWage());
		
		e.setName("sdet");
		System.out.println(e.getName());
		
		System.out.println(e.getAddress());
		
	}

}
