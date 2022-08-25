package Q3_1;

public class Account {
	double balance;
	int accountNo;
	
	
	
	
	InsufficientBalanceException ie;
	
	
	public Account(int accountNo) {
		this.accountNo = accountNo;
		
		
		 
	}
	
	public void deposit(double amount) {
		
		balance = balance + amount;
		
		
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		
		
	}

}
