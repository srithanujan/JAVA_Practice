package Genrics1;

import java.util.ArrayList;

public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Singram");
		al.add("Vimal");
		
		Alpha a = new Alpha();
		a.display(al);
		
		
		ArrayList<Integer> ali = new ArrayList<Integer>();
		ali.add(10);
		ali.add(20);
		a.display2(ali);
		
		

	}

	private void display2(ArrayList<Integer> ali) {
		// TODO Auto-generated method stub
		System.out.println(ali);
		
		
	}

	public void display(ArrayList<String> al) {
		// TODO Auto-generated method stub
		System.out.println(al);
		
		
	}
	
	

}
