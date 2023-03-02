package week1.day1.assignment;

public class Mobile {

	public void makeCell() {
		String mobileModel = "Redmi Note5";
		float mobileWeight = 180f;
		System.out.println("Mobile Model : " + mobileModel);
		System.out.println("Mobile Weight : " + mobileWeight);
	}

	public void sendMsg() {
		boolean isFullyCharged = false;
		int mobileCost = 17000;
		System.out.println("Mobile Charge : " + isFullyCharged);
		System.out.println("Mobile Cost : " + mobileCost);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mob = new Mobile();
		mob.makeCell();
		mob.sendMsg();
		System.out.println("This is my mobile");
	}

}
