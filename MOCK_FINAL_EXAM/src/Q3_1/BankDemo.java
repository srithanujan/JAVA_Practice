package Q3_1;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account(123);
		System.out.println("Depositing Rs.10,000");
		account.deposit(10000.00);
		
		try {
			System.out.println("\nwithdrawing Rs.6,000");
			account.withdraw(6000.00);
			
			System.out.println("\nWithdrawing Rs.8,000");
			account.withdraw(8000.00);
			
		} catch(InsufficientBalanceException e) {
			System.out.println("Sorry, your account remains only Rs." + e.getAmount());
			e.printStackTrace();
		}

	}

}
