package com.binary.serachtree;

public class BinarySearchTree {
	public Node root;

	public BinarySearchTree insertNode(int data) {
		Node node = new Node(data);

		if (root == null) {
			root = node;
			return this;
		}

		else {
			insertInTreeNode(root, node);
		}
		return this;

	}

	private void insertInTreeNode(Node latestRoot, Node node) {
		if (latestRoot.data > node.data) {
			if (latestRoot.leftChild == null) {
				latestRoot.leftChild = node;
			}

			else {
				insertInTreeNode(latestRoot.leftChild, node);
			}
		}

		else {
			if (latestRoot.data < node.data) {
				latestRoot.rightChild = node;
			}

			else {
				insertInTreeNode(latestRoot.rightChild, node);
			}
		}
	}
	
	public void printInorder() {
			    printInOrderRec(root);
			    System.out.println("");
			  }

	public void printInOrderRec(Node currRoot) {
		if (currRoot == null) {
			return;
		}
		printInOrderRec(currRoot.leftChild);
		System.out.print(currRoot.data + ", ");
		printInOrderRec(currRoot.rightChild);
	}
}
