package tester;

import java.security.PublicKey;

public class Queue2 {
private int queue[];
private int rear;
private int front;
private int size;
private int capacity;

public Queue2(int capacity) {
	this.capacity=capacity;
	this.rear=-1;
	this.front=0;
	this.size=0;
}
public boolean isFull() {
	return size==capacity;
}
public boolean isEmpty() {
	return size==0;
}
public void enqueue(int ele) {
	if(isFull())
		System.out.println("queue is full");
	rear=(rear+1)%capacity;
	queue[rear]=ele;
	size++;
}
public void dequeue() {
	if(isEmpty())
		System.out.println("queue is empty cant dequeue");
	int dequeelement=queue[front];
	front=(front+1)%capacity;
	
	size--;
}
public void diplayall() {
	if(isEmpty())
		System.out.println("queue is empty.!");
	int current = front;
	for ( int i=front;i<=size;i++) {

		System.out.println(queue[i]);
	}
		
	}
public int peek() {
	if(isEmpty())
		System.out.println("queue is empty......!");
	return queue[front];
}

}


