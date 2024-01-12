package linkedlist3tostring;


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

    // Operation 2: Returns the position of X in the list. Returns -1 if X does not exist in the list.
    public int find(int data) {
        Node current = head;
        int position = 0;

        while (current != null) {
            if (current.data == data) {
                return position;
            }
            current = current.next;
            position++;
        }

        return -1; // Data not found in the list
    }

    // Operation 3: Returns comma-separated elements from start to end.
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;

        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }

        return result.toString();
    }

    // Operation 4: Returns true if the list is sorted, else false.
    public boolean isSorted() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data > current.next.data) {
                return false;
            }
            current = current.next;
        }

        return true;
    }

    public static void main(String[] args) {
        CustomSinglyLinkedList linkedList = new CustomSinglyLinkedList();

        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(2);
        System.out.println("List: " + linkedList.toString());
        System.out.println("Position of 2: " + linkedList.find(2));
        System.out.println("Is the list sorted? " + linkedList.isSorted());

        linkedList.add(5);
        linkedList.add(4);
        System.out.println("List: " + linkedList.toString());
        System.out.println("Is the list sorted? " + linkedList.isSorted());
    }
}
