package OOP;

class Num extends Thread {
public void run() {
		for(int i =0;i<=5;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
		
	}
}



public class MultiThreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Runnable book = new Runnable() {
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("Updating Db");
					try {Thread.sleep(2000);} catch(InterruptedException e) {}
			}
		}

		
	};
	
	Num num = new Num();
	
	Thread t1 = new Thread(book);
	t1.setName("book1");
	
	t1.start();
	num.start();
	
}

}
