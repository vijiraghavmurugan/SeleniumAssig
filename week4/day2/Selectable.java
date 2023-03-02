package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//li[text()='Item 5']")).click();

	}

}
