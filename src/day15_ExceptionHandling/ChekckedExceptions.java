package day15_ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class ChekckedExceptions {

	public static void main(String[] args) {

		// ctrl+shift+o
		
		
		myData();
		
		
		try {
			myMethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void myData() {

		File f = new File("note.txt");

		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
		public static void myMethod() throws IOException {
			
			File f = new File("book.txt");
			
			f.createNewFile();
		

	}

}
