package week3.day2.assignments;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Inside deposit() : AxisBank");
	}
	public static void main(String[] args) {
		BankInfo bf=new AxisBank();
		bf.deposit();
	}

}
