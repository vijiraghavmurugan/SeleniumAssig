package week3.Day1.assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Madam", rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (rev.equalsIgnoreCase(str)) {
			System.out.println("It is a Palindrome");
		} else {
			System.out.println("It is not a Palidrome");
		}

	}

}
