package Ex5;

public class Person {
	String name,address;
	
	// parameterized constructor
	Person(String newName, String newAddress){
		
		name = newName;
	    address = newAddress;
		
	}
	
	public void showDetails() {
		System.out.println("My name is " + name);
		System.out.println("I am from " + address);
	}
	
}


