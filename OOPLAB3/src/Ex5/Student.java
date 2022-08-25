package Ex5;

public class Student extends Person {
	
	String studentid;
	
	Student(String newName, String newAddress, String newStudentid) {
		super(newName, newAddress);
		studentid = newStudentid;
	}


	
	
	public void getDetails() {
		super.showDetails();
		System.out.println("My Student ID is : " + studentid);
	}
	
	
}
	
	


