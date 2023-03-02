package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);

		// Load the uRL https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		// Search oneplus 9 pro
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//div[text()='oneplus 9 pro']")).click();

		// Get the price of the first product
		String price = driver.findElement(By.xpath("//a[contains(@href,'oneplus+9+pro')]//span//span")).getText();
		System.out.println(price);

		// Print the number of customer ratings for the first displayed product
		WebElement custRating = driver.findElement(By.xpath("(//a[contains(@href,'oneplus+9+pro')])[3]/span"));
		System.out.println(custRating.getText());

		// Mouse Hover on the stars
		driver.findElement(By.xpath("(//span[@class='a-declarative']//a//i)[3]")).click();
		Thread.sleep(2000);

		// Get the percentage of ratings for the 5 star.
		WebElement fiveStar = driver.findElement(By.xpath("(//a[contains(@href,'ByStar=five_star')])[3]"));
		System.out.println(fiveStar.getText());

		// Click the first text link of the first image
		driver.findElement(By.xpath("//a[contains(@href,'oneplus+9+pro')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> ls = new ArrayList<String>(windowHandles);
		driver.switchTo().window(ls.get(1));

		// Take a screen shot of the product displayed
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File snap = new File("./snaps/amazon.jpg");
		FileUtils.copyFile(srcFile, snap);

		// Click 'Add to Cart' button
		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();

		// Get the cart subtotal and verify if it is correct.
		String subTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println(subTotal);
		if (subTotal.equals(price)) {
			System.out.println("Same subtotal");
		} else {
			System.out.println("Not the same");
		}

	}

}
