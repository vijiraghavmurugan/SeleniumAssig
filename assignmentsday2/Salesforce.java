package week4.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Salesforce {

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
		
		//click on the learn more option in the Mobile publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		//Switch to the next window using Windowhandles.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> ls=new ArrayList<String>(windowHandles);
		driver.switchTo().window(ls.get(1));
		
		//click on the confirm button in the redirecting page
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		//Get the title
		System.out.println(driver.getTitle());
		
		//Get back to the parent window
		driver.switchTo().window(ls.get(0));
		
		//close the browser
		driver.quit();
	}

}
