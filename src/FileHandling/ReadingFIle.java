package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFIle {
	public static void main(String[] args) {
		File rf = new File("src/FileHandling/First.txt");
		try {
			Scanner sc = new Scanner(rf);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
