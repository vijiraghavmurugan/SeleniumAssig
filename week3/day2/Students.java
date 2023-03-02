package week3.day2.assignments;

public class Students {

	public void getStudentInfo() {
		System.out.println("getStudentInfo()");
	}

	public void getStudentInfo(int id) {
		System.out.println("getStudentInfo(int id) : "+id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("getStudentInfo(int id, String name) : "+id);
		System.out.println("getStudentInfo(int id, String name) : "+name);
	}

	public void getStudentInfo(String emailId, int phoneNumber) {
		System.out.println("getStudentInfo(String emailId, int phoneNumber) : "+emailId);
		System.out.println("getStudentInfo(String emailId, int phoneNumber) : "+phoneNumber);
	}

	public static void main(String[] args) {
		Students student=new Students();
		student.getStudentInfo();
		student.getStudentInfo(45);
		student.getStudentInfo(46, "Viji");
		student.getStudentInfo("vgrm@gmail.com", 78);
	}

}
