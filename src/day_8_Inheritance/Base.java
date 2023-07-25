package day_8_Inheritance;

public class Base {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.animalSound();
		
		
		Animal c = new Cat();
		c.animalSound();
		
		Animal d = new Dog();
		d.animalSound();
		
		System.out.println(c.age);

	}

}
