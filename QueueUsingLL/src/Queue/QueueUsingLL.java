package Queue;

public class QueueUsingLL {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	
		
	}
	Node front, rear;
	int sizes;
	
	public int Size() {
		Node temp = front;
		while(temp!=null) {
			sizes++;
		}
		return sizes;
	}
	
	public int peak() {
		if(front == null) {
			System.out.println("Empty Queue");
			return -1;
		}
		
		return front.data;
	}
	
	public boolean isEmpty() {
		return front==null;
	}
	
	public void enqueue(int ele) {
		Node newNode = new Node(ele);
		if(front == null) {
			front = newNode;
			rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}
	
	public int dequeue() {
		
		if(front == null) {
			throw new RuntimeException("Queue is Empty!!");
		}
		int res = front.data;
		front = front.next;
		return res;
	}
	
	public void display() {
		if(front == null) {
			System.out.println("Empty Queue");
			return;
		}
		Node temp = front;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}
}
