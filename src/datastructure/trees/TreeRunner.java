package datastructure.trees;

import datastructure.trees.Trees.traverseType;

public class TreeRunner {
	
	
	public static void main(String[] args) {
		Trees<Integer> tree=new BinarySearchTree<>((o1,o2)->(o1-o2));
		tree.insert(15);
		tree.insert(13);
		tree.insert(20);
		tree.insert(-1);
		tree.insert(5);

		tree.inorder(Trees.traverseType.INORDER_RECURSIVE);
		tree.inorder(Trees.traverseType.INORDER_ITERATIVE);
		tree.preorder(traverseType.PREORDER_RECURSIVE);
		tree.preorder(traverseType.PREORDER_ITERATIVE);
		
	}

}
