package Java;

public class MultiThread {

	public static void main(String[] args) {
		Runnable printA = new PrintChar('A', 100);
		Runnable printB = new PrintChar('b', 100);
		Runnable printNum = new PrintNum(100);

		Thread t1 = new Thread(printA);
		Thread t2 = new Thread(printB);
		Thread t3 = new Thread(printNum);

		t1.start();
		t2.start();
		t3.start();
	}

}

class PrintChar implements Runnable {
	char c;
	int i;

	public PrintChar(char c, int i) {
		this.c = c;
		this.i = i;
	}

	public void run() {
		for (int i = 0; i < this.i; i++)
			System.out.print(c);
	}
}

class PrintNum implements Runnable {
	int num = 1;
	int i;

	public PrintNum(int i) {
		this.i = i;
	}

	public void run() {
		for (int i = 0; i < this.i; i++)
			System.out.print(" " + num++);
	}
}