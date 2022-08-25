package Q4_1;

public class Truck extends Vehicle {
	double weight;
	

	public Truck(int speed, double regularPrice, String color, double weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
		
		
		
	}

	public double getRegularPrice() {
		return regularPrice;
	}

	@Override
	void getSalePrice() {
		if(weight > 2000) {
			double discount = (10/100) * regularPrice;
			regularPrice = regularPrice - discount;
			System.out.println("Sale Price: " + regularPrice);
		
	}else {
		double discount = (20/100) * regularPrice;
		regularPrice = regularPrice - discount;
		System.out.println("Sale Price: " + regularPrice);
	}

}
}
