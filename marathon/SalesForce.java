package testingMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);

		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter Username
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");

		// Enter Password
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");

		// click login
		driver.findElement(By.id("Login")).click();

		// Click on the toggle menu
		driver.findElement(By.className("slds-icon-waffle")).click();

		// Click on View All
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		// Click on the Sales
		WebElement sales = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].scrollIntoView()", sales);
		sales.click();

		// Click on the opportunities
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click()", opp);

		// Click on New button
		driver.findElement(By.xpath("//a[@title='New']")).click();

		// Enter the Opportunity Name
		WebElement oppName = driver.findElement(By.xpath("//input[@name='Name']"));
		oppName.sendKeys("Salesforce Automation by Viji");
		System.out.println(oppName.getText());
		

		// Click on the close date
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("12/14/2022");

		// Select Stage as Need Analysis
		driver.findElement(By.xpath("//button[@role='combobox'][1]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		
		//Click save
		//driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
	}

}
