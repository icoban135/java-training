package basics;

public class NumbersCal {
	
	public static void main(String[] args) {
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multipleNumbers(numA, numB);
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
	}
	
	static void printName() {
		System.out.println("My name is Ibrahim");
	}
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
	}
	static int multipleNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		return product;
	}
}
