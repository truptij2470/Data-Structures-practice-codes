package QueueUsingArray;


public class QueueUsingArray {
	
	private int queue[];
	private int front,rear;
	private int capacity;
	
	public QueueUsingArray(int capacity) {
		this.capacity = capacity;
		this.front = this.rear = -1;
		queue= new int[capacity];
	
	}
	
	public boolean isEmpty() {
		return front==-1 && rear == -1; 
				
	}
	public boolean isFull() {
		return rear == capacity-1;
	}
	
	public void enqueue(int ele) {
		if(isFull()) {
			throw new RuntimeException("Queue is full!!!");
		}
	if(isEmpty()) {
		front = rear = 0;
		queue[rear] = ele;
		return;
	}
		rear++;
		queue[rear] = ele;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		if(front==rear) {
			int ele = queue[front];
			for(int i=0; i<capacity;i++) {
				queue[i] = queue[i+1];
			}
			rear--;
			return ele;
		}
		return queue[front++];
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!!!");
			return;
		}
		for(int i=front;i<=rear;i++) {
			System.out.println(queue[i]+" ");
		}
		System.out.println();
	}
	
}
