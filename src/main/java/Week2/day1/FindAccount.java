package Week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindAccount {

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
		    
		    driver.findElementByXPath("//a[text() = 'Find Accounts']").click();
		    
		    driver.findElementByXPath("//input[@type='text' and @id='ext-gen27']").sendKeys("Credit Limit Account");
		    
		    
		    driver.findElementByXPath("//button[@class='x-btn-text' and @type = 'button' and @id ='ext-gen110']").click();
		    
		    
		    

	}

}
