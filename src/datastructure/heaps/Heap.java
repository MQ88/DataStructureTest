package datastructure.heaps;

public class Heap {
	
	private int heapArray[];
	private int totalCount;
	
	public Heap(int intialCapacity)
	{
		heapArray=new int[intialCapacity];
		totalCount=0;
	}
	
	private int parentIndex(int childIndex)
	{
		return ((childIndex-1)/2);
	}
	
	private int leftChildIndex(int parentIndex)
	{
		return ((parentIndex+1)/2);
	}
	
	private int rightChildIndex(int parentIndex)
	{
		return (parentIndex+2)/2;
	}
	private boolean isFull()
	{
		return (totalCount<heapArray.length)?false:true;
	}
	public void insert(int value)
	{
		if(isFull())
		{
			throw new IndexOutOfBoundsException("Heap is full");
		}
		heapArray[totalCount]=value;
		heapifyAbove(totalCount);
		totalCount++;
	}
	
	public void printHeap()
	{
		for(int i=0;i<totalCount;i++)
		{
			System.out.print(heapArray[i]);
			System.out.print(",");
		}
		System.out.println();
	}
	
	public int  delete(int index)
	{
		if(totalCount==0 || index > totalCount)
		{
			throw new IndexOutOfBoundsException("Heap is empty or Index is invalid");
		}
		int deletedValue=heapArray[index];
		heapArray[index]=heapArray[totalCount-1];
		
		
		if(index==0||heapArray[index]<heapArray[parentIndex(index)])
		{
			HeapifyBelow(index);
		}
		else
		{
			heapifyAbove(index);
		}
		
		totalCount-=1;
		return deletedValue;
	}
	
	private void HeapifyBelow(int index)
	{
		int swapChildIndex;
		
		while(index < totalCount-1)
		{
			int leftChildIndex=leftChildIndex(index);
			int rightChildIndex=rightChildIndex(index);
			
			if(leftChildIndex < totalCount-1)  //has a left child
			{
				if(rightChildIndex < totalCount-1) // has a right child
				{
					swapChildIndex=(heapArray[leftChildIndex]>heapArray[rightChildIndex]?leftChildIndex:rightChildIndex);
				}
				else
				{
					swapChildIndex=leftChildIndex;
				}
				
				if(heapArray[index]<heapArray[swapChildIndex])
				{
					int temp=heapArray[swapChildIndex];
					heapArray[swapChildIndex]=heapArray[index];
					heapArray[index]=temp;
				}
				else
				{
					break;
				}
			}
			else
			{
				break;
			}
		}
	}
	
	private void heapifyAbove(int index)
	{
		int valueToReplace=heapArray[index];
		while(index >0 && valueToReplace>heapArray[parentIndex(index)])
		{
			heapArray[index]=heapArray[parentIndex(index)];
			index=parentIndex(index);
		}
		heapArray[index]=valueToReplace;
	}
}
