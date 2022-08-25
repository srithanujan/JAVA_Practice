package Ex1;

public class Car extends Item {
	String model;
	String type;
	
	public Car(int itemNo, String description, double unitPrice, String model, String type) {
		super(itemNo, description, unitPrice);
		this.model = model;
		this.type = type;
		
	}
	
	@Override
	public void Display() {
		super.Display();
		System.out.println("Model " + model);
		System.out.println("Type " + type);
		System.out.println();
	}
	

}
