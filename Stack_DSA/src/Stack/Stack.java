package Stack;

public class Stack {
	int s[] = new int[10];
	int tos;
	
	Stack() {
		tos = -1;
	}
	
	void push(int item) {
		if(tos == 9) {
			System.out.println("The Satck is Full");
		} else {
			s[++tos] = item;
		}
	}
	
	int pop() {
		if(tos >= 0) {
			return s[tos--];
			
		} else {
			System.out.println("The Stack is Empty");
			return -1;
		}
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}