package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreatingTextFIle {
	public static void main(String[] args) throws IOException {
		String path = "src/FileHandling/Test.txt";
		
		File file = new File(path);
		
		FileWriter fw = new FileWriter(file,true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a data ");
		
		String input = sc.nextLine();
		
		bw.write(input);
		
		System.out.println("Data succsessfully added ! ");
		
		bw.close();
		fw.close();
	}
}
