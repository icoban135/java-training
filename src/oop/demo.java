package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		person1.name = "Joe";
		person1.phone = "156488423";
		person1.email = "sadff@gmail.com";
		
		person1.walk();
		person1.sleep();
	}

}
