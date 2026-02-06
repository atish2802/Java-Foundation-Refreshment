package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	public static void main(String[] args) throws IOException {
		File myFile = new File("src/FileHandling/First.txt"); // Save inside src
		myFile.createNewFile();
		System.out.println("File created");
	}
}
