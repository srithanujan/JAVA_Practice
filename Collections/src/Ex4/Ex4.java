package Ex4;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Ex2.Student;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Creating a map of student
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		
		// Creating Students 
		Student s1 = new Student(100, 2.5, "Kamal");
		Student s2 = new Student(101, 3.6, "Nimal");
		Student s3 = new Student(102, 3.2, "Amal");
		System.out.println();
		
		// Adding students to map
		map.put(s1.getStudentID(), s1);
		map.put(s2.getStudentID(), s2);
		map.put(s3.getStudentID(), s3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student ID: ");
		int id = sc.nextInt();
		
		Student st = map.get(id);
		st.print();
		
		// use for each loop in Map class (Optional)
		for(Map.Entry<Integer, Student> entry: map.entrySet()) {
			int key = entry.getKey();
			Student value = entry.getValue();
		}
		
		

	}

}
