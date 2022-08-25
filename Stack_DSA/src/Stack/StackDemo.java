package Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		s1.push(4);
		s1.push(7);
		s1.push(8);
		
		
		while(s1.isEmpty()) {
			
		System.out.println(s1.pop());
		
		
		}
		

	}

}
