package com.wyf.foundation;

import java.util.Comparator;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * ≈≈–Ú∏®÷˙¿‡
 * @author Administrator
 *
 */
public  class SortExample {
	public static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
	
	public static boolean isSorted(Comparable[] c) {
		for(int i=0; i<c.length; i++) {
			if(!less(c[i], c[i+1]))
				return false;
		}
		return true;
	}
	
	public static void show(Comparable[] c) {
		for(int i=0; i<c.length; i++) {
			StdOut.print(c[i] + " ");
			StdOut.println();
		}
	}
	
	public static void exch(Comparable[] c,int p, int q) {
		Comparable temp = c[p];
		c[p] = c[q];
		c[q] = temp;
	}
	
	
	
}
