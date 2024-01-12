class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CustomSinglyLinkedList {
    private Node head;

    public CustomSinglyLinkedList() {
        this.head = null;
    }

    // Operation 1: Add element X at the end of the list.
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Operation 2: Add element X at index i.
    public void add(int data, int index) {
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

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
            System.out.println("Index out of bounds. Element not added.");
        }
    }

    // Operation 3: Remove all occurrences of X from the list.
    public void remove(int data) {
        Node dummy = new Node(0); // Dummy node to handle the case when the head needs to be removed.
        dummy.next = head;
        Node current = dummy;

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        head = dummy.next; // Update the head after handling removals.
    }

    // Operation 4: Display all elements.
    public void list() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Operation 5: Reverse the linked list.
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev; // Update the head to the last node.
    }

    public static void main(String[] args) {
        CustomSinglyLinkedList linkedList = new CustomSinglyLinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.list();

        linkedList.add(4, 1);
        linkedList.list();

        linkedList.remove(2);
        linkedList.list();

        linkedList.reverse();
        linkedList.list();
    }
}
