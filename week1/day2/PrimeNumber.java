package week1.day2.assignment;

public class PrimeNumber {

	public static void main(String[] args) {

		int input = 13;
		boolean flag = false;
		// Iterate from 2 to half of the input
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Prime");
		} else {
			System.out.println("Not a Prime");
		}
	}
}
