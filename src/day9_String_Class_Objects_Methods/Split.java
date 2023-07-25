package day9_String_Class_Objects_Methods;

public class Split {

	public static void main(String[] args) {

		String name = "New English book";
		String lastName = " Abdul @ karim ";
		String FullName = " Abdul : karim ";

		String[] a = name.split(" ");
		
		for(String var : a) {
			System.out.println(var);
		}
		
		System.out.println("******************");
		
		
		String[] b = lastName.split(" @ ");
		for(String v1 : b) {
			System.out.println(v1);
		}
	}

}
