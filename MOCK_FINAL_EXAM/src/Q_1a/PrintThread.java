package Q_1a;

public class PrintThread extends Thread {
	
	public  void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
			
		}
	}
	

}
