package com.satyesht.datastructure.Trees;

public class BasicTreeRunner {
	
	
	public static void main(String[] args) {
		Tree t=new Tree();
		t.insert(15);
		t.insert(13);
		t.insert(20);
		t.insert(22);
		t.insert(5);
		
		t.InOrderTraverse();
		
		System.out.println("\nSearching 22 "+t.search(22));
		System.out.println("Searching 5 "+t.search(5));
		System.out.println("Searching 6 "+t.search(6));
	}

}
