package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] textArr=text.split(" ");
		Set<String> textSet=new HashSet<String>();
		
		for(int i=0;i<textArr.length;i++) {
			textSet.add(textArr[i]);
		}
		
		System.out.println(textSet);
	}

}
