package day6_Constructors;

public class Cons {

	public static void main(String[] args) {

		Cons c = new Cons();
		Cons c1 = new Cons("Rafi");
		// c.cons();

	}

	Cons() {
		System.out.println("Rafi1");
	}

	Cons(String name) {

		System.out.println(name);
	}

}
