package CircularQueue;

public class CircularQueueUsingArr {
	
	private int front,rear,size;
	private int[] queue;
	
	public CircularQueueUsingArr() {
		front =-1 ;
		rear = front;
		size = 5;
		queue = new int[size];
	}
	
	public boolean isEmpty() {
		return front==(rear+1)%size || front==-1;
	}
	
	
	public void enqueue(int ele) {
		
		rear = (rear+1)%size;
		queue[rear] = ele;
		if(front==-1) {
			front = rear;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Empty queue!!!");
		}
		int ele = queue[front];
		if(front == rear) {
			front = rear =-1;
		}
		else {
			front = (front+1)%size;
			}
		
		
		return ele;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Empty!!!");
		}
		for(int i=front;i<=rear;i++) {
			System.out.println(queue[i]+" ");
		}
		System.out.println();
	}
}
