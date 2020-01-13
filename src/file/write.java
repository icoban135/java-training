package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class write {

	public static void main(String[] args) {
		// 1.Define the path that we want to write
		 String filename = "D:\\Files\\fileToWrite";
		 String message = "This message is written through java";
				
		// 2.Create the file in java
		File file = new File(filename);
		// 3.Open the file
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			
			// 4.Write to the file
			fw.write(message);
			
			// 5. Close the resources
			fw.close();
			
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file: " + file);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the filewriter");
		}

	}

}
