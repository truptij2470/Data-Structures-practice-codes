package queue;

import java.util.Queue;
import queue.queueCustomException;

public class QueueImplementation 
{
	private int arrQueue[];
	private int front,rear;
	
	public QueueImplementation(int size)
	{
		arrQueue = new int[size];
		front = rear = -1;
	}
	
	public boolean isFull()
	{
		if(rear == arrQueue.length - 1)
			return true;
		
		return false;
	}

	public boolean isEmpty()
	{
		if(front == -1 && rear == -1 )
			return true;
		
		return false;
			
	}
	//enqueue adding the element
	public void enqueue(int element) throws queueCustomException
	{
		if(isFull())
			throw new queueCustomException("Queue is full!");
		
		if(front == -1)
			front++;
		
		arrQueue[++rear] = element;
		System.out.println("element inserted");
		
		
	}
	//deleting the element
	public void dequeue() throws queueCustomException
	{
		if(isEmpty())
			throw new queueCustomException("Queue is empty!");
		
		
		System.out.println("Dequeued element : "+ arrQueue[front]);
		arrQueue[front++] = 0;
		
	}
	
	public void peek() throws queueCustomException
	{
		if(isEmpty())
			throw new queueCustomException("Queue is empty!");
		
		System.out.println("Front element : "+ arrQueue[front]);
		
	}
	
	public void display()
	{
		for(int a : arrQueue)
		{
			if(a>0)
				System.out.println(a+" ");
		}
	}
	 
}
