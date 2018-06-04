package com.wyf.foundation;

public class BinarySearch {
	
	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length -1;
		int mid = 0;
		while(lo <= hi) {
			mid = lo + (hi - lo)/2;
			if(key < a[mid]) {
				hi = mid - 1;
			} else if(key > a[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a = {1,3,5,7,9,11,13,15,17,19};
		int index = rank(4,a);
		if(index > 0) {
			System.out.println(a[index]);
		} else {
			System.out.println("not exsits");
		}
		
	}

}
