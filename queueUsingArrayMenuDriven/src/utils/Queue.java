package utils;
import customException.*;
public class Queue {
    private int capacity;
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int data) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException("Queue is full. Cannot enqueue more elements.");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
        System.out.println("Enqueued " + data + " into the queue.");
    }

    public int dequeue() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("Queue is empty. Cannot dequeue from an empty queue.");
        }
        int dequeuedElement = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued " + dequeuedElement + " from the queue.");
        return dequeuedElement;
    }

    public int peek() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("Queue is empty. Cannot peek into an empty queue.");
        }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Current queue: ");
        int current = front;
        for (int i = 0; i < size; i++) {
            System.out.print(queue[current] + " ");
            current = (current + 1) % capacity;
        }
        System.out.println();
    }
    public void sort() {
        if (isEmpty() || size == 1) {
            System.out.println("Queue is either empty or has only one element. No sorting needed.");
            return;
        }

        //Copy elements to an array for sorting
        int[] elements = new int[size];
        int current = front;
        for (int i = 0; i < size; i++) {
            elements[i] = queue[current];
            current = (current + 1) % capacity;
        }

        // Bubble Sort
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    // Swap elements[j] and elements[j + 1]
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }

        //Update the queue with sorted elements
        current = front;
        for (int i = 0; i < size; i++) {
            queue[current] = elements[i];
            current = (current + 1) % capacity;
        }

        System.out.println("Queue sorted in ascending order.");
    }

}
