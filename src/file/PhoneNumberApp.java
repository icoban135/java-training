package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This will read a text file and retrieve phone number
		// valid phone Number:
			//10 digits long
			//Area code cannot start in 0 or 9
			// There can be no 911 in the phone#
		String filename = "D:\\Files\\PhoneNumber.txt";
		File file = new File(filename);
		String phoneNum = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			phoneNum = br.readLine();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not Fourd");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file");
			e.printStackTrace();
		}
		try {
			if (phoneNum.length() != 10) {
				throw new TenDigitsException(phoneNum);
			}
			if ((phoneNum.substring(0,1).contentEquals("0")) || (phoneNum.substring(0,1).contentEquals("9"))) {
				throw new AreaCodeException(phoneNum);
			}
			if (phoneNum.contains("911")) {
				throw new EmergencyException(phoneNum);
			}
			System.out.println(phoneNum);
		}  catch(TenDigitsException e ) {
			System.out.println("ERROR: Phone number is not 10 digits");
			System.out.println(e.toString());
		} catch (AreaCodeException e) {
			System.out.println("ERROR: Phone number has invalid area code");
			System.out.println(e.toString());
		} catch (EmergencyException e) {
			System.out.println("ERROR: Phone number cannot contain 911");
			System.out.println(e.toString());
		}
	}
}
class TenDigitsException extends Exception {
	String num;
	TenDigitsException(String num){
		this.num = num;
	}
	public String toString() {
		return ("TenDigitsException: " + num);
	}
}

class AreaCodeException extends Exception{
	String num;
	AreaCodeException(String num){
		this.num = num;
	}
	public String toString() {
		return ("AreaCodeException: " + num);
	}
}

class EmergencyException extends Exception {
	String num;
	EmergencyException(String num){
		this.num = num;
	}
	public String toString() {
		return ("EmergencyException: " + num);
	}
}
