package FileHandling;

import java.io.File;

public class DeletingFile {
	public static void main(String[] args) {

		File f = new File("src/FileHandling/First.txt");
		if(f.delete()) {
			System.out.println("File Deleted Succsesfully"+f.getName());
		}else {
			System.out.println("Get some error while deleting File "+ f.getName());
		}

	}
}
