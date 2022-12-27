package week4.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagsRowsCols {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://html.com/tags/table");
		driver.manage().window().maximize();

		List<WebElement> col = driver.findElements(By.xpath("(//table)[2]/tbody/tr[2]/td"));
		int cSize = col.size();
		System.out.println("Columns : "+cSize);
		
		List<WebElement> row = driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
		int rSize=row.size();
		System.out.println("Row : "+rSize);
	}

}
