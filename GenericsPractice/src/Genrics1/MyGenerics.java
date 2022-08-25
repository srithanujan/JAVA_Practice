package Genrics1;

public class MyGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericsDemo<String> gd1 = new GenericsDemo<String>("Singaram");
		gd1.show();
		GenericsDemo<Integer> gd2 = new GenericsDemo<Integer>(100);
		gd2.show();
		

	}

}
