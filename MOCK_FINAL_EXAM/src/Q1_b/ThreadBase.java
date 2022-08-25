package Q1_b;

public class ThreadBase extends Thread {
	
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("SLIIT");
		}
	}
	
	
	
	
public static void main(String[] args) throws InterruptedException  {
	
	
	NumbersThread nt1 = new NumbersThread();
	NumbersThread nt2 = new NumbersThread();
	NumbersThread nt3 = new NumbersThread();
	
	
	nt1.setName("Red");
	nt2.setName("Blue");
	nt3.setName("Green");
	
	
	nt1.start();
	nt1.join();
	if(nt1.isAlive()) {
		System.out.println("Thread is Alive");
	}
	System.out.println("State: " + nt1.getState());
	nt2.start();
	nt2.join();
	nt3.start();
	nt3.join();
	
	
	
		
	}

}

