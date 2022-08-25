package KOC;

class Main2 {

	public static void main(String[] args) {
		int [] numer = {4, 8, 16, 32};
		int [] denom = {2, 0, 4, 4};
		
		
		for(int x=0; x<numer.length;x++) {
		try {
			System.out.println(numer[x] / denom[x]);
			
		} catch(ArithmeticException ex) {
			System.out.println("You can't divide by 0");
			
		}
		}

	}

}
