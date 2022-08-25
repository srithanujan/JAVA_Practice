package Q3_1;

public class InsufficientBalanceException extends Exception {
	private double amount;
	
	public InsufficientBalanceException(double amount) {
		this.amount = amount;
		
		
		
		
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	

}
 