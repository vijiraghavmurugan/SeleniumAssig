package week1.day1.assignment;

public class Chrome {

	public void getName() {
		System.out.println("This is getName Method");

	}

	public void printName() {
		System.out.println("This is google chrome");
	}

	static class Browser {

		public static void main(String[] args) {

			Chrome ch = new Chrome();
			ch.getName();
			ch.printName();

		}
	}
}
