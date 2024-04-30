package Java;

//Parent class
class Vehicle {
	public void drive() {
		System.out.println("Vehicle is being driven.");
	}
}

//Subclass
class Car extends Vehicle {

	public void drive() {
		System.out.println("Car is being driven.");
	}

	public void honk() {
		System.out.println("Car is honking.\n");
	}
}

//Another subclass
class Bicycle extends Vehicle {

	public void drive() {
		System.out.println("Bicycle is being ridden.");
	}

	public void ringBell() {
		System.out.println("Bicycle is ringing bell.\n");
	}
}

public class Castings {
	public static void main(String[] args) {
		// Upcasting: Car object is upcasted to Vehicle reference
		Vehicle vehicle1 = new Car();

		// Downcasting
		if (vehicle1 instanceof Car) {
			Car car = (Car) vehicle1; // Explicit downcasting
			((Car) vehicle1).drive(); // Output: Car is being driven
			car.honk(); // Output: Car is honking
		}

		// Upcasting: Bicycle object is upcasted to Vehicle reference
		Vehicle vehicle2 = new Bicycle();

		// Downcasting
		if (vehicle2 instanceof Bicycle) {
			Bicycle bicycle = (Bicycle) vehicle2; // Explicit downcasting
			((Bicycle) vehicle2).drive(); // Output: Bicycle is being ridden
			bicycle.ringBell(); // Output: Bicycle is ringing bell
		}
	}
}
