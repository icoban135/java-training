package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "‪D:\\Files\\Passwords.txt";
		File file = new File(filename);
		file.setReadable(true);
		System.out.println(filename);
		String password = null;
		System.out.println(file.exists());
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			password = br.readLine();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Couldn't read the file");
			e.printStackTrace();
		}
		
		while (password != null) {
			try {
				if (!password.matches("[0-9]+")) {
					throw new NoNumberException(password);
				}
				if (!password.contains("[a-zA-Z]+")) {
					throw new NoLetterException(password);
				}
			} catch (NoNumberException e) {
				System.out.println("ERROR: Your Password Must Contain a Number");
				System.out.println(e.toString());
			} catch (NoLetterException e) {
				System.out.println("ERROR: Your password must contain a letter");
				System.out.println(e.toString());
			}
		}
	}

}

class NoNumberException extends Exception{
	String pw;
	NoNumberException(String pw){
		this.pw = pw;
	}
	
	public String toString() {
		return ("NoNumberException" + pw);
	}
}

class NoLetterException extends Exception {
	String pw;
	NoLetterException(String pw){
		this.pw = pw;
	}
	
	public String toString() {
		return ("NoLetterException" + pw);
	}
}

class NoSpecialChracterException {
	
}