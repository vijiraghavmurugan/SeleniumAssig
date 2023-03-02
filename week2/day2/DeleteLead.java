package week2.day2.assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9791");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		WebElement leadId = driver.findElement(By.xpath("//a[text()='16371']"));
		String lead = leadId.getText();
		System.out.println(lead);
		leadId.click();

		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();

		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(lead);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		String display = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if (display.equals("No records to display")) {
			System.out.println("Deleted successfully");
		} else {
			System.out.println("Not Deleted successfully");
		}
		
		driver.close();

	}

}
