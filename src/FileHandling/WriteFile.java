package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args){
		try {
			FileWriter fw = new FileWriter("src/FileHandling/First.txt");
			fw.write("This is a first file form java code ! \nOk will Meet soon ");
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
