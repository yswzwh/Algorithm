package com.wyf.foundation;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{

	private int N;
	
	private Node first;
	
	private class Node {
		Item item;
		Node next;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return N;
	}
	
	public void push(Item item) {
		Node oldNode =first;
		Node node = new Node();
		node.item = item;
		node.next = oldNode;
		first = node;
		N++;
	}
	
	public Item pop() {
		if(N == 0) {
			return null;
		}
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<Item> {
		
		private Node current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
			
		}
		
		public void remove() {
			
		}
		
	}
}
