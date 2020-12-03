package Week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import leafTaps.ProjectSpecificMethods;

public class DeleteLead extends ProjectSpecificMethods {
	
	@Test
	public  void deleteLead()  throws InterruptedException {
		
		
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		
         driver.findElementByName("phoneNumber").sendKeys("9108999874");
         
         driver.findElementByLinkText("Find Leads").click();
         
         String expected = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
         
         System.out.println(expected);
         
         driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
         
         driver.findElementByLinkText("Delete").click();
         
         driver.findElementByLinkText("Find Leads").click();
        
         
         driver.findElementByXPath("//button[text()='Find Leads']").click();    
	   	

	}

}
