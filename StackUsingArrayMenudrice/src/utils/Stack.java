package utils;
import CustomExceptions.*;
public class Stack {
	private int capacity;
    private int[] stack;
    private int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int element) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack is full. Cannot push more elements.");
        }
        stack[++top] = element;
        System.out.println("Pushed " + element + " into the stack.");
    }
 
    public int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Cannot pop from an empty stack.");
        }
        int poppedElement = stack[top--];
        System.out.println("Popped " + poppedElement + " from the stack.");
        return poppedElement;
    }

    public int peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Cannot peek into an empty stack.");
        }
        return stack[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Current stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
        
    }
    //get max element
    public int getMax() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Cannot get maximum from an empty stack.");
        }

        int maxElement = stack[0];
        for (int i = 1; i <= top; i++) {
            if (stack[i] > maxElement) {
                maxElement = stack[i];
            }
        }
        return maxElement;}
    

    public int getMin() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Cannot get minimum from an empty stack.");
        }

        int minElement = stack[0];
        for (int i = 1; i <= top; i++) {
            if (stack[i] < minElement) {
                minElement = stack[i];
            }
        }
        return minElement;
    }
}
