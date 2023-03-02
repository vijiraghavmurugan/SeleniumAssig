package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=34343;
		int temp=num,i,sum=0;
		
		while(num>0) {
			i=num%10;
			sum=(sum*10)+i;
			num=num/10;
			System.out.println(sum);
		}
		
		if(temp==sum) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not a Palindrome number");
		}
	}

}
