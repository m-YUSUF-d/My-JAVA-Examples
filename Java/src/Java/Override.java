package Java;

class A {
	public void Calculate(int a, int b) {
		System.out.println("First number is " + a + " and second number is " + b);
	}
}

class B extends A {
	public void Calculate(int a, int b) {
		super.Calculate(a, b);
	}
}

public class Override {

	public static void main(String[] args) {
		(new B()).Calculate(1, 2);
	}
}
