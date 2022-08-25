package OOP;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		for(int i =1;i<10;i++) 
			alist.add(i);
			
//		System.out.println(alist);
		System.out.println(alist.get(3));
		alist.set(1, 8);
		alist.remove(1);
//		alist.clear();
//		System.out.println(alist);
		
//		for(int i: alist)
//			System.out.println(i);
//		
		
		Iterator<Integer> i = alist.iterator();
		System.out.println("Using Iterator");
		
		
			
//		System.out.println(i.next());
//		System.out.println(i.next());
		
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		ArrayList<String> slist = new ArrayList<String>();
		
		slist.add("Sri");
		slist.add("Thanu");
		
		System.out.println(slist);
		
	}

}
