package StackLL;

public class StackUsingLL {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	Node top ;
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public void push(int ele) {
		Node newNode = new Node(ele);
		if(isEmpty()) {
			top=newNode;
			return;
		}
		top.next = newNode;
		top = newNode;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Empty Stack");
		}
		int ele = top.data;
		
		top = top.next;
		return ele;
	}
	
	public void display() {
		if(isEmpty()) {
			syso ("Empty Stack");
		}
	}
}
