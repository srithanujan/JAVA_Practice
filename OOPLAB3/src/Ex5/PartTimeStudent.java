package Ex5;

public class PartTimeStudent extends Student {
	
	int workingHours;

	PartTimeStudent(String newName, String newAddress, String newStudentid, int newWHrs) {
		super(newName, newAddress, newStudentid);
		workingHours = newWHrs;
		
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("Working Hours " + workingHours);
	}

}
