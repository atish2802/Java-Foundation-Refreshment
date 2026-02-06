package com.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsException {
	public static void readFile() throws IOException{
		FileReader fr = new FileReader("abc.txt");
		fr.read();
		fr.close();
	}
	public static void main(String[] args) {
		try {
			readFile();
		}catch(IOException e) {
			System.out.println("FileNotFound or read Error");
		}
	}
}
