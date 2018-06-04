package com.wyf.foundation;

import edu.princeton.cs.algs4.In;

/**
 * ѡ�������ֽ���ð�����򡣺ͺ���Ԫ�ر�
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
