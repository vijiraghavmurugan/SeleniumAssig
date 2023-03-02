package week3.day2.assignments;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {

		int[] numbers = { 1, 6, 4, 8, 3, 4, 8, 2, 5, 7, 10 };

		Set<Integer> numSet = new TreeSet<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			numSet.add(numbers[i]);
		}

		System.out.println(numSet);

		for (int j = 1; j <= numSet.size(); j++) {
			if (numSet.contains(j)) {
				j++;
			} else {
				System.out.println(j);
			}
		}
	}

}
