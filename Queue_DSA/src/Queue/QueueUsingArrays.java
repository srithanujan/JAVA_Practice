package Queue;

public class QueueUsingArrays {
	static final int MAX_SIZE = 30;
	int rear,front;
	int arr[] ;
	
	
	
	public QueueUsingArrays() {
		rear = -1;
		front = -1;
		arr = new int[MAX_SIZE];
	}
	
	
	public void enqueue(int val) {
		if(rear == MAX_SIZE -1)
			throw new IndexOutOfBoundsException("Queue is Full");
		if(front == -1)
			front++;
			arr[++rear] = val;
	}
	
	
	public int dequeue() {
		if(front > rear || front == -1)
			throw new IndexOutOfBoundsException("Queue is Empty");
		return arr[front++];
		
	}
	
}