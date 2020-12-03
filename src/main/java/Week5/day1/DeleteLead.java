package Week5.day1;

import org.testng.annotations.Test;

import leafTaps.ProjectSpecificMethods;

public class DeleteLead  extends ProjectSpecificMethods{
 
	@Test
	public void deleteLead() throws InterruptedException {
		
		
driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner']/span)[2]").click();
		
		
		driver.findElementByName("phoneNumber").sendKeys("9108999874");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		driver.findElementByLinkText("Delete").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
        driver.findElementByXPath("(//span[@class='x-tab-strip-inner']/span)[2]").click();
		
		
		driver.findElementByName("phoneNumber").sendKeys("9108999874");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		
		
	
		

	}

}
