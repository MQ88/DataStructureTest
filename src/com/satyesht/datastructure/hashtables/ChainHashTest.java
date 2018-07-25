package com.satyesht.datastructure.hashtables;

public class ChainHashTest {
	
	public static void main(String[] args) {
		
		ChainHashTable hashTable=new ChainHashTable();
		Employee e1=new Employee(7, "Satyesh");
		Employee e2=new Employee(7, "Abhinav");
		Employee e3=new Employee(6, "Yuvraj");
		Employee e4=new Employee(7, "Moziila");
		Employee e5=new Employee(6, "Chrome");
		Employee e6=new Employee(9, "CoffeLake");
		System.out.println("__________PUT OPERATIONS___________");
		hashTable.put("Satyesh",e1);
		hashTable.put("Abhinav",e2);
		hashTable.put("Yuvraj",e3);
		hashTable.put("Moziila",e4);
		hashTable.put("Chrome",e5);
		hashTable.put("CoffeLake",e6);
		
		hashTable.iterate();
		System.out.println("__________REMOVE OPERATIONS___________");
		System.out.println("Chrome Remove "+hashTable.remove("Chrome"));
		System.out.println("CoffeLake Remove "+hashTable.remove("CoffeLake"));
		System.out.println("Chrome Remove "+hashTable.remove("Chrome"));
		System.out.println("__________GET OPERATIONS___________");
		System.out.println("Get Chrome "+hashTable.get("Chrome"));
		System.out.println("Get CoffeLake "+hashTable.get("CoffeLake"));
		System.out.println("Get Satyesh "+hashTable.get("Satyesh"));
		
	}

}
