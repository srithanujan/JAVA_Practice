package Queue;

public class QueueUsingArrays2 {
	static final int MAX_SIZE = 30;
	int arr[];
	int front,rear;
	
	QueueUsingArrays2(){
		arr = new int[MAX_SIZE];
		front = -1;
		rear = -1;
		
	}
	
	public void enqueue(int val) {
//		rear = rear + 1;
//		arr[rear] = val;
		if(rear == MAX_SIZE -1) {
			throw new IndexOutOfBoundsException("Queue is Full");
		}
//		if(front == -1)
//			front++;
		arr[++rear] = val;
		
	}
	
	public int dequeue() {
		if(rear == -1 || front>rear) 
			throw new IndexOutOfBoundsException("Queue is Empty");
		int temp =  arr[0];
		
		for(int i=1;i<=rear;i++)
			arr[i-1] = arr[i];
			
		
		rear--;
		
		return temp;
		
	}
	

}

