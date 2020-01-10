package oop_assagnment;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("Jane", "159784856");
		Student stu2 = new Student("Joe", "789561798");
		Student stu3 = new Student("Jennifer", "986588956");
		
		stu1.enroll("Mat135");
		stu1.enroll("Eng458");
		stu1.enroll("Phc102"); 
		stu1.payTuition(1000);
	
		System.out.println(stu1.toString());
	}
	

}

class Student {
	private String ssn;
	private String userID;
	private String name;
	private String phone;
	private String city;
	private String state;
	private String email;
	private static int iD = 1000;
	private String courses = "";
	private int balance = 0;
	private static final int costOfCourse = 800;
	
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setEmail();
		setUserID();
		
	}
	
	private void setEmail(){
		email = name.toLowerCase()+ "."+ iD + "@javaedu.com";
		System.out.println("Your email adress: "+ email);
	}
	
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
	private void setUserID() {
		int min = 1000;
		int max = 9000;
		int randNum = (int) (Math.random()*((max-min)+1))+min;
		userID = iD + "" + randNum + ssn.substring(5);
		System.out.println("Your user ID: " + userID);
	} 
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		balance = balance + costOfCourse;
	}
	public void payTuition(int amount) {
		balance = balance - amount;
	}
	public void checkbalance() {
		System.out.println("Your Balance: $" + balance);
	}
	public void showCourses() {
		System.out.println("Your Courses: " + courses);
	}
	public String toString() {
		return "[NAME: " + name + "]\n[COURSES: " + courses + "]\n[BALANCE: $" + balance + "]";
	}
}
