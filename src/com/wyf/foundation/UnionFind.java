package com.wyf.foundation;

public class UnionFind extends UF {
	
	protected int[] sz;

	public UnionFind(int N) {
		super(N);
		this.sz = new int[N];
		for(int i=0; i<N; i++) {
			sz[i] = 1;
		}
	}

	@Override
	public void union(int p, int q) {
		int pVal = find(p);
		int qVal = find(q);
		if(pVal == qVal)
			return;
		if(sz[qVal] > sz[pVal]) {
			id[pVal] = qVal;
			sz[qVal] = sz[qVal]+sz[pVal]; 
		} else {
			id[qVal] = pVal;
			sz[pVal] = sz[pVal]+sz[qVal];
		}
		
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
		UnionFind unionFind = new UnionFind(10);
		unionFind.union(3, 5);
		unionFind.union(2, 7);
		unionFind.union(2, 3);
		System.out.println(unionFind.connected(3, 5));
		for(int i=0; i<unionFind.id.length; i++) {
			System.out.println(unionFind.id[i]);
		}
		System.out.println("===================================================");
		for(int i=0; i<unionFind.sz.length; i++) {
			System.out.println(unionFind.sz[i]);
		}
		
	}

}
