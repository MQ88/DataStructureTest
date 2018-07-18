package com.satyesht.datastructure.hashtables;
public class EmployeeHashTable {
	private EmployeeHash hashtable[];

	public EmployeeHashTable() {
		super();
		hashtable=new EmployeeHash[10];
	}
	
	private int hashCode(String key)
	{
		return key.length() % hashtable.length;
	}
	
	public boolean put(Employee e,String key)
	{
	  int hashkey=hashCode(key);
	  
	  if(hashtable[hashkey]!=null)
	  { int index=hashkey+1;
		  while(hashtable[index]!=null && index !=hashkey)
		  {
			  index=(index+1)%hashtable.length;
		  }
		  if(index==hashkey)
		  {
			  return false;
		  }
		  else
		  {
			  hashkey=index;
		  }
			  
	  }
	  hashtable[hashkey]=new EmployeeHash(e, key);
		
	   return true;
	}
	
	public Employee get(String key)
	{
		int hashkey=hashCode(key);
		if(hashtable[hashkey].getKey()==key)
		{
			return hashtable[hashkey].getE();
		}
		else
		{
			int index=hashkey+1;
			
			 while(hashtable[index]!=null && index !=hashkey)
			  {
				 
				  if(hashtable[index].getKey()==key)
					{
						return hashtable[index].getE();
					}
				  index=index+1%hashtable.length;
			  }
		}
		return null;
	}
	
	public void iterate()
	{
		int index=0;
		for(EmployeeHash s :hashtable)
		{
			
			if(s!=null)
			{
			System.out.println("index="+index+s.getKey()+"->" + s.getE().toString());
			}
			index++;
		}
	}

}
