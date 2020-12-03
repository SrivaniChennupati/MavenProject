package Week5.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import leafTaps.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {

	
	@Test
	public void createLead(){
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Hexaware Technologies ");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Srivani");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Chennupati");
		
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		
		Select se = new Select(currency);
		
		se.selectByVisibleText("EUR - Euro");
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9108999874");
		
		driver.findElementByClassName("smallSubmit").click();

	}

}
