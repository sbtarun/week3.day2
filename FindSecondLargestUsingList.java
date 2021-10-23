package week3.day2.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestUsingList {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, 2, 11, 4, 6, 7);
		Collections.sort(nums);
		System.out.println(nums);
		System.out.println("Second largest number is: " + nums.get(nums.size() - 2));
	}

}
