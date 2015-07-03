package com.binary.serachtree;

public class MainBinarySearchTree {
	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst.insertNode(40).insertNode(25).insertNode(78).insertNode(10).insertNode(3).insertNode(17)
				.insertNode(32).insertNode(30).insertNode(38).insertNode(78).insertNode(50)
				.insertNode(93);
		bst.printInorder();
		
			
	}
}
