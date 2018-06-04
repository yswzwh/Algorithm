package com.wyf.foundation;

public abstract class UF {
	
	public UF(int N) {
		this.id = new int[N];
		for(int i=0; i<N; i++) {
			id[i] = i;
		}
		this.count = N;
	}
	
	protected int[] id;
	
	protected int count;
	
	public abstract void union(int p, int q);
	
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}
	
	public abstract int find(int p);
	
	public int count() {
		return count;
	}
	
	
	
	

}
