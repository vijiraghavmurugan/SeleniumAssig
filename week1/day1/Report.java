package week1.day1.assignment;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		System.out.println(stu.studentName);
		System.out.println(stu.rollNo);
		System.out.println(stu.collegeName);
		System.out.println(stu.marksScored);
		System.out.println(stu.cgpa);
		
	}
}

class Student {
	String studentName = "Viji";
	int rollNo = 12;
	String collegeName = "Vel Tech";
	int marksScored = 414;
	float cgpa = 7.4f;
}
