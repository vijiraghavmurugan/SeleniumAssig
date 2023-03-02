package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.day1.LearningWB;

public class CreateLead extends CommonMethods {

	@Test(dataProvider = "Create")
	public void LeadCreation(String cname, String fname, String lname) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("15");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
	}

//	@DataProvider
//	public String[][] sendData(){
//		String [][] data =new String[3][3];
//		
//		data[0][0]="TL";
//		data[0][1]="Viji";
//		data[0][2]="RM";
//		
//		data[1][0]="Zoho";
//		data[1][1]="Sai";
//		data[1][2]="B";
//		
//		data[2][0]="Wipro";
//		data[2][1]="Balaji";
//		data[2][2]="R";
//		
//		return data;
//	}

	@DataProvider(name = "Create")
	public String[][] sendData() throws IOException {
		return LearningWB.readData();

	}

}
