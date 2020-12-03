package Week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import leafTaps.ProjectSpecificMethods;

      public class CreateContact extends ProjectSpecificMethods 
      
      {
    	 
	@Test
	public  void createContact() 
	{
		
		driver.findElementByLinkText("Contacts").click();
		
		driver.findElementByLinkText("Create Contact").click();
		
		driver.findElementById("firstNameField").sendKeys("srivani");
		
		driver.findElementById("lastNameField").sendKeys("Chennupati");
		
		driver.findElementByXPath("//input[@id ='createContactForm_departmentName']").sendKeys("Computer Science");
	
         driver.findElementByXPath("//textarea[@id='createContactForm_description']").sendKeys("Computer Science");
         
         
         driver.findElementById("createContactForm_primaryEmail").sendKeys("Srivanichennupati@gmail.com");
         
         
         WebElement WE1 = driver.findElementById("createContactForm_generalStateProvinceGeoId");
         
         Select Se = new Select (WE1);
         
         Se.selectByVisibleText("New York");
         
         driver.findElementByXPath("//input[@type ='submit']").click();
         
         driver.findElementByXPath("(//div[@class='frameSectionExtra']/a)[1]").click();
         
        driver.findElementById("updateContactForm_description").clear();
         
         driver.findElementById("updateContactForm_importantNote").sendKeys("Selenium Automation Tester");
         
         driver.findElementByXPath("//input[@name='submitButton']").click();
         
         
	}      
         
      }

      
