package Week5.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;



import leafTaps.ProjectSpecificMethodsParameterization;

public class StaticParameterization extends ProjectSpecificMethodsParameterization {
	
	

	@Test(dataProvider = "getData" )
	
	public void createLead(String cNmae , String Fname , String Lname, String Phoneno) {
	
		
        driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys(cNmae);
		
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
		
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
		
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		
		Select se = new Select(currency);
		
		se.selectByVisibleText("EUR - Euro");
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(Phoneno);
		
		driver.findElementByClassName("smallSubmit").click();

	}

	}


