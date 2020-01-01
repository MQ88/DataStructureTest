package datastructure.trees;

import java.util.Comparator;
import java.util.Stack;



public class BinarySearchTree<T> implements Trees<T>{
	
	private TreeNode<T> root;
	private Comparator<T> comparator;
	private int size;
	
	BinarySearchTree(Comparator<T> comparator)
	{
		this.comparator=comparator;
		size=0;
	}

	@Override
	public void insert(T value) {
		if(root==null)
		{
			root=new TreeNode<T>(value);
		}
		else{
			insertbst(root,value);
		}	
	}
	public void insertbst(TreeNode<T> currpos,T insertval)
	{
		T currvalue=currpos.getData();
		//if the current value is less than insert value
		
		if(comparator.compare(currvalue, insertval)>0)
		{
			if(currpos.getLeft()==null)
			{
				currpos.setLeft(new TreeNode<>(insertval));
			}
			else
			{
				insertbst(currpos.getLeft(),insertval);
			}
		}
		else 
		{
			if(currpos.getRight()==null)
			{
				currpos.setRight(new TreeNode<>(insertval));
			}
			else
			{
				insertbst(currpos.getRight(),insertval);
			}
		}
	}

	@Override
	public void search(T value) {
	}

	@Override
	public T delete(T value) {
		
		return null;
	}

	@Override
	public void inorder(Enum <traverseType> traverseType ) {
		System.out.print("\n"+traverseType.toString()+"-> ");
		if(traverseType.equals(Trees.traverseType.INORDER_RECURSIVE))
		{
		recurrsiveinorder(root);
		}
		else if(traverseType.equals(Trees.traverseType.INORDER_ITERATIVE))
		{
			iterativeinorder();
		}
		
		
	}
	private void iterativeinorder()
	{
		Stack<TreeNode<T>> stack=new Stack<>();
		TreeNode<T> curr=root;
		while(curr!=null || stack.empty()==false)
		{
			if(curr!=null)
			{
				stack.push(curr);
				curr=curr.getLeft();
			}
			else
			{
				curr=stack.pop();
				System.out.print(curr.getData()+" ");
				curr=curr.getRight();
			}
			
		}
		
	}
	
	private void recurrsiveinorder(TreeNode<T> curr )
	{
		if(curr!=null)
		{
		recurrsiveinorder(curr.getLeft());
		System.out.print(curr.getData()+" ");
		recurrsiveinorder(curr.getRight());
		}
	}

	@Override
	public boolean empty() {
		
		return false;
	}

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public void preorder(Enum<Trees.traverseType> traverseType )  {
	System.out.print("\n"+traverseType.toString()+"-> ");	
		if(Trees.traverseType.PREORDER_RECURSIVE.equals(traverseType))
		{
			preorderrecursive(root);
		}
		else if(Trees.traverseType.PREORDER_ITERATIVE.equals(traverseType))
		{
			preorderiterative();
		}
	}
	
	private void preorderrecursive(TreeNode<T> curr)
	{
		if(curr!=null)
		{
			System.out.print(curr.getData()+" ");
			preorderrecursive(curr.getLeft());
			preorderrecursive(curr.getRight());
			
		}
	}
	
	private void preorderiterative()
	{
		if(root!=null)
		{
			Stack<TreeNode<T>> stack=new Stack<>();
			stack.push(root);
			TreeNode<T> currnode=null;
			while(stack.empty()==false)
			{
				currnode=stack.pop();
				System.out.print(currnode.getData()+" ");
				if(currnode.getRight()!=null)
				{
					stack.push(currnode.getRight());
				}
				if(currnode.getLeft()!=null)
				{
					stack.push(currnode.getLeft());
				}
			}
		}
	}
	

}
