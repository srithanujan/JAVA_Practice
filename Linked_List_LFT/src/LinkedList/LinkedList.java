package LinkedList;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{
	Node head;
	
	class Node {
		T data;
		Node next;
		
		Node(T val) {
			data = val;
			next = null;
			
			
			
		}
		
		
	}
	
	public LinkedList() {
		head = null;
		
	}
	
	public void insertAtBegining(T val) {
		Node newNode = new Node(val);
		if(head == null)
			head = newNode;
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
	
	public void insertAtPos(int pos, T val) {
		Node newNode = new Node(val);
		Node temp = head;
		if(pos == 0) {
			
			insertAtBegining(val);
			
		}
		for(int i = 1; i< pos;i++) {
			
			temp = temp.next;
			if(temp == null) {
				
				throw new IndexOutOfBoundsException("Invalid Pos " + pos);
			}
			
			
			
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
		
	}
	
	
	public void deleteAtPos(int pos) {
		if(head == null) {
			
			throw new IndexOutOfBoundsException("Deletion Attempted on Empty List");
		}
		
		if(pos == 0) {
			head = head.next;
			return;
		}
		
		Node temp = head;
		Node prev = null;
		
		for(int i = 1;i<=pos;i++) {
			
			prev = temp;
			temp = temp.next;
		}
		
		prev.next = temp.next;
		
	}
	
	public void deleteAtBeginning() {
		
        if(head == null) {
			
			throw new IndexOutOfBoundsException("Deletion Attempted on Empty List");
			
		}
        
        head = head.next;
		
	}
	
	
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			Node temp = head;
			
		public boolean hasNext() {
				return temp!= null;
				
			}
		
		public T next() {
			T val = temp.data;
			temp = temp.next;
			return val;
			
			
		}
			
		};
	}
	
}