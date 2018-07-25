package com.satyesht.datastructure.Trees;

public class TreeNode {

	private int data;
	private TreeNode left;
	private TreeNode right;
	public TreeNode() {
		super();
	}
	public TreeNode(int data, TreeNode left, TreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	public  void insert(TreeNode subTree,int value)
	{
       TreeNode newSubTree=null;
       if(subTree==null)
       {
    	   return;
       }
       else if(subTree.getData()>value)
       {
    	   newSubTree=subTree.getLeft();
    	   if(newSubTree==null)
    	   {
    		   subTree.setLeft(new TreeNode(value, null, null));
    	   }
    	   else
    	   {
    		   insert(newSubTree,value);
    	   }
       }
       else if(subTree.getData()<value)
       {
    	   newSubTree=subTree.getRight();
    	   if(newSubTree==null)
    	   {
    		   subTree.setRight(new TreeNode(value, null, null));
    	   }
    	   else
    	   {
    		   insert(newSubTree,value);
    	   }
       }
	}
	
	public void inOrderTraverse(TreeNode subTree)
	{
		if(subTree!=null)
		{
			inOrderTraverse(subTree.getLeft());
			System.out.print(subTree.getData()+" ");
			inOrderTraverse(subTree.getRight());
		}
	}
	
	public boolean delete(TreeNode subTree,int value)
	{
		
		return false;
	}
	
	public TreeNode search(TreeNode subTree,int value)
	{
		if(subTree==null)
		{
			return null;
		}
		if(subTree.getData() == value)
		{
			return subTree;
		}
		else if(subTree.getData() > value)
		{
	    	return search(subTree.getLeft(),value);
		}
		else if(subTree.getData() < value)
		{
	    	return search(subTree.getRight(),value);
		}
		return null;
	}
	
}
