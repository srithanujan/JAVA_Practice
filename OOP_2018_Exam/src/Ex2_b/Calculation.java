package Ex2_b;

public class Calculation {
	double ans;

	public double getAns() {
		return ans;
	}
	void Factorial(int start, int end) {
		for(int i = start; i<=end;i++) {
			ans *= (double)i;
		}
	}
	

	@Override
	public synchronized void run() {
	 
		
	
	}
}
