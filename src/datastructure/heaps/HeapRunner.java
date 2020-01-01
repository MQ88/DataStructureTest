package datastructure.heaps;

public class HeapRunner {

	public static void main(String[] args) {
		
		Heap h=new Heap(10);
		h.insert(80);
		h.insert(75);
		h.insert(60);
		h.insert(84);
		h.insert(68);
		h.insert(55);
		h.insert(40);
		h.insert(52);
		h.insert(67);
		
		h.printHeap();
		
		
		
	}
}
