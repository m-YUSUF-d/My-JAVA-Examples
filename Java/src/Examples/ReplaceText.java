package Examples;

import java.io.*;

public class ReplaceText {

	public static void main(String[] args) {
		File targetFile = new File(args[1]);
		if (!targetFile.exists())
			System.out.println("Source file " + args[0] + " does not exist");

	}

}
