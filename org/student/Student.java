package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student : studentName()");
	}

	public void studentDept() {
		System.out.println("Student : studentDept()");
	}

	public void studentId() {
		System.out.println("Student : student Id()");
	}
	
	public static void main(String[] args) {
		Student stu=new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		
		stu.deptName();
		
		stu.studentDept();
		stu.studentId();
		stu.studentName();
	}
}
