package Java;

interface Edible {
	public void howToEat();
}

class Chicken implements Edible {
	public void howToEat() {
		System.out.println("Fry and eat.");
	}
}

public class Interface {

	public static void main(String[] args) {
		Object chicken = new Chicken();
		if (chicken instanceof Edible)
			((Chicken) chicken).howToEat();
	}
}
