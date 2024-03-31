package com.mmkarami.binary.tree.dfs.preorder;

public class BinaryTreeADT<E> {

	private Node<E> root;

	public BinaryTreeADT(Node<E> root) {
		this.root = root;
	}

	public BinaryTreeADT() {
		this.root = null;
	}

	public Node<E> getRoot() {
		return root;
	}

	public void setRoot(Node<E> root) {
		this.root = root;
	}

	public void print() {
		printNodeValuesByDfsPreOrder(root);
	}

	public int size() {
		return sizeTreeByDfsPreOrder(root);
	}
	
	public String traverse() {
		return traverseNodeValuesByDfsPreOrder(root);
	}

	private void printNodeValuesByDfsPreOrder(Node<E> node) {
		if (node == null)
			return;
		System.out.print(node.toString());

		printNodeValuesByDfsPreOrder(node.getLeftNode());
		printNodeValuesByDfsPreOrder(node.getRightNode());
	}

	private int sizeTreeByDfsPreOrder(Node<E> node) {
		if (node == null)
			return 0;
		int sum = 0;
		sum++;
		sum += sizeTreeByDfsPreOrder(node.getLeftNode());
		sum += sizeTreeByDfsPreOrder(node.getRightNode());
		return sum;
	}
	
	private String traverseNodeValuesByDfsPreOrder(Node<E> node) {
		if (node == null)
			return "";
		String result = node.toString() + " ";
		result += traverseNodeValuesByDfsPreOrder(node.getLeftNode());
		result += traverseNodeValuesByDfsPreOrder(node.getRightNode());
		return result;
	}
}