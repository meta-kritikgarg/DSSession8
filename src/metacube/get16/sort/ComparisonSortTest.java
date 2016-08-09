package metacube.get16.sort;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ComparisonSortTest {

	@Test
	public void testBubbleSort() {
		ArrayList<Integer> inData = new ArrayList<Integer>();
		// adding Randomly generated elements in inData
		for (int i = 0; i < 20; i++) {
			inData.add((int) (Math.random() * 100));
		}
		// Calling sorting procedure -- Bubble Sort
		ComparisonSort comparisonSort = new ComparisonSort(inData);
		comparisonSort.bubbleSort();

		// Check data is sorted or not
		assertEquals(true, checkArray(inData));
		System.out.println(inData);

	}

	@Test
	public void testQuickSort() {
		ArrayList<Integer> inData = new ArrayList<Integer>();
		// adding Randomly generated elements in inData
		for (int i = 0; i < 100; i++) {
			inData.add((int) (Math.random() * 1000));
		}
		// Calling sorting procedure -- Quick Sort
		ComparisonSort comparisonSort = new ComparisonSort(inData);
		comparisonSort.quickSort();

		// Check data is sorted or not
		assertEquals(true, checkArray(inData));
		System.out.println(inData);

	}

	/**
	 * Method to check array is sorted or not
	 * 
	 * @param a
	 *            int[] input array for test
	 * @return true if array is sorted, else false
	 */
	public boolean checkArray(ArrayList<Integer> checkData) {
		for (int i = 0; i < checkData.size() - 1; i++) {
			if (checkData.get(i) > checkData.get(i + 1)) {
				return false; // It is proven that the array is not sorted.
			}
		}
		return true; // array must be sorted.
	}

}
