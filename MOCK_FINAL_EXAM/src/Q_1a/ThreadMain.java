package Q_1a;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Thread t1 = new Thread(new PrintThread());
		Thread t2 = new Thread(new SLIITThread());
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		
	
		

	}

}
