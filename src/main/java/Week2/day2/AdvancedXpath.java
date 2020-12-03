package Week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("http://leaftaps.com/opentaps");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElementById("username").sendKeys("Demosalesmanager");
	    
	    driver.findElementById("password").sendKeys("crmsfa");
	    
	    driver.findElementByClassName("decorativeSubmit").click();
	    
	    driver.findElementByLinkText("CRM/SFA").click();
	   
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByXPath("//a[text() = 'Find Leads']").click();
	    
	    driver.findElementByXPath("//span[text() ='Phone']").click();
	    
	    driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9");
		
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        
       Thread.sleep(5000);
        
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[4]").click();
         
        driver.findElementByXPath("(//div[@class='frameSectionExtra']/a)[3]").click();
        
        
        
        
       driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
        
        driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("Hexaware Technologies");
        
        driver.findElementByXPath("//input[@id='updateLeadForm_firstName']").clear();
        
       driver.findElementByXPath("//input[@id='updateLeadForm_firstName']").sendKeys("Srivani");
        
        driver.findElementByXPath("//input[@id='updateLeadForm_lastName']").clear();
        
       driver.findElementByXPath("//input[@id='updateLeadForm_lastName']").sendKeys("Chennupati");
        
       driver.findElementByXPath("(//input[@type='submit'])[1]").click();
        
        
       
        
        
  
        
        
	}

}
