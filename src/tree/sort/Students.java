package tree.sort;

import java.util.Scanner;
/**
 * 
 * @author Kritik Garg
 *
 */
public class Students {

	public static void main(String[] args) {
		Students students = new Students();
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		Scanner scan = new Scanner(System.in);
		// to interact with user
		while (true) {
			int userChoice = 0;
			int inData = students.getIntfromUser("Roll No");
			binarySearchTree.insert(inData);
			System.out.println("\nPress 1 for continue, 2 for exit");
			while (true) {
				userChoice = students.getIntfromUser("Choice ");
				if (userChoice == 1 || userChoice == 2) {
					break;
				} else {
					System.out.println("try again, Enter 1 or 2");
				}
			}
			if (userChoice == 2) {
				break;
			}
		}
		scan.close();
		System.out.println("sorted order of roll no");
		// inorder of tree for sorted order
		binarySearchTree.inorder();
		System.out.println("Process End.");

	}

	/**
	 * Method to read integer data from standard input
	 * 
	 * @param Name
	 *            of variable to print
	 * @return int value of integer
	 */
	public int getIntfromUser(String Name) {
		Scanner s = new Scanner(System.in);
		int number = 0;
		while (true) {
			try {
				System.out.println("Enter " + Name);
				number = s.nextInt();
				if (number > 0) {
					break;
				} else {
					System.out.println("Invalid, Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid, Try again");
				s.next();
			}
		}
		return number;
	}

}
