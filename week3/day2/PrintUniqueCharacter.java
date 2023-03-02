package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String name = "Viji";
		char[] cName = name.toCharArray();

		Set<Character> nameSet = new HashSet<Character>();

		for (int i = 0; i < cName.length; i++) {
			nameSet.add(cName[i]);
		}

		System.out.println(nameSet);
	}

}
