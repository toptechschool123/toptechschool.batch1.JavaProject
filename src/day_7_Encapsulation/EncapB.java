package day_7_Encapsulation;

public class EncapB {

	public static void main(String[] args) {


		EncapA a = new EncapA();
		
		System.out.println(a.x);
		System.out.println(a.z);
		System.out.println(a.getRate());
		a.setName("sdet");
		System.out.println(a.getName());
		a.setAddress("Seattle");
		System.out.println(a.getAddress());
	}

}
