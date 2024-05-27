package Java;

import java.io.*;
import java.util.Scanner;

public class FileClass {

	public static void main(String[] args) {
		// The name of the file to open.
		String fileName = "Example.txt";

		// The text to write in the file.
		String content = "Hello, World! This is a test file.";

		// Write to the file using PrintWriter
		try (PrintWriter writer = new PrintWriter(new File(fileName))) {	//PrintWriter must be written in try()
			writer.println(content);
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}

		// Read from the file using Scanner
		try (Scanner scanner = new Scanner(new File(fileName))) {	//Scanner must be written in try()
			while (scanner.hasNextLine()) {	//This method look has a next line ?, return a boolean value.
				String line = scanner.nextLine();
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
		}
	}
}
