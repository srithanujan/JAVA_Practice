package KOC;

public class Main {

	public static void main(String[] args) {
		
		ByTwos bt = new ByTwos();
		ByThrees bts = new ByThrees();
		
		Series ob;
		
		for(int i =0; i<5;i++) {
			ob = bt;
			System.out.println(ob.getNext());
			
			ob = bts;
			System.out.println(ob.getNext());

		
		}
		 
		
		
	}

}
