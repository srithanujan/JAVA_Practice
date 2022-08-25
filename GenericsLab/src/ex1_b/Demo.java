package ex1_b;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Float arr[] = {45f, 47f, 56f, 12f};
		Double arr2[] = {45.0, 46.0, 37.0,38.4};
		
		System.out.println("Float arry Element: ");
		Sort<Float> s1 = new Sort<>();
		s1.add(arr);
		s1.bubbleSort();
		s1.printArray();
		
		System.out.println("Double array Element: ");
		Sort<Double> s2 = new Sort<>();
		s2.add(arr2);
		s2.bubbleSort();
		s2.printArray();
		
		
		

	}

}
 