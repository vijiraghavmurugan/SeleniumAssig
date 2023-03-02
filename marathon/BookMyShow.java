package testingMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);

		//URL
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Select Hyderabad as location
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		
		//Checking whether Hyderabad is the location
		String URL = driver.getCurrentUrl();
		if(URL.equals("https://in.bookmyshow.com/explore/home/hyderabad")){
			System.out.println("Hyderabad");
		}
		else {
			System.out.println("Not Hyderabad");
		}
		
		//Searching for the movie
		driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")).sendKeys("Avatar: The Way of Water");
		driver.findElement(By.xpath("//span[text()='Avatar: The Way of Water']")).click();
		
		//Clicking book tickets
		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();

		Thread.sleep(4000);
		//Clicking the language and format
		driver.findElement(By.xpath("//span[text()='3D']")).click();
		
		//Printing the name of the first theatre
		WebElement firstTheatre = driver.findElement(By.xpath("//a[@class='__venue-name'][1]"));
		System.out.println(firstTheatre.getText());
		
		//Clicking the info button
		driver.findElement(By.xpath("//div[@class='venue-info-text'][1]")).click();
		
		//Checking for the Parking Facitlity
		WebElement park = driver.findElement(By.xpath("//div[text()='            Parking Facility        ']"));
		driver.executeScript("arguments[0].scrollIntoView()", park);
		String parkF=park.getText();
		if(parkF.equals("Parking Facility")) {
			System.out.println("Parking Facility Available");
		}
		else {
			System.out.println("No Parking Facility Available");
		}
		
		Thread.sleep(5000);
		//Close the Theatre pop-up
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		
		//Click on the first green available timing
		//driver.findElements(By.xpath("))
	}

}
