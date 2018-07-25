package com.satyesht.datastructure.Trees;

public class Tree {
	
	private TreeNode root;

	public void insert(int value)
	{
		if(root!=null)
		{
		root.insert(root, value);
		}
		else
		{
			root=new TreeNode(value, null, null);
		}
	}
	public void InOrderTraverse()
	{
		root.inOrderTraverse(root);
	}
	
	public TreeNode search(int value)
	{
	   return root.search(root, value);
	}

}
