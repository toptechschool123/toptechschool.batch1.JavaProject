package day10_StringBuilder;

public class StringBuildeR {

	public static void main(String[] args) {


		String name = "school new";
		
		
		
		// TopTech school
		
		String name1 = "TopTechSchool";
		
		// immutable 
		
		String a = new String ("pen");
		
		//StringBuilder is a class in Java  which is mutable 
		
		StringBuilder x = new StringBuilder("Home");
		
		System.out.println(x);
		// insert();
		x.insert(0, "new");
		
		//System.out.println(x.insert(0, "new"));
		
		System.out.println(x);
		
		// append();
		
		x.append("land");
		System.out.println(x);
		
		// replace();
		x.replace(0, 3,"OLD");
		System.out.println(x);
		
		// delete();
		
		x.delete(0, 3);
		System.out.println(x);
		
		// deletecharAt();
		x.deleteCharAt(0);
		System.out.println(x);
		
		//reverse();
		x.reverse()	;
		System.out.println(x);
		
		// toString();
		String y = x.toString();
		System.out.println(y);
		
	
	//	y.reverse();
		System.out.println(y);
		
		StringBuilder y1 = new StringBuilder("Home");
		
		y1.reverse();
		System.out.println(y1);
		

	}

}
