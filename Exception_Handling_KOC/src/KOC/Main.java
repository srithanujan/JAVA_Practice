package KOC;

public class Main {

	public static void main(String[] args) {
		int [] nums = new int[5];
		nums[10] = 10;
		System.out.println("Something Important");
		
		try {
			System.out.println("In try 1");
			errorMethod(nums);
			System.out.println("In try 2");
			
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("In catch 1");
		}
		
		
		
		catch (Exception ex) {
			System.out.println("In catch");
			
		}
		
		System.out.println("Rest of the Program");

	}
	
	public static void errorMethod(int [] nums) {
		nums[10] = 10;
	}

}
