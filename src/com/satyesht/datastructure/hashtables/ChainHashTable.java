package com.satyesht.datastructure.hashtables;

import java.util.Iterator;
import java.util.LinkedList;

public class ChainHashTable {
	
	private LinkedList<EmployeeHash> hashtable[];

	public ChainHashTable()
	{
		hashtable=new LinkedList[10];
	}
	
	private int hashKey(String key)
	{
		return key.length() % hashtable.length;
	}
	
	public boolean put(String key ,Employee e)
	{
		int index=hashKey(key);
		if(hashtable[index]==null)
		{
			hashtable[index]=new LinkedList<>();
		}
		hashtable[index].add(new EmployeeHash(key, e));
		return true;
	}
	
	public Employee get(String key)
	{
		Employee e=null;
		int index=hashKey(key);
		if(hashtable[index]==null)
		{
			return e;
		}
		Iterator<EmployeeHash> ehI=hashtable[index].iterator();
		for (;ehI.hasNext();)
		{
			EmployeeHash eh=ehI.next();
			if(eh.getKey().equals(key))
			{
				e=eh.getE();
				break;
			}
		}
		return e;
	}
	public  Employee remove(String key)
	{
		Employee e=null;
		int index=hashKey(key);
		if(hashtable[index]==null)
		{
			return e;
		}
		Iterator<EmployeeHash> ehI=hashtable[index].iterator();
		for (;ehI.hasNext();)
		{
			EmployeeHash eh=ehI.next();
			if(eh.getKey().equals(key))
			{
				e=eh.getE();
				ehI.remove();
				return e;
			}
		}
		return e;
	}
	
	public void iterate()
	{
		int index=0;
		for(LinkedList<EmployeeHash> ehli : hashtable )
		{System.out.println((++index)+"LIST-->");
			if(ehli!=null)
			{ 
				Iterator<EmployeeHash> ehI=ehli.iterator();
				for(;ehI.hasNext();)
				{
					EmployeeHash eh=ehI.next();
					System.out.println("       |"+"Key="+eh.getKey()+" "+eh.getE().toString());
				}
			}
		}
	}
	

}
