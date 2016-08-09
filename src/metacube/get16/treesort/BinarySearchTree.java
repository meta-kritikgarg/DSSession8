package metacube.get16.treesort;

import java.util.ArrayList;

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
	public ArrayList<Integer> inorder() {
		ArrayList<Integer> output = new ArrayList<Integer>();
		inorder(root,output);
		return output;
	}

	private void inorder(BinaryNode root,ArrayList<Integer> out) {
		if (root != null) {
			inorder(root.getLeft(),out);
			out.add(root.getData());
			inorder(root.getRight(),out);
		}
	}

}
