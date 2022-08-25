package ex1_d;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Float[] arr1 = {23f, 35f, 56f, 78f};
		Double[] arr2 = {23.0, 45.8, 37.9, 36.4};
		
		
		Sort s1 = new Sort();
		
		s1.bubbleSort(arr1);
		s1.printArray(arr1);
		s1.bubbleSort(arr2);
		s1.printArray(arr2);
		
		
		
		
	}

}
