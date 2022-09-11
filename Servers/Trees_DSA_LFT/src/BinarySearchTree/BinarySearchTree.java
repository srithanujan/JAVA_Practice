package BinarySearchTree;

public class BinarySearchTree {
	Node root;
	
	class Node {
		int key;
		Node right,left;
		
		public Node(int val) {
			key = val;
			right = left = null;
			
		}
	}
	
	public BinarySearchTree(int val) {
		root = new Node(val);
	}
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void insert(int val) {
		insert(root, val);
	}
	
	public Node insert(Node root, int val) {
		if(root == null)
			return new Node(val);
		
		if(val < root.key)
			root.left = insert(root.left, val);
		else
			root.right = insert(root.right, val);
		
		return root;
	}
	
	public void inOrder(Node root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(root.key + " ");
			inOrder(root.right);
		}
	}
	
	public  Node search(Node root, int val) {
		if(root == null || root.key == val)
			return root;
		
		if(val < root.key)
			search(root.left,val);
		
		return search(root.right, val);
	}

}
