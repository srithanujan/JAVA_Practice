package DoublyLinkedList;

public class DoublyLinkedList {
		Node head;
		Node tail;
	
	class Node {
		int data;
		Node next;
		Node prev;
		
		Node(int val) {
			data = val;
			next = null;
			prev = null;
			
		}
		
	}
	
	DoublyLinkedList() {
		head = null;
		tail = null;
	}
	
	public void insertAtBeginning(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			head.prev = newNode;
			
			
			
			
			
		}
		head = newNode;
	}
	
	public void display() {
		if(head == null) {
			System.out.println("List is Empty");
		}
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
			
		}
		
	}
	
	public void insertAtPos(int pos, int val) {
		
		if(pos == 0) {
			insertAtBeginning(val);
			return;
			
		}
		
		Node newNode = new Node(val);
		Node temp = head;
		
		for(int i = 1;i<pos;i++) {
			temp = temp.next;
			
		}
		
		newNode.next = temp.next;
		newNode.prev = temp;
		
		if(temp == tail) {
			tail = newNode;
		}
		else {
		temp.next = newNode;
		temp.next.prev = newNode;
		
		}
		
		
		if(head == null) {
			throw new IndexOutOfBoundsException("Invalid Pos " + pos);
			
		}
		
		
	}
	
	public void deleteAtPos(int pos) {
		Node temp = head;
		Node prev = null;
		
		if(pos == 0) {
			head = head.next;
			if(head == null)
				tail = null;
			else
				head.prev = null;
			return;
			
		}
		
		for(int i =1; i<=pos;i++) {
			prev = temp;
			temp = temp.next;
			
			if(temp == null)
				throw new IndexOutOfBoundsException("Invalid Position");
		}
		
		prev.next = temp.next;
		if(tail == prev)
			tail = prev;
		else
			temp.next.prev = prev;
		
		
		
	}
	
	public void deleteAtBeginning() {
		
		if(head == null) {
			throw new IndexOutOfBoundsException("Deletion attempted on Empty List");
		}
		
		head = head.next;
		
		if(head == null)
			tail = null;
		else
			head.prev = null;
			
		
	}

	
	public void displayRev() {
		if(head == null) {
			System.out.println("List is Empty");
		}
		Node temp = tail;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
		
		
		
	}
	
	
}