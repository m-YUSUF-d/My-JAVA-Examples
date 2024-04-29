package Java;

public class Throws {

	public static void main(String[] args) {
		try {
			ErrorThrower();
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException error.");

		} catch (Exception ex) {
			System.out.println("What kind of exception error is that.");

		}
	}

	static void ErrorThrower() throws ArithmeticException {
		int[] array = new int[5];
		array[0] = 5 / 0;
	}
}
