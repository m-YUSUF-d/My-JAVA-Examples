package Java;

class X {
	public void Calculate(double a, double b) {
		System.out.println("First double number is " + a + " and second double number is " + b + " from class A.");
	}
}

class Y extends X {
	public void Calculate(int a, int b) {
		System.out.println("First int number is " + a + " and second int number is " + b + " from class B.");
	}
}


public class Overloading {

	public static void main(String[] args) {
		Calculate(5, 10);
		Calculate(5.0, 10.0);

		System.out.print("\n");

		(new Y()).Calculate(5, 10);
		(new Y()).Calculate(5.0, 10.0);
	}

	public static void Calculate(int a, int b) {
		System.out.println("First int number is " + a + " and second int number is " + b + ".");
	}

	public static void Calculate(double a, double b) {
		System.out.println("First double number is " + a + " and second double number is " + b + ".");
	}
}
