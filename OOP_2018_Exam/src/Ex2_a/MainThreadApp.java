package Ex2_a;

public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		CalcSum cal=  new CalcSum();
	CountDown cd =new CountDown();
		
		cal.start();
		cal.join();
		
		cd.start();
		cd.join();
		
		
		
		
		
		

	}

}
