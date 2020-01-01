package datastructure.trees;

public interface Trees<T> {
	
	public enum traverseType
	 {
	 	INORDER_RECURSIVE,
	 	INORDER_ITERATIVE,
	 	PREORDER_RECURSIVE,
	 	PREORDER_ITERATIVE
	 	
	 }
	
	public void insert(T value);
	public void search(T value);
	public T delete(T value);
	public void inorder(Enum<traverseType> traverseType);
	public void preorder(Enum<traverseType> traverseType);
	public boolean empty();
	public int size();
	

}
