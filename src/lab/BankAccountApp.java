package lab;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("859525859", 1000.50);
		BankAccount acc2 = new BankAccount("789553482", 2000);
		BankAccount acc3 = new BankAccount("586487952", 3000);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accure();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest {
	//Properties of bank account
	private static int ID = 1000; //Internal ID
	private String accountNumber; //ID + random 2=digid number + first 2 of SSN
	private static final String routingNumber = "00589785646125";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public  BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() *100);
		accountNumber = ID + "" + random + SSN.substring(0,2);
		System.out.println("Yout Account Number is: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying Bill: $" + amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making Deposit: $" + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: $" + balance );
	}

	@Override
	public void accure() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" +"[Balance " + balance + "]";
	}
}