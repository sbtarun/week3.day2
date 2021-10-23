package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		boolean dup = false;
		Set<Integer> unique = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (unique.add(arr[i]) == false) {
				System.out.println("Duplicate value is: " + arr[i]);
				dup = true;
			}
		}
		if (dup == false)
			System.out.println("No duplicate values");
		System.out.println("Unique values are: " + unique);
	}

}
