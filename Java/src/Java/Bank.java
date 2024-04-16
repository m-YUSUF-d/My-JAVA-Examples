package Java;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		float money = 1000;
		boolean condition = true;

		while (condition) {
			Scanner value = new Scanner(System.in);
			System.out.println(
					"Enter a number : \n1. Show balance\n2. Deposit money \n3. Withdraw money \n4. Log out of the system\n");

			int num = value.nextInt();

			switch (num) {
			case 1:
				Show(money);
				break;

			case 2:
				money += Yatir();
				break;

			case 3:
				money -= Cek(money);
				break;

			default:
				Exit(condition);
				break;
			}
			value.close();
		}
	}

	public static void Show(float money) {
		System.out.println(money);
	}

	public static float Yatir() {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter value : ");

		float num = value.nextFloat();
		value.close();

		return num;
	}

	public static float Cek(float mon) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter value : ");

		float num = value.nextFloat();
		value.close();

		if (num > mon) {
			System.out.println("Insufficient funds.\n");
			return 0.0f;
		} else {
			return num;
		}
	}

	public static void Exit(boolean condition) {
		condition = false;
	}
}