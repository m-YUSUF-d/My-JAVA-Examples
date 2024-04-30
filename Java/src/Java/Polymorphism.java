package Java;

//Parent class
class Animal {
	public void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//Subclass
class Dog extends Animal {
	public void makeSound() {
		System.out.println("Dog barks");
	}
}

//Another subclass
class Cat extends Animal {

	public void makeSound() {
		System.out.println("Cat meows");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal cat = new Cat(); // Polymorphic behavior

		dog.makeSound(); // Output: Dog barks
		cat.makeSound(); // Output: Cat meows
	}
}
