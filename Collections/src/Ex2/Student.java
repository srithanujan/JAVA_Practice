package Ex2;

public class Student {
	private int  studentID;
	private String name;
	private double gpa;
	
	//Constructor
	
	public Student(int studentID, double gpa, String name) {
		this.studentID = studentID;
		this.name = name;
		this.gpa = gpa;
		
	}
	
	// Getters and Setters

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	//Print
	
	public void print() {
		System.out.println("Student ID : " + this.getStudentID());
		System.out.println("Student Name : " + this.getName());
		System.out.println("Student GPA : " + this.getGpa());
		System.out.println();
	}
	

}
