package testingMarathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		// Chennai as Source
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@class='selected']")).click();

		// Bangalore as Destination
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		// Picking the date
		driver.findElement(By.xpath("//label[text()='Date']")).click();
		driver.findElement(By.xpath("//td[text()='15']")).click();

		Thread.sleep(5000);

		// Search for the buses
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();

		// closing the notification
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();

		// printing the no of buses
		WebElement buses = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		System.out.println(buses.getText());

		// Clicking SLEEPER
		WebElement sleeper = driver.findElement(By.xpath("//label[@for='bt_SLEEPER'][1]"));
		driver.executeScript("arguments[0].scrollIntoView()", sleeper);
		sleeper.click();

		// printing the second bus
		List<WebElement> secondBus = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		System.out.println(secondBus.get(2).getText());

		// Click on View Seats
		List<WebElement> seats = driver.findElements(By.xpath("//div[text()='View Seats']"));
		seats.get(1).click();

		
	}

}
