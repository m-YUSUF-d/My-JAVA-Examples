package Java;

import java.util.Scanner;

public class Throws {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter exception kode : ");
		Scanner value = new Scanner(System.in);
		a = value.nextInt();

		try {
			ErrorThrower(a);
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException error.");

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException error.");

		} catch (Exception ex) {
			System.out.println("What kind of exception error is that ?" + ex);
		} finally {
			value.close();
		}
	}

	static void ErrorThrower(int a) throws Exception {
		int[] array = new int[5];

		switch (a) {
		case 1:
			array[0] = 5 / 0;
			break;
		case 2:
			array[array.length] = 0;
			break;
		}
	}
}
