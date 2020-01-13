package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreditCardApp {
	public static void main(String[] args) {
		// Read a credit card CSV statement
		List<String[]> data = new ArrayList<String[]>();
		String filename = "D:\\Files\\creditCardApp.csv";
		// Creating a balance variable that calculates the running balance of the user’s account
		double balance = 0;
		String datarow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			while ((datarow = br.readLine()) != null) {
				String[] line = datarow.split(",");
				System.out.println(datarow);
				data.add(line);
			} br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 	
		catch (IOException e) {
			e.printStackTrace();
		} 
		for (String[] line : data) {
			for (int i = 0; i < line.length ; i++) {
				double amount;
				amount = Double.parseDouble(line[3]);
				// If the field says CREDIT, then add the amount to the balance
				if (line[i].equals("DEBIT")) {
					balance = balance - amount;	
				} else if (line[i].equals("CREDIT") || line[i].equals("FEE")) {
					// If the field says DEBIT, then subtract the amount to the balance
					balance = balance + amount;
				}
			}
		}
		if (balance > 0) {
			// If the final amount is greater than zero, charge a 10% fee and warn the user
			double fee = balance * 0.1;
			balance = balance + fee;
			System.out.println("Your have a existiong balance of: $" + balance +" including the late fee of $" + fee );
			//If the final amount is zero, thank the user for their payments
		} else if (balance == 0) {
			System.out.println("Your balance is 0 thank you for your payment.");
		} else {
			// If the final amount is less than zero, thank the user for their payment and display their overpayment.
			System.out.println("Thank you for your payment you have over payed for the amount of $" + Math.abs(balance));
		}
	}

}