package leafTaps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day1.ReadExcel;

public class ProjectSpecificMethodsParameterization {
	
	 public   ChromeDriver driver;
	 
     @Parameters ({"url","username", "password"})
	
	 @BeforeMethod
	 public void login (String url ,String username ,String password){
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys(username);
		
		driver.findElementById("password").sendKeys(password);
		
		driver.findElementByXPath("//input[@type ='submit']").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
	

	}
     
     
     @DataProvider
     
     public String[][] getData() throws IOException
     
     {
    	 
    	 ReadExcel data = new ReadExcel();
    	 
    	 return data.readExcel();
    	 
     }
     
     
     
    
     
     /*{
    	 
    	 String [][] data = new String[2][3];
    	 
    	 data[0][0]  = "TestLeaf" ;
    	 data[0][1]  = "Sharath" ;
    	 data[0][2]  = "S" ;
    	 
    	 
    	 data[1][0]  = "TestLeaf" ;
    	 data[1][1]  = "babu" ;
    	 data[1][2]  = "M" ;
    	 
    	 return data;
    	 
     }*/

}
