package noGeneric;

public class NoGeneric {
	
	public static void printArray(Integer[] inputArray)
	{
		//Display Array Elements
		for(Integer element : inputArray) {
			System.out.printf("%s " , element);
			
		}
		System.out.println();
		
	}
	
	public static void printArray(Double[] inputArray)
	{
		//Display Array Elements
		for(double element : inputArray) {
			System.out.printf("%s " , element);
			
		}
		System.out.println();
		
	}
	
	public static void printArray(Character[] inputArray)
	{
		//Display Array Elements
		for(Character element : inputArray) {
			System.out.printf("%s " , element);
			
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Create arrays of Integer, Double and Character
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.println("Array integerArray contains: ");
		printArray(intArray); // Pass the Integer Array
		
		System.out.println("\nArray doubleArray contains: ");
		printArray(doubleArray); // Pass a Double Array
		
		System.out.println("\nArray characterArray contains: ");
		printArray(charArray); // Pass the Character Array

	}

}
