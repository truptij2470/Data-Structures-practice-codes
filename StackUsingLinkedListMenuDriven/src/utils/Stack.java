package utils;
import customexceptions.*;
public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + data + " into the stack.");
    }

    public int pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty. Cannot pop from an empty stack.");
        }

        int poppedElement = top.data;
        top = top.next;
        System.out.println("Popped " + poppedElement + " from the stack.");
        return poppedElement;
    }

    public int peek() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty. Cannot peek into an empty stack.");
        }

        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Current stack: ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public int getMinElement() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty. Cannot get minimum from an empty stack.");
        }

        int minElement = top.data;
        Node current = top.next;

        while (current != null) {
            minElement = Math.min(minElement, current.data);
            current = current.next;
        }

        return minElement;
    }
    
    public int getMaxElement() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty. Cannot get maximum from an empty stack.");
        }

        int maxElement = top.data;
        Node current = top.next;

        while (current != null) {
            maxElement = Math.max(maxElement, current.data);
            current = current.next;
        }

        return maxElement;
    }
 


}