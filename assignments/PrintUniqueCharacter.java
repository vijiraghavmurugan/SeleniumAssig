package Week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
	

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
		String name="Viji";
		char[] cName=name.toCharArray();
		
		Set<Character> nameSet= new HashSet<Character>();
		
		for(int i =0;i<cName.length;i++) {
			nameSet.add(cName[i]);
		}
		
		System.out.println(nameSet);
	}

}
