package metacube.get16.treesort;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void testInorder() {
		BinarySearchTree rollNos = new BinarySearchTree();

		// adding Randomly generated elements in inData
		for (int i = 0; i < 20; i++) {
			rollNos.insert((int) (Math.random() * 10000));
		}
		//Inorder traversal 
		ArrayList<Integer> outData = rollNos.inorder();
		System.out.println(outData);
		assertEquals(true, checkArray(outData));

	}

	/**
	 * Method to check arraylist is sorted or not
	 * 
	 * @param a
	 *            int[] input arraylist for test
	 * @return true if arraylist is sorted, else false
	 */
	public boolean checkArray(ArrayList<Integer> checkData) {
		for (int i = 0; i < checkData.size() - 1; i++) {
			if (checkData.get(i) > checkData.get(i + 1)) {
				return false; // It is proven that the arraylist is not sorted.
			}
		}
		return true; // arraylist must be sorted.
	}

}
