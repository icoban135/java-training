package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "D:\\Files\\Passwords.txt";
		String[] passwords = new String[13];
		
		File file = new File(filename);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i<passwords.length; i++) {
				passwords[i] = br.readLine();
				}
			} catch (FileNotFoundException e) { System.out.println("ERROR: Couldn't find file");
			} catch (IOException e) {System.out.println("ERROR: Couldn't read file");}
		
		for (String password:passwords) {
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			boolean hasInvalidChar = false;
				
			for (int n = 0; n < password.length(); n++){
				//Condition 1: Contains Number
				if ("0123456789".contains(password.substring(n, n+1))) {
					//System.out.println("Position " + n + " contains a Number");
					hasNumber = true;
				} 
				//Condition 2: Contains A letter
				else if("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n,n+1).toLowerCase())) {
					//System.out.println("Position " + n + " contains a Letter");
					hasLetter = true;
				}
				//Condition 3: Contains Special character, !@#$
				else if("!@#$".contains(password.substring(n,n+1))) {
					//System.out.println("Position " + n + " contains a SpecialChar");
					hasSpecialChar = true;
				} else {
					try {
						throw new InvalidCharacterException(password.substring(n,n+1));
					}catch(InvalidCharacterException e){e.toString(); break;}	
				}							
			}
			try {
				if (!hasNumber) {throw new NumberCriteriaException(password);} 
				else if (!hasLetter) {throw new LetterCriteriaException(password);}	
				else if (!hasSpecialChar) {throw new SpecialCharCriteriaException(password);}
				else {System.out.println("Valid Password!");}
			} catch (NumberCriteriaException | LetterCriteriaException | SpecialCharCriteriaException e) {
				System.out.println("Invalid Password");
				System.out.println(e.toString());
			}
		}
	}
}
class InvalidCharacterException extends Exception{
	String ch;
	public InvalidCharacterException(String ch) {
		this.ch = ch;
	}
	public String toString() {
		return ("InvalidCharacterException: " + ch);
	}
}
class NumberCriteriaException extends Exception{
	String password;
	public NumberCriteriaException(String password) {
		this.password = password;
	}
	public String toString() {
		return ("NumberCriteriaException: " + password);
	}
}
class LetterCriteriaException extends Exception{
	String password;
	public LetterCriteriaException(String password) {
		this.password = password;
	}
	public String toString() {
		return ("LetterCriteriaException: " + password);
	}
}
class SpecialCharCriteriaException extends Exception{
	String password;
	public SpecialCharCriteriaException(String password) {
		this.password = password;
	}
	public String toString() {
		return ("SpecialCharCriteriaException: " + password);
	}
}