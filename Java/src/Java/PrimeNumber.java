package Java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean check = true;
		int number;

		Scanner input = new Scanner(System.in);

		while (check) {
			System.out.print("Enter number : ");
			number = input.nextInt();

			for (int i = 2; number / 2 >= i; i++) {
				if (number % i == 0) {
					check = false;
					break;
				}
			}

			if (check == true)
				System.out.println(number + " is a prime number.\n");

			else
				System.out.println(number + " isn't a prime number.\n");

				check = true;
		}
		input.close();
	}
}
