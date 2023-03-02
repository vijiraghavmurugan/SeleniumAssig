package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] a = { 3, 2, 11, 4, 6, 7 };
		int[] b = { 1, 2, 8, 4, 9, 7 };
		
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			list1.add(a[i]);
		}
		
		for(int i=0;i<b.length;i++) {
			list2.add(b[i]);
		}
		
		for(int j=0;j<list1.size();j++) {
			for(int k=0;k<list2.size();k++) {
				if(list1.get(j)==list2.get(k)) {
					System.out.print(list1.get(j)+" ");
				}
			}
		}

	}

}
