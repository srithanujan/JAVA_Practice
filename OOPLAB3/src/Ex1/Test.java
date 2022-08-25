package Ex1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//objects
//		Student s1 = new Student("Nimal", "It123", "Colombo ");
//		s1.name = "Nimal";
//		s1.ditno = "IT123";
//		s1.address = "Colombo";
//		Student s2 = new Student("Kamal", "IT565", "Malabe");
//		s2.name = "Kamal";
//		s2.ditno = "IT565";
//		s2.address = "Malabe";
		
		
		//Print the value
//		System.out.println("Name: "+s1.name + "\nDitno: "+s1.ditno + "\nAddress: " +s1.address);
//		System.out.println("Name: "+s2.name + "\nDitno: "+s2.ditno + "\nAddress: " +s2.address);
		
		
		Student s1 = new Student();
		s1.setName("Nimal");
		s1.setDitno("IT123");
		s1.setAddress("Malabe");
		
		System.out.println(s1.getDetails());
		
		
		
		
		
		


	}

}
