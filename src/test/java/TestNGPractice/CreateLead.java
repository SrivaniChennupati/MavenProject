package TestNGPractice;




import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestNGSuperClass.ProjectSpecificMethods;



public class CreateLead extends ProjectSpecificMethods {

	
    @BeforeTest
	
	public void setData()
	
	{
		
		excelName = "TC001_CreateLead (2)" ;
		
	}
	
	
	
	
	
	
	
	@Test(dataProvider = "getData")
	
	public void createLead(String CNAME ,String FNAME,String LNAME) {
		
		
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(CNAME);
		driver.findElementById("createLeadForm_firstName").sendKeys(FNAME);
		driver.findElementById("createLeadForm_lastName").sendKeys(LNAME);
		driver.findElementByName("submitButton").click();
	

	}

}
