package com.satyesht.datastructure.hashtables;
public class Hashtest {

	
	public static void main(String[] args) {
		EmployeeHashTable hashtable=new EmployeeHashTable();
		Employee e1=new Employee(1, "Satyesh Tripathi");
		Employee e2=new Employee(2, "Neetika Tripathi");
		Employee e3=new Employee(3, "Abhinav Nath");
		Employee e4=new Employee(4, "Yuvraj Singh");
		Employee e5=new Employee(5, "Shalini Singh");
		Employee e6=new Employee(5, "Samay Singh");
		hashtable.put(e1, "Tripathi");
		hashtable.put(e2, "xxxxxxxx");
		hashtable.put(e6, "yyyyyyyy");
		hashtable.put(e3, "Nath");
		hashtable.put(e4, "Singh");
		hashtable.put(e5, "xxxxx");
		
		hashtable.iterate();
	
		System.out.println(hashtable.get("xxxxx").toString());
		
	}
}
