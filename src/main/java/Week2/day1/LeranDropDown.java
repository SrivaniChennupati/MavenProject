package Week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeranDropDown {

	public static void main(String[] args) {
		
		
		// launching the browser
		
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe") ;
				
				ChromeDriver driver = new ChromeDriver() ; 
				
				// launching the URL
				
			    driver.get("http://leaftaps.com/opentaps");
			    
			    driver.manage().window().maximize();
			    
			    driver.findElementById("username").sendKeys("Demosalesmanager");
				
				// giving the input for password
				
				driver.findElementById("password").sendKeys("crmsfa");
				
				// clicking on login
				driver.findElementByClassName("decorativeSubmit").click();
				
				// clicking on links
				driver.findElementByLinkText("CRM/SFA").click();
				
				driver.findElementByLinkText("Leads").click();
				
				driver.findElementByLinkText("Create Lead").click();
				
				driver.findElementById("createLeadForm_companyName").sendKeys("Hexware Technologies");
				
				driver.findElementById("createLeadForm_firstName").sendKeys("Srivani");
				
				driver.findElementById("createLeadForm_lastName").sendKeys("Chennupati");
				
				 // we need to find the element 
			    WebElement dropdown = driver.findElementById("createLeadForm_dataSourceId");
			    
			    // covert that into dropdown by using select class 
			    
			   Select se = new Select(dropdown); // dropdown here is the object 
			   
			   // select the dropdown 
			   
			   se.selectByVisibleText("Partner");
			   
			   // to print the all options in the dropdown first we need to get the options 
			   
			 List<WebElement> options  = se.getOptions();
			 
			 for (WebElement  eachoption : options) // here options is the object 
			 {
				 
				 System.out.println(eachoption.getText());
			 }
			    
			 driver.findElementByClassName("smallSubmit").click();
			 
			 driver.findElementById("createLeadForm_firstName").getAttribute("");
 
	}

}
