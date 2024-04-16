package Java;

public class Sinus {
	public static void main(String[] args) throws InterruptedException {

		int freaquency = 10;

		for (int degree = 0; degree <= 360; degree++) {
			double radyan = Math.toRadians(degree);
			double sin = Math.sin(freaquency * radyan);

			Print(sin);

			System.out.println();
			Thread.sleep(50);
		}
	}

	public static void Print(double sin) {

		int numberOfStars = (int) (Math.abs(sin) * 15);
		for (int i = 0; i < numberOfStars; i++) {
			System.out.print("*");
		}
	}
}