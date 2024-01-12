package linkedlist;

import java.util.List;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CustomSortedSinglyLinkedList {
    private Node head;

    public CustomSortedSinglyLinkedList() {
        this.head = null;
    }

    // Operation 1: Add element X such that the list remains sorted.
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && data > current.next.data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Operation 2: Adds the given list of X to the current list such that the list remains sorted.
    public void addAll(List<Integer> dataList) {
        for (int data : dataList) {
            add(data);
        }
    }

    // Operation 3: Remove element present at index i.
    public void remove(int index) {
        if (index == 0 && head != null) {
            head = head.next;
            return;
        }

        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current != null && current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Index out of bounds. Element not removed.");
        }
    }

    // Operation 4: Returns comma-separated elements from start to end.
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

    public static void main(String[] args) {
        CustomSortedSinglyLinkedList sortedList = new CustomSortedSinglyLinkedList();

        sortedList.add(3);
        sortedList.add(1);
        sortedList.add(2);
        System.out.println(sortedList.toString());

        sortedList.addAll(List.of(5, 4));
        System.out.println(sortedList.toString());

        sortedList.remove(2);
        System.out.println(sortedList.toString());
    }
}

