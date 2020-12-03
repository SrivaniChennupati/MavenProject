package Week5.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import leafTaps.ProjectSpecificMethods;

public class CreateContact  extends ProjectSpecificMethods{

	   @Test  
		public void createLead()
		{
			
			  driver.findElementByLinkText("Contacts").click();
			  
			  driver.findElementByLinkText("Create Contact").click();
			  
			  driver.findElementById("firstNameField").sendKeys("Srivani Chennupati");
			  
			  driver.findElementById("lastNameField").sendKeys("Venkateswarlu");
			  
			  driver.findElementById("createContactForm_firstNameLocal").sendKeys("Niveditha");
			  driver.findElementById("createContactForm_lastNameLocal").sendKeys("Chennupati");
			  
			  driver.findElementById("createContactForm_departmentName").sendKeys("IT ");
			  
			  driver.findElementById("createContactForm_description").sendKeys("working as a Software Engineer");
			  
			  driver.findElementById("createContactForm_primaryEmail").sendKeys("srivanichennupati@gmail.com");
			
			  
			  WebElement state = driver.findElementByName("generalStateProvinceGeoId");
			  
			  Select se = new Select(state);
			  
			  se.selectByVisibleText("New York");
			  
			  
			  
			  driver.findElementByName("submitButton").click();
			  
			 
		
		  
		
		

	}

}
