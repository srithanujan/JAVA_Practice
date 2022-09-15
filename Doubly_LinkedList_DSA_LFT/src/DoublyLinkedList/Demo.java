package DoublyLinkedList;

public class Demo {

	public static void main(String[] args) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertAtBeginning(3);
		list.insertAtBeginning(2);
		list.insertAtBeginning(7);
		
		list.display();
		System.out.println(" ");
		list.displayRev();
		
		list.deleteAtPos(6);
		
		
		System.out.println("");
		list.display();
		System.out.println("");
		list.displayRev();

	}

}
