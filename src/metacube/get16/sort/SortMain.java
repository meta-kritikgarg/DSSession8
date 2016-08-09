package metacube.get16.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class SortMain {

	public static void main(String[] args) {

		ArrayList<Integer> inData = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Sorting Portal");
		System.out.println("Enter No to sort, Enter Q or q for next step");
		while (true) {
			String userData = scan.next();

			if (userData.charAt(0) == 'Q' || userData.charAt(0) == 'q') {
				break;
			}
			try {
				int intData = Integer.valueOf(userData);
				inData.add(intData);
				System.out
						.println("Enter Q or q for next step OR Enter No to insert");
			} catch (Exception e) {
				System.out.println("Invalid input, Try Again");
			}

		}
		
		System.out.println("Selsect sorting technique \n1 for ComparisonSort \n2 for Linear Sort");
		
		while(true) {
			
			String userData = scan.next();

			try {
				int intData = Integer.valueOf(userData);
				if(intData ==1 || intData == 2)
				{
					switch(intData) {
					case 1: 
						ComparisonSort comparisonSort = new ComparisonSort(inData);
						comparisonSort.sort();
						break;
					case 2:
						LinearSort linearSort = new LinearSort(inData);
						linearSort.sort();
						break;
					}
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid input, Try Again");
			}

		}

		for (Integer integer : inData) {
			System.out.println(integer);
		}
		
	}

}
