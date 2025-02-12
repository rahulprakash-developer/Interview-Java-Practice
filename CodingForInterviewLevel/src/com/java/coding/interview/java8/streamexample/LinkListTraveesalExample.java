package com.java.coding.interview.java8.streamexample;

class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Function to add a new node at the end
    public void append(int data) {
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

    // Function to traverse the list and stop when a value is found
    public void findValue(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                System.out.println("Value " + value + " found in the list.");
                break;  // Terminate the loop when the value is found
            }
            current = current.next;
        }
        if (current == null) {
            System.out.println("Value " + value + " not found in the list.");
        }
    }
}

public class LinkListTraveesalExample {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.append(50);

        linkedList.findValue(30);


    }

}
