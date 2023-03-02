package week2day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sai Enterprise");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Viji");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RM");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vij");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Create Lead practice");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vijirm@gmail.com");
		driver.findElement(By.name("submitButton")).click();

		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SaiRaghav");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vji");
		driver.findElement(By.name("submitButton")).click();

		String title1 = driver.getTitle();
		System.out.println(title1);
	}

}
