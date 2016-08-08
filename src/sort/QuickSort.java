package sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

	List<Integer> data;

	public QuickSort(ArrayList<Integer> inData) {
		data = inData;
	}

	/**
	 * Method to rearrange list in ascending order of data by quick sort
	 */
	public void reArrangeByQuickSort() {
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
					int tmp = data.get(i);
					data.set(i, data.get(j));
					data.set(j, tmp);
				}
			}
			// set pivot to jth element & move pivot to proper position
			int tmp = data.get(j);
			data.set(j, data.get(pivot));
			data.set(pivot, tmp);

			// Repeat for sub arrays
			quickSort(start, j - 1);
			quickSort(j + 1, end);
		}
	}
}
