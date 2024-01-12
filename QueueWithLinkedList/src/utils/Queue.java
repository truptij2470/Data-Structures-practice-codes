package utils;
import CustomExceptions.*;
public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued " + data + " into the queue.");
    }

    public int dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty. Cannot dequeue from an empty queue.");
        }
        int dequeuedElement = front.data;
        front = front.next;
        if (front == null) {
            rear = null; // If the last element is dequeued, update rear as well
        }
        System.out.println("Dequeued " + dequeuedElement + " from the queue.");
        return dequeuedElement;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Current queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}