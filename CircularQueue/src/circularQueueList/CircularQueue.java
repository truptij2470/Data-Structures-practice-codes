package circularQueueList;


public class CircularQueue {
private int maxSize;
private int front,rear ;
private int arr[];
public CircularQueue(int size) {
	maxSize=size;
	arr=new int[maxSize];
	front=rear=-1;
	
}
public boolean isFull() throws queueCustomException {
	if((front==0 && rear==maxSize-1) || rear+1==front) {
		throw new queueCustomException("the circular queue is full..!");

	}
	return false;
}
public boolean isEmpty() throws queueCustomException {
	if(front==-1)
		throw new queueCustomException("the circular queue is empty..!");
return false;
		
}
public void enqueue(int element) throws queueCustomException {
	if(isFull())
		throw new queueCustomException("the circular queue is full..!");

	else 
		{if(front==-1) {
			front=0;
		}
		
		rear=rear+1%maxSize;
		arr[rear]=element;}

}

	public int dequeue() throws queueCustomException {
		if(isEmpty())
			throw new queueCustomException("the circular queue is empty..!");
		else 
		{   int element=arr[front];
			if (front==rear)
		     { front=rear=-1 ;
		     }
		
	         front=(front+1)%maxSize;
	         return element;
	}
	}
	public void display() {
 for(int i:arr){
	 //if(arr[i]>0) {}
	 System.out.println(i+" ");
 }		
	}






}
