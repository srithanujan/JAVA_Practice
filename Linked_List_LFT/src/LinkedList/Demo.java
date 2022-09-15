package LinkedList;



public class Demo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertAtBeginning(2);
		list.insertAtBeginning(5);
		
		
		list.display();
		
		System.out.println(" ");
		
		list.insertAtPos(1, 6);
		
		list.display();
		
		list.deleteAtPos(1);
		System.out.println();
		list.display();
		
		list.reverse();
		System.out.println();
		list.display();

	}

}
