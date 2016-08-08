package tree.sort;

/**
 * 
 * @author Kritik
 *
 */

public class BinarySearchTree {

	BinaryNode root;

	public BinarySearchTree() {
		root = null;
	}

	/**
	 * to check if tree is empty
	 * 
	 * @return Boolean
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * to insert data
	 * 
	 * @param data
	 */
	public void insert(int data) {
		root = insert(root, data);
	}

	/**
	 * to insert data recursively
	 * 
	 * @param node
	 *            {@link BinaryNode}
	 * @param data
	 *            E
	 * @return {@link BinaryNode}
	 */
	private BinaryNode insert(BinaryNode node, int data) {
		if (node == null) {
			node = new BinaryNode(data);
		} else {
			if (data <= node.getData()) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}
		return node;
	}

	/**
	 * For inorder traversal
	 */
	public void inorder() {
		inorder(root);
	}

	private void inorder(BinaryNode root) {
		if (root != null) {
			inorder(root.getLeft());
			System.out.println(root.getData());
			inorder(root.getRight());
		}
	}

}
