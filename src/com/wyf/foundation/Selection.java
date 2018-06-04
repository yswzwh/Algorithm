package com.wyf.foundation;

import edu.princeton.cs.algs4.In;

/**
 * 选择排序，又叫做冒泡排序。和后面元素比
 * @author Administrator
 *
 */
public class Selection extends SortExample {

	public static void sort(Comparable[] c) {
		int n = c.length;
		int min = 0;
		for(int i=0; i<n; i++) {
			min = i;
			for(int j= i+1; j<n; j++) {
				if(!less(c[min],c[j])) {
					min = j;
				}
			}
			if(min!=i) {
				exch(c,i,min);
			}			
			
		}
	}
	
	public static void main(String[] args) {
		String[] c= {"in","create","own","data","type","we","fact","animal"};
		sort(c);
		assert isSorted(c);
		show(c);
	}
	
}
