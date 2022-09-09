package Queue;

public class QueueUsingArrays2 {
	static final int MAX_SIZE = 30;
	int rear;
	int arr[];
	
	
	public QueueUsingArrays2() {
		rear = -1;
		arr = new int[MAX_SIZE];
		
	}
	
	public void enqueue(int val) {
		if(rear == MAX_SIZE -1)
			throw new IndexOutOfBoundsException("Queue is Full");
		arr[++rear] = val;
		
	}
	
	public int dequeue() {
		if(rear == -1)
			throw new IndexOutOfBoundsException("Queue is Empty");
		
		int temp = arr[0];
		
		for(int i = 1;i <= rear;i++)
			arr[i-1] = arr[i];
		
		rear--;
			
			
		return temp;
	}
	
}

