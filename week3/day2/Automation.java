package week3.day2.assignments;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void selenium() {
		System.out.println("selenium()");
	}

	public void java() {
		System.out.println("java()");		
	}

	@Override
	public void ruby() {
		System.out.println("ruby()");				
	}
	
	
	
	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.selenium();
		auto.java();
		auto.ruby();
		auto.python();
	}

}
