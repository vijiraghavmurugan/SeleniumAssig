package week1.day2.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(arr);
		for (int l = 1; l < arr.length; l++) {
			if (l != arr[l - 1]) {
				System.out.println(l);
				break;
			}
		}

	}

}
