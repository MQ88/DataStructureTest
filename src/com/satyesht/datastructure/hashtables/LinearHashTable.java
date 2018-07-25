package com.satyesht.datastructure.hashtables;

import java.util.Arrays;

/* -- This Class uses a Linear hash approach on an underlying array
 * -- Key is a String and Value is an Employee class object 
 * -- index where the element will be stored is String key length mod total size of array
 * -- in case of conflict the array will be iterated and element will be placed at next available position 
 * -- array is rehashed after every delete to maintain retrival complexity of O(1) 
 */

public class LinearHashTable {
	private EmployeeHash hashtable[];
	private int totalElements=0;

	public LinearHashTable() {
		super();
		hashtable = new EmployeeHash[10];
	}

	private int hashCode(String key) {
		return key.length() % hashtable.length;
	}

	public boolean put(Employee e, String key) {
		int hashkey = hashCode(key);

		if (hashtable[hashkey] != null) {
			int index = hashkey + 1;
			while (hashtable[index] != null && index != hashkey) {
				index = (index + 1) % hashtable.length;
			}
			if (index == hashkey) {
				return false;
			} else {
				hashkey = index;
			}

		}
		hashtable[hashkey] = new EmployeeHash(key,e);
		totalElements++;
		
		if(totalElements>=hashtable.length/2)
		{
			System.out.println("Load Factor is greater than 50 %");
			hashtable=Arrays.copyOf(hashtable, hashtable.length*2);
		}

		return true;
	}
	

	public Employee delete(String key)
	{Employee Employee=null;
		int hashkey=hashCode(key);
		if(hashtable[hashkey].getKey().equals(key))
		{
			Employee = hashtable[hashkey].getE();
			hashtable[hashkey]=null;
			totalElements--;
			//return Employee;
		}
		else
		{
			int index = hashkey + 1;
			while(hashtable[index] != null && index != hashkey)
			{
				if (hashtable[index].getKey() == key) {
					 Employee = hashtable[index].getE();
					hashtable[index]=null;
					totalElements--;
			//		return Employee;
				}
				index = index + 1 % hashtable.length;
			}
		}
		
		//logic for rehashing 
		if(Employee!=null)
		{
				EmployeeHash oldHashtable[]=hashtable;
				hashtable=new EmployeeHash[hashtable.length];
				for(EmployeeHash eh : oldHashtable)
				{ System.out.println("<----LIST------>");
					if(eh !=null)
					{
						put(eh.getE(), eh.getKey());
					}
				}
		}
		return Employee;
	}

	public Employee get(String key) {
		int hashkey = hashCode(key);
		if (hashtable[hashkey].getKey() == key) {
			return hashtable[hashkey].getE();
		} else {
			int index = hashkey + 1;

			while (hashtable[index] != null && index != hashkey) {

				if (hashtable[index].getKey() == key) {
					return hashtable[index].getE();
				}
				index = index + 1 % hashtable.length;
			}
		}
		return null;
	}

	public void iterate() {
		int index = 0;
		for (EmployeeHash s : hashtable) {

			if (s != null) {
				System.out.println("index=" + index + s.getKey() + "->" + s.getE().toString());
			}
			index++;
		}
	}

}
