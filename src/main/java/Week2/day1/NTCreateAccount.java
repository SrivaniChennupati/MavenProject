package Week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NTCreateAccount {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("http://leaftaps.com/opentaps");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElementById("username").sendKeys("Demosalesmanager");
	    
	    driver.findElementById("password").sendKeys("crmsfa");
	    
	    driver.findElementByClassName("decorativeSubmit").click();
	    
	    driver.findElementByLinkText("CRM/SFA").click();
	    
	    driver.findElementByLinkText("Accounts").click();
	  
	    driver.findElementByLinkText("Create Account").click();
		
	    WebElement WE1 = driver.findElementByXPath("//select[@id ='currencyUomId']");
	    
	    Select Se = new Select(WE1);
	    
	    Se.selectByValue("INR");
	    
	    driver.findElementByXPath("//textarea[@name = 'description']").sendKeys("NRI Account");
	    
	    driver.findElementByXPath("//input[@id ='groupNameLocal']").sendKeys("photon");
	    
	    driver.findElementByXPath("//input[@id='officeSiteName']").sendKeys("CRM");
	    
	    WebElement WE2 = driver.findElementByXPath("//select[@name='industryEnumId']");
	    
	    Select Se1 = new Select (WE2);
	    
	    Se1.selectByVisibleText("Computer Software");
	    
	    driver.findElementByXPath("//input[@type='submit']").click();
	    
	    
	    
	    

	}

}
