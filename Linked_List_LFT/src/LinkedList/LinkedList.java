package LinkedList;



public class LinkedList {
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int val) {
			data = val;
			head = null;
		}
		
	}

	
	
	LinkedList() {
		head = null;
		
	}
	
	
	public void insertAtBegining(int val) {
		Node newNode = new Node(val);
		
		if(head == null)
			newNode = head;
		else
			newNode.next = head;
			head = newNode;
		
		
	}
		
		
	
	
	public void display() {
		Node temp = head;
		while(head != null) {
			System.out.print(temp.data + " ");
		     temp = temp.next;

		}
		
		
			
		
		
		
	}
	
	public void insertAtPos(int pos, int val) {
		if(pos == 0)
		{
			insertAtBegining(val);
			return;
		}
		Node newNode = new Node(val);
		Node temp = head;
		
		for(int i = 1; i < pos; i++) {
			temp = temp.next;
			if(temp == null) {
				throw new IllegalArgumentException("Invalid Pos " + pos);
			}
			
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
			
		
		
	}
	
	public void deleteAtPos(int pos) {
		if(head == null) 
			throw new IndexOutOfBoundsException("Deletion Attempted on Empty List");
		
		if(pos == 0) {
			head = head.next;
		    return;
		    
		}
		
		
		Node temp = head;
		Node prev = null;
		
		for(int i = 1; i <= pos; i++) {
			prev = temp;
			temp = temp.next;
			
		}
		
		prev.next = temp.next;
		
	}
	
	public void deleteAtBegining() {
		if(head == null) 
			throw new IndexOutOfBoundsException("Deletion Attempted on Empty List");
		
		
		    head = head.next;
	}
	
}