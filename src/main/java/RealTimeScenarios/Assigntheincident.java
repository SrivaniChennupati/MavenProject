package RealTimeScenarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import leafTaps.ProjectSpecificMethodsAssign;

public class Assigntheincident extends ProjectSpecificMethodsAssign{

	@Test(priority = 2)
	public void assigntheincident() throws InterruptedException {
		
	    
	    Thread.sleep(2000);
	    
	    driver.findElementByXPath("(//div[text()='Incidents'])[2]").click();
	   
	    
	    driver.switchTo().frame("gsft_main");
	    
	    driver.findElementById("incident_table_header_search_control").sendKeys("INC0010349",Keys.ENTER);
	   
	    Thread.sleep(3000);
	   
	    driver.findElementByXPath("//a[@class='linked formlink']").click();
	    
	  
	   
	     Thread.sleep(7000);
	    
	     driver.findElementById("lookup.incident.assignment_group").click();
	   
		
		  Set<String> set = driver.getWindowHandles();
		  
		  ArrayList <String>ar = new ArrayList<String>();
		  
		  ar.addAll(set);
		  
		  driver.switchTo().window(ar.get(1));
		  
		  driver.findElementById("sys_user_group_table_header_search_control").sendKeys("Software",Keys.ENTER);
		  
		  driver.findElementByLinkText("Software").click();
		  
		  driver.switchTo().window(ar.get(0));
		  
		  driver.switchTo().frame("gsft_main");
		  
		  Thread.sleep(4000);
		  
		  
		  
		  driver.findElementById("activity-stream-textarea").sendKeys("Srivani Selenium Tester");
		  
		  driver.findElementById("sysverb_update").click();
		 
	  
	    WebElement table = driver.findElementById("incident_table");
	   
	   List<WebElement> rows = table.findElements(By.tagName("tr"));
	   
	   WebElement rows1 = rows.get(2);
	   
	   List<WebElement> col = rows1.findElements(By.tagName("td"));
	   
	   String text = col.get(9).getText();
	   
	   System.out.println(text);
	   
       String text1 = col.get(10).getText();
	   
	   System.out.println(text1);
	      
		

	}

}
