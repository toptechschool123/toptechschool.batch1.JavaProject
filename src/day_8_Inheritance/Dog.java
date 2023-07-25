package day_8_Inheritance;

public class Dog extends Animal {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.animalSound();
		
	}
	
	void animalSound() {
		super.animalSound();
		System.out.println("it is dog class");
	}

}
