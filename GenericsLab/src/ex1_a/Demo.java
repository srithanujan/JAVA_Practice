package ex1_a;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an integer array with 10 elements
		int arr[] = { 29, 20, 34, 28, 39, 37, 22, 1, 45, 67 };
		
		// Call the bubblesort in the main function
		Sort sort = new Sort();
		sort.bubbleSort(arr);
		
		System.out.println("Sorted Array: ");
		for(int i = 0;i<10;i++) {
			System.out.println(arr[i] + " ");
			
		}
		

	}

}
