package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DeleteLead  extends ProjectSpecificMethod{
@Test(dataProvider="DeleteLead")
	public  void rundeletelead(String Phnum, String leadid) throws InterruptedException {
		
		
		driver.findElement(By.linkText("Find Leads")).click();
	    Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='x-tab-right']//span[text()='Phone']")).click();
		//driver.executeScript("argument[0].click()", phone);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(Phnum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		//driver.close();
}
@DataProvider(name="DeleteLead")
public  String[][] getData() {
	 
    String[][]data=new String[2][2];
    //1st set of data
    data[0][0]="99";
    data[0][1]="10126";
    
    
    //2nd set of data
    data[1][0]="99";
    data[1][1]="10127";
    
    return data;
    
    
    
    }   
}






