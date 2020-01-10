package oop;

public class BankAccount {
	String accountNumber;
	static final String routingNumber = "01574895";
	String name;
	String ssn;
	String accountType;
	String balance;
	
	BankAccount(){
		System.out.println("New Account Created");
	}
	
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType ,double initDeposit){
		System.out.println("New ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		balance = balance + initDeposit;
	}
	void deposit() {
		
	}
	void withdraw() {
		
	}
	
	void checkBalance() {
		System.out.println("Balance: $"+ balance);
	}
}
