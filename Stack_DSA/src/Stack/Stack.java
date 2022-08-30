package Stack;

public class Stack {
	 
	int a[] = new int[10];
	int tos;
	
	public Stack() {
		tos = -1;
		
	}
	
	public void push(int i) {
//		tos = tos + 1;
//		a[tos] = i;
		
		if(tos == 9)
			System.out.println("Stack is Full");
		else 
			a[++tos] = i;
		
	}
	
	public int pop() {
		if(tos >= 0)
			return a[tos--];
		else
			System.out.println("Stack is Empty");
			return -1;
	}
	
	
}
	
