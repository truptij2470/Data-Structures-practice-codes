package StackArray;

public class StackUSingArray {
	private int[] stack;
	private int top;
	private int size;
	
	public StackUSingArray(int size) {
		this.top = -1;
		this.size = size;
		stack = new int[size];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void push(int ele) {
		
		if(isFull()) {
			throw new RuntimeException("Stac is full");
		}
			 stack[++top] = ele;
		
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return top==size-1;
	}
	 public int pop() {
		 if(isEmpty()) {
			 throw new RuntimeException("Stack is Empty");
		 
		 }
		 
		 int ele = stack[top--];
		 return ele;
	 }
	
}
