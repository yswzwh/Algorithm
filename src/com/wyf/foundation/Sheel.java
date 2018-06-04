package com.wyf.foundation;

public class Sheel extends SortExample {
	
	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while(h < N/3) {
			h = 3*h + 1;
		}
		
		while(h > 1) {
			for(int i=h; i<N; i++) {
				for(int j=i; j >= h && less(a[j],a[j-h]); j= j-h) {
					exch(a, j, j-h);
				}
				
			}
			h = h/3;
		}
	}
	
	public static void main(String[] args) {
		String[] c= {"in","create","own","data","type","we","fact","animal"};
		sort(c);
		assert isSorted(c);
		show(c);
	}

}
