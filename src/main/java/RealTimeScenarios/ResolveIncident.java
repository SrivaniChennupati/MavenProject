package RealTimeScenarios;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import leafTaps.ProjectSpecificMethodsAssign;

public class ResolveIncident extends ProjectSpecificMethodsAssign {

	
	
	@Test(priority = 3)
	public void resolveIncident() throws InterruptedException {
	

	    Thread.sleep(2000);
	    
	    driver.findElementByXPath("(//div[text()='Incidents'])[2]").click();
	   
	    
	    driver.switchTo().frame("gsft_main");
	    
	   driver.findElementById("incident_table_header_search_control").sendKeys("INC0010349",Keys.ENTER);
	   
	   Thread.sleep(3000);
	   
	   driver.findElementByXPath("//a[@class='linked formlink']").click();
	    
	  
	   
	   Thread.sleep(7000);
	   
	   WebElement state = driver.findElementById("incident.state");
	   
	   Select se = new Select(state);
	   
	   se.selectByVisibleText("Resolved");
	   
	   Thread.sleep(7000);
	   
	   
	   
	   driver.findElementByXPath("//span[text()='Resolution Information']").click();
	   
       WebElement code = driver.findElementById("incident.close_code");
	   
	   Select Se = new Select (code);
	   
	  
	   
	   Se.selectByVisibleText("Solved (Work Around)");
	   
	   
	   
	   driver.findElementById("incident.close_notes").sendKeys("srivani Automation Tester");
	   
	   driver.findElementById("resolve_incident").click();
	   
      WebElement table = driver.findElementById("incident_table");
	   
	   List<WebElement> rows = table.findElements(By.tagName("tr"));
	   
	   WebElement rows1 = rows.get(2);
	   
	   List<WebElement> col = rows1.findElements(By.tagName("td"));
	   
	   String text = col.get(7).getText();
	   
	   System.out.println(text);
	   
      
	   
	   
	   
	   
	   
	   
		
		

	}

}
