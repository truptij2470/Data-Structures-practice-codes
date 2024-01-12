package utils;
import customExceptions.*;
public class CustomSinglyLinkedList {
    private Node head;

    public CustomSinglyLinkedList() {
        this.head = null;
    }
    //Add element X at the end of the list.
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

    //Add element X at index i.
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

    //Display all elements.
    public void list() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Reverse the linked list.
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
    //Returns comma-separated elements from start to end.
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

    // Operation 7: Returns true if the list is sorted, else false.
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

    public boolean isSorted2() {
    	Node current = head;
    	if(current != null && current.next !=null ) 
    	{
    		if(current.data>current.next.data)
    			return false;
    		current=current.next;
    	}
    	return true;
    }
    // Returns the position of X in the list. Returns -1 if X does not exist in the list.
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

}
