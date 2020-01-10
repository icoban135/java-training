package oop_assagnment;

public class studentDatabase {
	private String SSN;
	private static int ID = 1000;
	private String userID; // Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
	private String name;
	private String phone;
	private String city;
	private String state;
	private String[] courses;
	private double balance;
	
	public studentDatabase(String name, String SSN) {
		this.SSN = SSN;
		ID++;
		generateUserID();
		System.out.println("New Student Enrolled");
	}
	public void enroll(String[] courses) {
		this.courses = courses;
	}
	private void generateUserID() {
		int random = (int) (Math.random() * 1000);
		userID = ID + "" + random + SSN.substring(5);
		System.out.println("Your User ID# is: " + userID);
	}
	public void pay(double amount) {
		balance = balance - amount;
	}
	public void showCourses() {
		System.out.println("Your Courses are: " + courses);
	}
	
	public void checkBalance() {
		System.out.println("Shows Balance");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPhone() {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
