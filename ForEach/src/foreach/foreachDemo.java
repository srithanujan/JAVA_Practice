package foreach;

public class foreachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7};
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//			
//		}
		
		for(int x: arr) {
			System.out.println(x);
		}

	}

}
