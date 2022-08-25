package Ex1;

public class StudentName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentArray[] = new Student[5];
		
		studentArray[0] = new Student("Kamal", "974838", "IT");
		studentArray[0].print();
		
		System.out.println();
		
		studentArray[1] = new Student("Amal", "974839", "BM");
		studentArray[1].print();
		
		System.out.println();
		
		studentArray[2]  = new Student();
		studentArray[2].setName("Nimal");
		studentArray[2].setMobile("773822");
		studentArray[2].setDegree("ISE");
		studentArray[2].print();
		
		

	}

}
