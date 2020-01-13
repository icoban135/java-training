package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv {

	public static void main(String[] args) {
		// This method will read data from a CSV file
		List<String[]> data = new ArrayList<String[]>();
		String filename = "D:\\Files\\accounts.csv";
		String datarow;
		try {
			// open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			// Read the file as long is it's not empty
			
			while ((datarow = br.readLine()) != null) {
				//parse the data by commas
				String[] line = datarow.split(",");
				// Add the data to collection
				data.add(line);
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String[] account : data) {
			System.out.print("[ ");
			for(String field : account) {
				System.out.print(field + " ");
			}
			System.out.println(" ]");
		}
	}

}
