package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


   
public class CreateLead extends  ProjectSpecificMethod {
    @Test(dataProvider="CreateLead")
   
	public void runCreateLead(String companyName, String fName, String lName) {
		// TODO Auto-generated method stub

	
		
		/*ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();*/
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
    }
		//driver.close();
		 @DataProvider(name="CreateLead")
		 public  String[][] getData() {
		 
    String[][]data=new String[2][3];
    //1st set of data
    data[0][0]="Qeagle";
    data[0][1]="Sharmi";
    data[0][2]="A";
    
    //2nd set of data
    data[1][0]="Leaftap";
    data[1][1]="Aravind";
    data[1][2]="S";
    return data;
    
    
    
    }   
    
}






