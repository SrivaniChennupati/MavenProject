package Week5.day1;

import org.testng.annotations.Test;

import leafTaps.ProjectSpecificMethods;

public class FindLead extends ProjectSpecificMethods{

	@Test
	public void findLead() {
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner']/span)[2]").click();
		
		
		driver.findElementByName("phoneNumber").sendKeys("9108999874");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		

	}

}
