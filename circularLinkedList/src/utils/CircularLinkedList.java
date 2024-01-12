package utils;

public class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            newNode.next = head; // Circular link
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head; // Circular link
        }
        System.out.println("Added " + data + " to the list.");
    }

    public void add(int data, int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative.");
        }

        Node newNode = new Node(data);
        if (isEmpty() && index == 0) {
            head = newNode;
            newNode.next = head; // Circular link
        } else if (index == 0) {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            newNode.next = head;
            head = newNode;
            current.next = head; // Update circular link
        } else {
            Node current = head;
            int currentIndex = 0;

            while (current != null && currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
            }

            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            } else {
                throw new IndexOutOfBoundsException("Index out of bounds. Element not added.");
            }
        }
        System.out.println("Added " + data + " at index " + index + ".");
    }

    public void remove(int data) {
        if (isEmpty()) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        Node current = head;
        Node previous = null;

        do {
            if (current.data == data) {
                if (previous != null) {
                    previous.next = current.next;
                    if (current == head) {
                        head = current.next; // Update head if removing the first node
                    }
                } else {
                    if (current.next == head) {
                        head = null; // Remove the only node
                    } else {
                        Node last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        last.next = current.next; // Update last node's next pointer
                        head = current.next; // Update head if removing the first node
                    }
                }
                System.out.println("Removed " + data + " from the list.");
                return;
            }

            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Element " + data + " not found in the list.");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        System.out.print("Current list: ");
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public boolean isSorted() {
        if (isEmpty()) {
            System.out.println("Circular linked list is empty.");
            return true; // An empty list is considered sorted
        }

        Node current = head;

        do {
            if (current.data > current.next.data) {
                return false;
            }
            current = current.next;
        } while (current.next != head);

        return true;
    }

    public int find(int data) {
        if (isEmpty()) {
            System.out.println("Circular linked list is empty.");
            return -1;
        }

        Node current = head;
        int position = 0;

        do {
            if (current.data == data) {
                return position;
            }
            current = current.next;
            position++;
        } while (current != head);

        return -1; // Data not found in the list
    }}