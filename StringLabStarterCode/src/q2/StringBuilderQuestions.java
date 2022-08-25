package q2;

public class StringBuilderQuestions {

	public static void main(String[] args) {
		// Create StringBuilder Object
		
		StringBuilder sb =  new StringBuilder("Hello");
		System.out.println("Object: " + sb);
		
		sb.append(" World");
		System.out.println(sb);
		
		sb.delete(0,6);
		System.out.println("Deleted " + sb);
		
		sb.insert(0, "Hi ");
		System.out.println(sb);
		
		sb.replace(0,2, "Hello" );
		System.out.println(sb);
		 
	}

}
