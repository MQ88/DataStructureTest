package com.satyesht.datastructure.hashtables;
public class EmployeeHash {
	
	private Employee e;
	private String key;
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public EmployeeHash(Employee e, String key) {
		super();
		this.e = e;
		this.key = key;
	}
	public EmployeeHash() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
