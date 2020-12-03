package RealTimeScenarios;



import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import leafTaps.ProjectSpecificMethodsAssign;

public class DeleteIncident extends ProjectSpecificMethodsAssign {

	@Test(priority =4 )
	
	public void deleteIncident() throws InterruptedException {
		
	    
	    Thread.sleep(2000);
	    
         driver.findElementByXPath("(//div[text()='Incidents'])[2]").click();
	   
	    
	    driver.switchTo().frame("gsft_main");
	    
	     driver.findElementById("incident_table_header_search_control").sendKeys("INC0010706",Keys.ENTER);
		   
	     driver.findElementByXPath("//a[@class='linked formlink']").click();
	     
	     driver.findElementById("sysverb_delete").click();
	     
	     driver.findElementById("ok_button").click();

	    
	     
	    

	}

}
