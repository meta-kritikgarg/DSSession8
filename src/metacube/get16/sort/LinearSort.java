package metacube.get16.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Kritik Garg
 *
 */
public class LinearSort {

	List<Integer> inData;

	/**
	 * Constructor
	 * 
	 * @param inputData
	 */
	public LinearSort(ArrayList<Integer> inputData) {
		inData = inputData;

	}

	/**
	 * To call efficient method according to the values of Data
	 */
	public void sort() {
		for (Integer integer : inData) {
			if (integer > 100) {
				radixSort();
				return;
			}
			countingSort();
			return;
		}
	}

	/**
	 * Method to rearrange list in ascending order of data by counting sort
	 */
	public void countingSort() {
		int[] counter = new int[100];
		for (int value : inData) {
			counter[value]++;
		}
		inData.clear();
		int data = 0;
		for (int i : counter) {
			for (int j = 0; j < i; j++) {
				inData.add(data);
			}
			data++;
		}
	}

	/**
	 * Method to rearrange list in ascending order of data by radix sort
	 */
	public void radixSort() {
		Map<Integer, LinkedList<Integer>> counter = new HashMap<Integer, LinkedList<Integer>>();
		//Adding all the buckets in Map (0 to 9)
		for (int i = 0; i < 10; i++) {
			counter.put(i, new LinkedList<Integer>());
		}

		
		//Starting from 0th index for each inData element
		for (int i = 0;; i++) {
			boolean doBreak = true;
			for (Integer data : inData) {
				//find bucket by i th digit of data
				int key = getDigit(data, i);
				if (key != -1) {
					doBreak = false;
					//add element into corresponded bucket 
					counter.get(key).add(data);
				} else {
					//data have no digit at index i, so add it in 0 bucket
					counter.get(0).add(data);
				}
			}
			//clear inData list
			inData.clear();
			//add data from buckets to inData list
			for (int k = 0; k < 10; k++) {
				while (!counter.get(k).isEmpty()) {
					int sortedData = counter.get(k).poll();
					inData.add(sortedData);
				}
			}
			if (doBreak) {
				break;
			}
		}
	}

	/**
	 * To get index digit from int value
	 * 
	 * @param value
	 * @param index
	 * @return
	 */
	private int getDigit(int value, int index) {
		int divider = (int) Math.pow(10, index);
		value = value / divider;
		// if index is greater than size of digit
		if (value == 0) {
			return -1;
		}
		return value % 10;
	}
}
