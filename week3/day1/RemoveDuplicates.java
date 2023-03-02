package week3.Day1.assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;

		String[] textArray = text.split(" ");

		for (int i = 0; i < textArray.length; i++) {
			for (int j = i + 1; j < textArray.length; j++) {
				if (textArray[i].equalsIgnoreCase(textArray[j])) {
					count++;
					if (count >= 1) {
						textArray[j] = "";
						// count = 0;
					}
				}
			}
		}
		System.out.println(String.join(" ", textArray));
	}

}
