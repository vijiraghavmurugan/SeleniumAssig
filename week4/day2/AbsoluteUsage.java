package week4.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteUsage {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		
		List<WebElement> absUsage = driver.findElements(By.xpath("(//table)[1]/tbody/tr[2]/td"));
		for(WebElement abs:absUsage) {
			String text=abs.getText();
			System.out.println(text);
		}
	}

}
