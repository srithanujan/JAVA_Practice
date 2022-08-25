package Ex8;

public class Dog extends Pet {
	int noOfMasters;
	
	
	Dog(String name, String owner, int master){
		super(name, owner);
		this.noOfMasters = master;
		
	
		
	}
	
	Dog(String name, String owner) {
		super(name, owner);
	}
	
	public void getDetails() {
		super.showDetails();
		System.out.println("I am Dog. I have " + this.noOfMasters + " Masters" );
	}

}
