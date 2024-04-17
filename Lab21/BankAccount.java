package Lab21;
import java.util.Scanner;
public class BankAccount {
	Scanner sc = new Scanner(System.in);
	double balance =2000; 
	void deposit() {
		try {
		 System.out.println("Enter deposited amount: ");
         double amount = sc.nextDouble();
         if(amount>=0) {
			balance = balance+amount;
	        System.out.println("Deposited: " + amount);
	     } 
		 else{   
	         
			 throw new IllegalArgumentException("Amount cannot be negative");
	     }
		 System.out.println("Current Balance: "+balance);
	}
		catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
	void withdraw() {
		
		try {
			System.out.println("Enter withdraw amount: ");
			double amount = sc.nextDouble();
        if(amount<0){  
            throw new IllegalArgumentException("Withdrawal amount cannot be negative");
        }

        if(amount>balance) { 
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance = balance-amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Current Balance: "+balance);
		}
		catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}
	public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.deposit();
        obj.withdraw();

    }


}
