package Java;

import java.io.*;

public class FileClass {

	public static void main(String[] args) throws Exception {
		File f1 = new File("C:\\");
		File[] files = f1.listFiles();

		for (File file : files) {
			System.out.println(file.getName());
		}

		
	}
}
