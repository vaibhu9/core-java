package ProgramOnInheritanceInJAVA;

abstract class Animal{
	abstract void makeSound();
}

class Dog extends Animal{
	void makeSound() {
		System.out.println("\nDogs Sound like as :\tBark");
	}
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("\nCats Sound like as :\tMau");
	}
}
public class AnimalApp {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.makeSound();
		
		Cat c=new Cat();
		c.makeSound();

	}

}
