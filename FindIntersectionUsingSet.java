package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class FindIntersectionUsingSet {

	public static void main(String[] args) {
		int[] a = { 3, 2, 11, 4, 6, 7 };
		int[] b = { 1, 2, 8, 4, 9, 7 };
		Set<Integer> dups = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			dups.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			if (dups.contains(b[i])) {
				System.out.println("Intersecting data is: " + a[i]);
			}
		}
	}
}
