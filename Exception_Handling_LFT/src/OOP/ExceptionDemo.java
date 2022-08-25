package OOP;
import java.io.*;
import java.util.Scanner;
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		int b =5;
		int c =0;
		
		
		try {
		int arr[] = null;
//		System.out.println(arr[1]);
		
		 c = a/b;
		 System.out.println("Try Block");
		
		}
		catch(ArithmeticException e) {
			System.err.println("Error Occured");
			
		}
		catch(NullPointerException e) {
			System.err.println("Null pointer Exception has occured");
		}
		catch(Exception e) {
			System.out.println("Error Occured");
		}
		
		finally {
			System.out.println("This must Print");
		}
		
		File file = new File("abc.txt");
		try {
			FileInputStream fs = new FileInputStream(file);
		}
		catch(FileNotFoundException e) {
//			e.printStackTrace();
		
		
		}
		
		System.out.println(c);	
		System.out.println("End of Program!!");
		
		try(Scanner scanner = new Scanner(System.in)) {
			int i = scanner.nextInt();
		
		}
		
		
		}

}

