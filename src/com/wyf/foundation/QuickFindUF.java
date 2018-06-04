package com.wyf.foundation;

public class QuickFindUF extends UF{

	
	public QuickFindUF(int N) {
		super(N);
	}

	@Override
	public void union(int p, int q) {
		int pVal = find(p);
		int qVal = find(q);
		
		for(int i=0; i<id.length; i++) {
			if(id[i] == pVal) {
				id[i] = qVal;
			}
		}
		count--;
	}

	@Override
	public int find(int p) {
		return id[p];
	}
	
	public static void main(String[] args) {
		QuickFindUF quickFindUF = new QuickFindUF(10);
		quickFindUF.union(3, 5);
		quickFindUF.union(2, 7);
		quickFindUF.union(2, 3);
		System.out.println(quickFindUF.connected(2, 7));
		for(int i=0; i<quickFindUF.id.length; i++) {
			System.out.println(quickFindUF.id[i]);
		}
		
	}
	 

}
