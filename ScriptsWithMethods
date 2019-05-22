
//Author: M.Brohi

/* Here is an Account program that you can implement, It makes an object of the class Account. 
simple script */





import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// 
		Account account1 = new Account("balosh", 14);
		Account account2 = new Account("john", 10);		//
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		
		account1.deposit(depositAmount);
	
		System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",account2.getName(),account2.getBalance());
	
	System.out.print("Enter deposit amount for account2:");
	depositAmount = input.nextDouble();
	System.out.printf("%nadding %2f to account2 balance%n%n", depositAmount);
	account2.deposit(depositAmount);
	//
	System.out.printf("%s balance: $% .2f%n", account1.getName(),account1.getBalance());
	System.out.printf("%s balance: $% .2f%n", account2.getName(),account2.getBalance());
	
	}

} 




public class Account {
	
	private String name; 
	private double balance;
	
	public Account(String name, double balance) {
		
		this.name = name;
		if(balance > 0.0) 
			this.balance = balance;  
	}
// 
	
	
public void deposit(double depositAmount) {
	if (depositAmount > 0.0) 
	
		balance = balance + depositAmount; }

	//

	public double getBalance() {
		return balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
		
