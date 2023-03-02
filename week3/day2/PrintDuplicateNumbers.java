package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		int[] data = { 4, 3, 6, 8, 29, 1, 2, 4, 7, 8 };

		Set<Integer> numbers = new HashSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			if (numbers.contains(data[i])) {
				System.out.println("Duplicate Number : " + data[i]);
			} else {
				numbers.add(data[i]);
			}
		}

	}

}
