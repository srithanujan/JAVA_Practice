package Q1_b;

public class NumbersThread extends Thread {
	
	public void run() {
		for(int i = 0;i<=100;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
		
		System.out.println("The Current Thread Name is " + Thread.currentThread().getName());
	}

}
