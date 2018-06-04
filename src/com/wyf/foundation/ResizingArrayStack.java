package com.wyf.foundation;

import java.util.Iterator;
import java.util.Stack;

public class ResizingArrayStack<Item> implements Iterable<Item>{

	private Item[] a = (Item[]) new Object[1];
	
	private int N;
	
	public int getSize() {
		return N;
	}
	
	public void resize(int max) {
		Item[] temp = (Item[]) new Object[max];
		for(int i=0; i<a.length; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}
	
	public void push(Item item) {
		if(a.length == N) {
			resize(2*N);
		}
		a[++N] = item;
	}
	
	public Item pop() {
		Item item = a[N--];
		a[N] = null;
		if(N > 0 && N*4 == a.length) {
			resize(2*N);
		}
		return item;
	}
	
	public boolean isFull() {
		return N == a.length;
	}
	
	@Override
	public Iterator<Item> iterator() {
		
		return new ReverseArrayIterator();
	}
	
	public class ReverseArrayIterator implements Iterator<Item> {
		
		private int index = N;

		@Override
		public boolean hasNext() {
			return index > 0;
		}

		@Override
		public Item next() {
			return a[index--];
		}
		
		public void remove() {
			
		}
		
	}
	
	
	
	

}
