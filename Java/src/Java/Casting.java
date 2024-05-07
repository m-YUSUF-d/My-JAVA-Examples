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

public class Casting {
	public static void main(String[] args) {
		// Upcasting: Car object is upcasted to Vehicle reference
		Vehicle vehicle1 = new Car();
		vehicle1.drive();
		/* vehicle1.honk(); Vehicle class don't include honk() method */

		if (vehicle1 instanceof Car) {// Downcasting

			Car car = (Car) vehicle1; // Explicit downcasting
			car.honk();
		}

		// Upcasting: Bicycle object is upcasted to Vehicle reference
		Object vehicle2 = new Bicycle();
		/* vehicle2.ringBell(); Vehicle class don't include ringBell() method */

		if (vehicle2 instanceof Bicycle) {// Downcasting

			Bicycle bicycle = (Bicycle) vehicle2; // Explicit downcasting
			bicycle.ringBell();
		}
	}
}
