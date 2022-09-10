package LinkedList;

public class Demo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertAtBegining(9);
		list.insertAtBegining(5);
		list.insertAtBegining(4);
		list.insertAtBegining(8);
		list.display();
		//list.insertAtPos(1, 10);
		list.deleteAtPos(0);
		list.display();
		
		

	}

}
