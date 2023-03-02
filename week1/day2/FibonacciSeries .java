package week1.day2.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {

		int range = 8, firstNum = 0, secNum = 1, sum = 0;
		System.out.println(firstNum);
		for (int i = 0; i < range; i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
		}
		System.out.println(sum);

	}
}
