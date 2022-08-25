package generic;

public class Generic {
	
	// generic method printArray
	public static<E> void printArray(E[] inputArray ) {
		// Display array elements
		for(E element : inputArray) {
			System.out.printf("%s" , element);
		}
		System.out.println();
	}
	
	{
		// Display array elements
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.println("Array integerArray contains: ");
		printArray(intArray);
		
		System.out.println("\nArray doubleArray contains: ");
		printArray(doubleArray);
		
		 
		System.out.println("\nArray characterArray contains: ");
		printArray(charArray);
		
		

	}

}
