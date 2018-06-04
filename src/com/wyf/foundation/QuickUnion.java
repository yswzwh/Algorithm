package com.wyf.foundation;

public class QuickUnion extends UF {

	public QuickUnion(int N) {
		super(N);
	}

	@Override
	public void union(int p, int q) {
		int pVal = find(p);
		int qVal = find(q);
		if(pVal == qVal)
			return;
		id[pVal] = qVal;
		count--;
	}

	@Override
	public int find(int p) {
		while(id[p] != p) {
			p = id[p];
		}
		return p;
	}
	
	public static void main(String[] args) {
		QuickUnion quickUnion = new QuickUnion(10);
		quickUnion.union(3, 5);
		quickUnion.union(2, 7);
		quickUnion.union(2, 3);
		System.out.println(quickUnion.connected(3, 5));
		for(int i=0; i<quickUnion.id.length; i++) {
			System.out.println(quickUnion.id[i]);
		}
		
	}

}
