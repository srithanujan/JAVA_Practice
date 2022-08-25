package q1_c;

public class Calculation extends Thread {
	int total = 0;
	
	
	public void sum(int start, int end) {
		for(int i=start;i<=end;i++) {
			total += i;
			System.out.println(total);
		}
		
		
	}

	public int getTotal() {
		return total;
	}

	@Override
	public void run() {
		Calculation c = new Calculation();
		c.sum(int start, int end);
		
		
		
			
		
		
		

		
	}

}
