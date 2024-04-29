package Examples;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		
		while (true) {
			Fac(value);
		}
	}

	public static void Fac(Scanner value) {
		
		System.out.println("Enter a number : ");

		int num = value.nextInt();
		int result = 1;

		for (int i = num; i > 0; i--)
			result *= i;

		System.out.println(result + "\n");
	}
}
