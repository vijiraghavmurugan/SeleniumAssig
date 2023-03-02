package week2.day2.assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Viji");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("RM");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("vijirm@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("vijirm@15");

		WebElement dat = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select datSlct = new Select(dat);
		datSlct.selectByIndex(15);

		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select monthSlct = new Select(month);
		monthSlct.selectByIndex(2);

		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select yearSlct = new Select(year);
		yearSlct.selectByValue("1993");

	}

}
