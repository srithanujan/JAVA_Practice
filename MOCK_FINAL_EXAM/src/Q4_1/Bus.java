package Q4_1;

public class Bus extends Vehicle{
	int year;
	double manufacturerDiscount;
	
	
	
	
	public Bus(int speed, double regularPrice, String color,int year, double manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
		
	}




	@Override
	void getSalePrice() {
		double saleprice = regularPrice - manufacturerDiscount;
		System.out.println("Sale Price: " + saleprice);
	}
	

}
