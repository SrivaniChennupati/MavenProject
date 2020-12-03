package Week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindContact {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[@type ='submit']").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Contacts").click();
		
		driver.findElementByLinkText("Find Contacts").click();
		
		driver.findElementByXPath("//span[text()='Email']").click();
		
		driver.findElementByName("emailAddress").sendKeys("Srivanichennupati@gmail.com");
		
		driver.findElementByXPath("//button[text()='Find Contacts']").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
		String text = driver.findElementById("viewContact_firstName_sp").getText();
		
		System.out.println(text);
		
		driver.findElementByXPath("(//div[@class='frameSectionExtra']/a)[1]").click();
		
		WebElement WE2 = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		
		Select Se1 = new Select (WE2);
		
		Se1.selectByValue("9000");
		
		driver.findElementByName("submitButton").click();
		
		driver.findElementByXPath("(//div[@class='frameSectionExtra']/a)[1]").click();
		
		driver.findElementById("updateContactForm_departmentName").clear();
		
	
		driver.findElementById("updateContactForm_departmentName").sendKeys("Selenium Automation Testing");
		
		driver.findElementByName("submitButton").click();
		
		String text2 = driver.findElementById("viewContact_marketingCampaigns_sp").getText();
		
		System.out.println(text2);
		
		if (text2.equals("eCommerce Site Internal Campaign"))
		{
			
			System.out.println("pass");
		}
			
		
		else 
		{
			
			System.out.println("fail");
			
			
		}
		
		
		String title = driver.getTitle();
		
		if (title.equals("View Contact | opentaps CRM"))
		{
			System.out.println("pass");
			
		}
	
		
		else
			
		{
			System.out.println("fail");
		}

	}

}
