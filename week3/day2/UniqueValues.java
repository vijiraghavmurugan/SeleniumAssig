package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class UniqueValues {

	public static void main(String[] args) {
		String str="google";
		
		char[] strArr=str.toCharArray();
		
		Set<Character> s=new HashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			s.add(strArr[i]);
		}
		
		System.out.println(s.toString());
	}

}
