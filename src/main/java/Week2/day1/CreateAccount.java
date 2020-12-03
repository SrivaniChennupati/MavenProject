package Week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
	    
	 driver.findElementByXPath("//input[@id = 'accountName']").sendKeys("Debit Account");
	 
	 driver.findElementByXPath("//textarea[@name ='description']").sendKeys("Selenium Automation Tester");
	    
	  driver.findElementByXPath("//input[@name='groupNameLocal']").sendKeys("Srivani") ;
	  
	  driver.findElementByXPath("//input[@id = 'officeSiteName']").sendKeys("CRM");
	  
	  driver.findElementByXPath("//input[@id='annualRevenue']").sendKeys("700000");
	  
	  WebElement We = driver.findElementByXPath("//select[@name ='industryEnumId']");
	  
	  Select Se = new Select(We);
	  
	  Se.selectByVisibleText("Computer Software");
	  
	  
	  WebElement We1 = driver.findElementByXPath("//select[@name='ownershipEnumId']");
	    
	  Select Se1 = new Select(We1);
	  
	  Se1.selectByVisibleText("S-Corporation");
	  
	  
	  WebElement We3 = driver.findElementByXPath("//select[@name='dataSourceId']");
	   
	  Select Se3 = new Select(We3);
	  
	  Se3.selectByValue("LEAD_EMPLOYEE");
	  
	  WebElement We4 = driver.findElementByXPath("//select[@id='marketingCampaignId']");
	    
	  
	  Select Se4 = new Select(We4);
	  
	  Se4.selectByIndex(6);
	  
	  
	 driver.findElementByXPath("//input[@type='submit']").click();
	 
	 
		
	

	}

}
