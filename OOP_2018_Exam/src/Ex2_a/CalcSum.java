package Ex2_a;

public class CalcSum extends Thread {
	private int sum = 0;

	@Override
	public synchronized void run() {
		for(int i=1;i<=100000;i++) {
			sum = sum + i;
			
			
		}
		
		System.out.println("Current Thread: " + Thread.currentThread().getName() + " Sum: " + sum);
		
	}

	
	
	
	
	 

}
