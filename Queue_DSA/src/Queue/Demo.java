package Queue;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueUsingArrays2 q = new QueueUsingArrays2();
		q.enqueue(5);
		q.enqueue(8);
		q.enqueue(9);
		
		System.out.println("dequeued " + q.dequeue());
		System.out.println("dequeued " + q.dequeue());
		System.out.println("dequeued " + q.dequeue());
//		System.out.println("dequeued " + q.dequeue());
		
		q.enqueue(5);
		q.enqueue(8);
		
		
		System.out.println("dequeued " + q.dequeue());
		System.out.println("dequeued " + q.dequeue());

	}

}
