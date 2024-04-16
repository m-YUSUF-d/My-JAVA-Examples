package Java;

class Phone {

	String brand, model, color;
	double screenSize, RAM, storage;

	Phone(String brand, String model, String color, double screenSize, double RAM, double storage) {
		this.brand = brand;
		this.model = model;
		this.color = color;

		this.screenSize = screenSize;
		this.RAM = RAM;
		this.storage = storage;
	}

	public void getInformations() {
		System.out.println("Brand: " + brand + "\nModel: " + model + "\nColor: " + color + "\nScreen size: " + screenSize
				+ " inch\nRAM: " + RAM + " GB\nStorage: " + storage+" GB");
	}
}

class SmartPhone extends Phone {

	double screenResolution;
	
	public SmartPhone(String brand, String model, String color, double screenSize, double RAM, double storage,
			double screenResolution) {
		super(brand, model, color, screenSize, RAM, storage);
		this.screenResolution = screenResolution;
	}
}

public class Encapsulation {
	public static void main(String args[]) {
		SmartPhone smartphone = new SmartPhone("Casper", "A3", "Silver", 6.3, 4.0, 64.0, 1920);
		smartphone.getInformations();
		
		int[] dizi = {1,2,3,4,5};
		for(int x : dizi) {
			System.out.println(x);
		}
	}
}
