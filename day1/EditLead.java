package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class EditLead extends  ProjectSpecificMethod {
@Test(dataProvider="EditLead")
	public  void runeditlead(String PhNum, String companyName) throws InterruptedException {
		
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[text()='Phone'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhNum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
}
@DataProvider(name="EditLead")
public  String[][] getData() {
	 
    String[][]data=new String[2][2];
    //1st set of data
    data[0][0]="99";
    data[0][1]="CTS";
    
    
   //2nd set of data
    data[1][0]="99";
    data[1][1]="TestLeaf";
    
    return data;
    
    
    
    }   
}






