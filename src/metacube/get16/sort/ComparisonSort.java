package metacube.get16.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Kritik Garg
 *
 */
public class ComparisonSort {

	List<Integer> data;

	/**
	 * Constructor
	 * 
	 * @param inData
	 */
	public ComparisonSort(ArrayList<Integer> inData) {
		data = inData;
	}

	/**
	 * To call efficient method according to the size of Data
	 */
	public void sort() {
		if (data.size() < 10) {
			bubbleSort();
			System.out.println("Bubble Sort");
		} else {
			quickSort();
			System.out.println("Quick Sort");
		}
	}

	/**
	 * Method to rearrange list in ascending order of data by Bubble sort
	 */
	public void bubbleSort() {
		int n = data.size();
		for (int i = 0; i < data.size(); i++) {
			for (int j = 1; j < n - i; j++) {
				if (data.get(j - 1) > data.get(j)) {
					swap(j, j - 1);
				}
			}

		}

	}

	/**
	 * Method to rearrange list in ascending order of data by quick sort
	 */
	public void quickSort() {
		quickSort(0, data.size() - 1);
	}

	/**
	 * Private Method to rearrange array in ascending order of data by quick
	 * sort
	 * 
	 * @param start
	 *            int start index of array
	 * @param end
	 *            int last index of array
	 */
	private void quickSort(int start, int end) {
		int pivot, i, j;
		if (start < end) {
			// Select first element as Pivot
			pivot = start;
			i = start;
			j = end;

			// Base condition
			while (i < j) {
				// increment i till found greater element than pivot
				for (i = start; i <= end; i++) {
					if (data.get(i) > data.get(pivot)) {
						break;
					}
				}
				// decrement j till found lesser element than pivot
				for (j = end; j >= start; j--) {
					if (data.get(j) <= data.get(pivot)) {
						break;
					}
				}
				// if i<j than swap
				if (i < j) {
					swap(i, j);
				}
			}
			// set pivot to jth element & move pivot to proper position
			swap(j, pivot);

			// Repeat for sub arrays
			quickSort(start, j - 1);
			quickSort(j + 1, end);
		}
	}

	/**
	 * To swap index i to index j
	 * 
	 * @param i
	 * @param j
	 */
	private void swap(int i, int j) {
		int tmp = data.get(i);
		data.set(i, data.get(j));
		data.set(j, tmp);
	}
}
