package LinkedList;


public class LinkedList {
	Node head;
	
	class Node {
		int data;
		Node next;
		
		
		  Node(int val) {
			data = val;
			next = null;
			  
		}
		  
		  
	}
	
	LinkedList() {
		head = null;
		
	}
	
	public void insertAtBeginning(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
		}
		
		else {
			newNode.next = head;
			head = newNode;
			
			
		}
		
	}
	
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	public void insertAtPos(int pos, int val) {
		Node newNode = new Node(val);
		Node temp = head;
		
		if(pos == 0) {
			insertAtBeginning(val);
			return;
		}
		
		for(int i =0; i < pos; i++) {
			temp = temp.next;
			
		}
		
	    newNode.next = temp.next;
	    temp.next = newNode;
	    
	    if(head == null) {
	    	throw new IndexOutOfBoundsException("Invalid Pos" + pos);
	    }
		
		
		
		
		
	}
	
	public void deleteAtPos(int pos) {
		Node temp = head;
		Node prev = null;
		
		if(head == null) {
			throw new IndexOutOfBoundsException("Deletion attempted on Empty List");
		}
		
		if(pos == 0) {
			head = head.next;
			return;
		}
		
		for(int i = 1; i<=pos; i++) {
			prev = temp;
			temp = temp.next;
			
		}
		
		prev.next = temp.next;
		
		
		
	}
	
	public void deleteAtBeginning() {
		if(head == null) {
			throw new IndexOutOfBoundsException("Deletion attempted on Empty List");
		}
		
		head = head.next;
	}
	
	
	
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = head.next;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		
		head = prev;
		
	}
	
  
	
	
	
	
}