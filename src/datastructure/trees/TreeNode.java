package datastructure.trees;

public class TreeNode<T> {

	private T data;
	private TreeNode<T> left;
	private TreeNode<T> right;
	public TreeNode() {
		super();
	}
	public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public TreeNode(T data)
	{
		this(data,null,null);
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public TreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}
	public TreeNode<T> getRight() {
		return right;
	}
	public void setRight(TreeNode<T> right) {
		this.right = right;
	}
	
	
}
