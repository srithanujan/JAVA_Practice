package Ex2_a;

public class CountDown extends Thread {
	
	public synchronized void run() {
		for(int i =1;i <=10;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
	

}


