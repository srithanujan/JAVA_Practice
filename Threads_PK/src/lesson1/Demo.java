package lesson1;

class MyClass extends Thread {

	
	public void run() {
		for(int i =0; i<10;i++) {
			System.out.println(Thread.currentThread().getId() + "Value " + i);
		}
			try {Thread.sleep(1000);} catch(InterruptedException e) {
				
			}
	}
	
}

public class Demo {

	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.start();
		
		MyClass myclass1 = new MyClass();
		myclass1.start();
		

	}

}
