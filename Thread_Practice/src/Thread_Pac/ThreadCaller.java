package Thread_Pac;

public class ThreadCaller {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChildThread ct = new ChildThread();
		ct.start();
		ct.join();
		
		for(int i = 1; i<=5; i++) {
			System.out.println("Main Thread " + i);
		}

	}

}
