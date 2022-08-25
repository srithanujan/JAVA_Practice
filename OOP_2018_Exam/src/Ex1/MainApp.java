package Ex1;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Item> items =  new ArrayList<>();
		
		
		Item b1 = new Book(001, "BestSeller", 300.0, "Robin Sharma", "Non-Fiction",345);
		Item b2 = new Book(002, "Fastseller", 350.0, "Joseph Murphy", "Fiction", 450);
		
		items.add(b1);
		items.add(b2);
		
		Item c1 = new Car(0001, "Class A", 2500000.0, "ModelS", "Roadmaster");
		Item c2 = new Car(0002, "Class B", 1300000.0, "Corolla", "Classic");
		
		items.add(c1);
		items.add(c2);
		
		
		for(Item it : items) {
			it.Display();
			
		}
		
		
		

	}

}
