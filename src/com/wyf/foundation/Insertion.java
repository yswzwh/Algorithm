package com.wyf.foundation;

/**
 * 选择排序  与前面比较
 * @author Administrator
 *
 */
public class Insertion extends SortExample{

	public static void sort(Comparable[] a) {
		int N = a.length;
		for(int i=1; i<N; i++) {
			for(int j=i; j>0 && less(a[j],a[j-1]); j--) 
				exch(a, j, j-1);
		}
	}
	
	
	public static void main(String[] args) {
		String[] c= {"in","create","own","data","type","we","fact","animal"};
		sort(c);
		assert isSorted(c);
		show(c);
	}
}
