package week1.day1.assignment;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public double mul(int a, double b) {
		return a * b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public double sub(double a, double b) {
		return a - b;
	}

	public int div(int a, int b) {
		return a / b;
	}
	
	public double div(int a, double b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		System.out.println(cal.add(2,6));
		System.out.println(cal.add(2, 7, 0));
		System.out.println(cal.sub(5, 2));
		System.out.println(cal.sub(3.88999, 1.99787));
		System.out.println(cal.mul(3, 8));
		System.out.println(cal.mul(3, 4.8790));
		System.out.println(cal.div(5, 2.5));
		System.out.println(cal.div(9, 2));
	}

}
