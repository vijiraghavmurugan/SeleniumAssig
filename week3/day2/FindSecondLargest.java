package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };

		TreeSet<Integer> tSet = new TreeSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			tSet.add(data[i]);
		}

		List<Integer> list = new ArrayList<Integer>(tSet);

		System.out.println(list.get(list.size() - 2));

	}

}
