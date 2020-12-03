package RealTimeScenarios;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import leafTaps.ProjectSpecificMethodsAssign;

public class UpdateExistingIncident extends ProjectSpecificMethodsAssign{

	
	@Test(priority=1)
	
	public void updateExistingIncident() throws InterruptedException {
	
	    
	    driver.findElementByXPath("(//div[text()='Incidents'])[2]").click();
	    
	    Thread.sleep(4000);
	    
	    driver.switchTo().frame("gsft_main");
	    
	    Thread.sleep(5000);
	    
	    driver.findElementById("incident_table_header_search_control").sendKeys("INC0010349" ,Keys.ENTER);
	    
	    Thread.sleep(4000);
	      
	    driver.findElementByXPath("//a[@class='linked formlink']").click();
	    
	    WebElement element = driver.findElementById("incident.urgency");
	    
	    Select se = new Select(element);
	    
	    se.selectByVisibleText("1 - High");
	    
	    
	    WebElement element2 = driver.findElementById("incident.state");
	    
	    Select se1 = new Select(element2);
	    
	    se1.selectByVisibleText("In Progress");
	    
	    
	    Thread.sleep(3000);
	    
	    driver.findElementById("sysverb_update_bottom").click();
	    
		
	    
	   Thread.sleep(4000);
	    
	    WebElement table = driver.findElementById("incident_table");
	    
	    
	    List<WebElement> rows = table.findElements(By.tagName("tr"));
	    
	    System.out.println(rows.size());
	    
		/*
		 * for (int i=0;i<= rows.size()-1;i++)
		 * 
		 * {
		 * 
		 * String text = rows.get(i).getText();
		 * 
		 * System.out.println(text);
		 * 
		 * 
		 * }
		 */
   
	    Thread.sleep(5000);
	 
	    
	    String text = rows.get(2).getText();
	    
	    System.out.println(text);
	    
	    
	       WebElement roww = rows.get(2);
	       
	       
	       List<WebElement> list = roww.findElements(By.tagName("td"));
	       
	       String text2 = list.get(7).getText();
	       
	       System.out.println(text2);
	   
	    
	       if (text2.equals("In Progress"))
	    		   
	    		   
	    		   {
	    	   
	    	       System.out.println("status Updated");
	    	   
	    		   }
	    	   
	    	   
	    
	       else 
	    	   
	    	   
		   {
	   
	       System.out.println("status  not Updated");
	   
		   }
	    	   
	    
	   
	         

	    
	    
	    
	    

	}

}
