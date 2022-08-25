package Thread_Pac;

public class ChildThread extends Thread {
	
	public void run()
	{
		for(int i =1; i<10; i++) {
			try { Thread.sleep(1000);
			System.out.println("Child Thread " + i);
			}  catch (InterruptedException e) {
				e.printStackTrace();
			}
						
		}
			
		
	}
	

}
