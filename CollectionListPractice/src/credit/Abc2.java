package credit;

import java.util.ArrayList;
import java.util.List;

public class Abc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		System.out.println(l);
		
		List l2 = l.subList(3, 5);
		System.out.println(l2);
//		System.out.println(l.set(2, "ABCD"));
//		System.out.println(l);
		

	}

}
