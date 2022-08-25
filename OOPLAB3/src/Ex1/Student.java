package Ex1;

public class Student {
	String name, ditno, address;
	
	
	
	//parameterized constructor
//	public Student(String name, String ditno, String address) {
//		this.name = name;
//		this.ditno = ditno;
//		this.address = address;
//	}
	
	

//public Student() {
//		// TODO Auto-generated constructor stub
//	}



	/// Mutator & accessor methods
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDitno() {
		return ditno;
	}


	public void setDitno(String ditno) {
		this.ditno = ditno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
    String getDetails() {
		String s = "I am a Student."+"\nMy name is "+getName()+"\nI am from " + getAddress() + "\nMy dit no is " +getDitno();
		
		return s;
	}

}
