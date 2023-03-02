package week3.Day1.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String txt1 = "stops";
		String txt2 = "potss";

		if (txt1.length() == txt2.length()) {
			char[] ch1 = txt1.toCharArray();
			char[] ch2 = txt2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2)) {
				System.out.println("They are same");
			} else {
				System.out.println("They are not same");
			}
		}
	}

}
