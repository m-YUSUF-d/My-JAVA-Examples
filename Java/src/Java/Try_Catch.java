package Java;

import java.util.Scanner;

public class Try_Catch {
	public static void main(String[] args) {

		int a, b;
		boolean continueInput = true;

		Scanner value = new Scanner(System.in);

		do {
			try {
				System.out.println("Enter two number: ");
				a = value.nextInt();
				b = value.nextInt();

				System.out.println("a/b : " + a / b + "\n");

			} catch (ArithmeticException ex) {
				System.out.println("Divisor can't be zero.\n");
			}

		} while (continueInput);

		value.close();
	}
}
