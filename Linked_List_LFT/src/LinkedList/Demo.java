package LinkedList;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		list.insertAtBegining(1);
		list.insertAtBegining(2);
		list.insertAtBegining(9);
		list.insertAtBegining(5);
		list.display();
		
		System.out.println("");
		//list.insertAtPos(5, 10);
		list.deleteAtPos(0);
		list.display();
		
		System.out.println();
		
		for(int a: list)
			System.out.println(a + " ");
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		

	}

}
