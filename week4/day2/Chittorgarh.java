package week4.day2.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.chittorgarh.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("navbtn_stockmarket")).click();

		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();

		List<WebElement> securityName = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td[3]"));
		List<String> sName = new ArrayList<String>();

		for (WebElement sec : securityName) {
			String secName = sec.getText();
			sName.add(secName);
		}

		Set<String> secSet = new LinkedHashSet<String>(sName);

		if (sName.size() == secSet.size()) {
			System.out.println("No Duplicates");
		} else {
			System.out.println("Duplicates Found");
		}

	}

}
