package Array;

import java.util.Scanner;

class DynamicArray {
	private static final int initialCapacity = 16;
	private int arr[];
	private int size;
	private int capacity;
	
	
	DynamicArray() {
		size = 0;
		arr = new int[initialCapacity];
		capacity = initialCapacity;
		
	}
	
	public void add(int val) {
		if(size == capacity) 
			expandArray();
		arr[size++] = val;
	}
	
	
	private void expandArray() {
		capacity *=2;
		arr = java.util.Arrays.copyOf(arr, capacity);
	}
	
	public void display() {
		System.out.println("Elements in the List: ");
		for(int i =0; i< size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public void insertAtPos(int pos, int val) {
		if(size == capacity)
			expandArray();
		for(int i=size-1; i>=pos;i--)
			arr[i+1] = arr[i];
		arr[pos] = val;
		size++;
			
	}
	
	public void deleteAtPos(int pos) {
		for(int i=pos+1;i<size;i++)
			arr[i-1] = arr[i];
		
		size --;
		
		if(capacity > initialCapacity && capacity > 3*size)
			shrinkArray();
			
	}
	
	private void shrinkArray() {
		capacity /= 2;
		arr = java.util.Arrays.copyOf(arr, capacity);
	}
	
	public int length() {
		return size;
	}
	
	
}

public class DynamicArrayDemo {
	

	public static void main(String[] args) {
		int val,pos;
		
		DynamicArray list = new DynamicArray();
		DynamicArray list2 = new DynamicArray(); 
		DynamicArray list3 = new DynamicArray(); 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("\n -------- List Menu --------\n");
		System.out.println("1.Insert at End\n");
		System.out.println("2.Display the list\n");
		System.out.println("3.Insert at the specified Position \n");
		System.out.println("4.Delete from the specified position\n");
		System.out.println("5.Exit\n");
		System.out.println("\n-------------------------------------");
		System.out.println("Enter your choice:\t");
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Enter the data: ");
				val = scanner.nextInt();
				list.add(val);
				break;
		case 2: list.display();
				break;
		case 3: System.out.println("Enter the pos (starts at 0): ");
				pos = scanner.nextInt();
				if(pos<0) {
					System.out.println("Invalid Position");
					break;
				}
				System.out.print("Enter the Data: ");
				val = scanner.nextInt();
				list.insertAtPos(pos, val);
				break;
		case 4: System.out.println("Enter the pos (starts at 0): ");
				pos = scanner.nextInt();
				if(pos<0) {
					System.out.println("Invalid Position");
					break;
					
				}
				list.deleteAtPos(pos);
				break;
		case 5: System.exit(0);
		
		default: System.out.println("Invalid Choice");
				
			
				
		}
		
		
		}

	}

}
