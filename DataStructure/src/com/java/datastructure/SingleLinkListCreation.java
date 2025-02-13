package com.java.datastructure;

import java.util.Scanner;

public class SingleLinkListCreation {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void creation() {

		int data, n;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Enter Data : ");
			data = sc.nextInt();
			Node new_node = new Node(data);
			if (head == null) {
				head = new_node;
			} else {
				new_node.next = head;
				head = new_node;
			}
			System.out.print("Do you want to add more data if yes , press 1 : ");
			n = sc.nextInt();
		} while (n == 1);
	}

	public void traverser() {
		Node temp = head;
		if (head == null) {
			System.out.print("LL does not exist");
		} else {
			while (temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		SingleLinkListCreation singleLinkListCreation = new SingleLinkListCreation();
		singleLinkListCreation.creation();
		singleLinkListCreation.traverser();
	}

}
