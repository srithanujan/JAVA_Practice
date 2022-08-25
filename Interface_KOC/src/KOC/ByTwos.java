package KOC;

public class ByTwos implements Series {
	
	
	int val;
	
	ByTwos() {
		val =0;
	}

	@Override
	public int getNext() {
		if(val >= MAX) {
			System.out.println(ERRORMSG);
		} else {
			val += 2;
		}
		
		
		return val;
	}

	public int getPrev() {
		val -= 2;
		return val;
	}

}
