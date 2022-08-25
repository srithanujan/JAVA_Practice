package Q_1a;

public class SLIITThread extends Thread{
	
	public  void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("SLIIT");
			try {Thread.sleep(2000);} catch(InterruptedException e) {}
		}
	}

}
