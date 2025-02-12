package com.java.ArrayListWithInternalExample;

public class LinkedListExample<E> {

	transient Node<E> last;
	transient Node<E> first;
	transient int size = 0;
	protected transient int modCount = 0;

	public static void main(String[] args) {

		LinkedListExample<Integer> list = new LinkedListExample<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list);

		//list.addFirst(100);

	}

	public boolean add(E e) {
		linkLast(e);
		return true;
	}
	
	/* public void addFirst(E e) {
	        linkFirst(e);
	    }*/

	void linkLast(E e) {
		final Node<E> l = last;
		final Node<E> newNode = new Node<>(l, e, null);
		last = newNode;
		if (l == null)
			first = newNode;
		else
			l.next = newNode;
		size++;
		modCount++;
	}

	private static class Node<E> {
		E item;
		Node<E> next;
		Node<E> prev;

		Node(Node<E> prev, E element, Node<E> next) {
			this.item = element;
			this.next = next;
			this.prev = prev;
		}
	}

}
