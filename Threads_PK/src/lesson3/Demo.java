package lesson3;

public class Demo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				
				for(int i =0; i<10; i++) {
					System.out.println(Thread.currentThread().getId() + "Value : " +i);
				}
				try {
					Thread.sleep(2000);
				} catch(InterruptedException e) {
			}
			}
			
		});
		
		t1.start();
		

	}

}
