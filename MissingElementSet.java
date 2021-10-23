package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementSet {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		List<Integer> missing = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			missing.add(arr[i]);
		}
		Collections.sort(missing);
		System.out.println("Array after sorting: " + missing);
		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) != missing.get(i)) {
				System.out.println("Missing element is: " + (i + 1));
				break;
			}
		}
	}
}