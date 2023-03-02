package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPriceList {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		//Searching for Phones
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		//Print price of every phone and printing the lowest
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> pricesInt=new ArrayList<Integer>();
		for(int i=0;i<prices.size();i++) {
			String pr=prices.get(i).getText();
			pr=pr.replaceAll(",", "");
			System.out.println(pr);
			pricesInt.add(Integer.parseInt(pr));
		}
		
		System.out.println("The lowest Price is : "+Collections.min(pricesInt));
		
	}

}
