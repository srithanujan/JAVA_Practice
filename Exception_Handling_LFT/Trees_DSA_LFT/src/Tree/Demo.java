package Tree;

public class Demo {

	public static void main(String[] args) {
		BinaryTree tree =  new BinaryTree(10);
		tree.insertLeft(tree.root, 5);
		tree.insertRight(tree.root, 15);
		tree.insertLeft(tree.root.left, 4);
		tree.insertRight(tree.root.right, 6);
		tree.insertLeft(tree.root.right, 7);
		
		BinaryTree.preOrder(tree.root);
		System.out.println();
		BinaryTree.inOrder(tree.root);
		System.out.println();
		BinaryTree.postOrder(tree.root);
		
		
	}

}
