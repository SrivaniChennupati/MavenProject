package RealTimeScenarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import leafTaps.ProjectSpecificMethodsAssign;


public class CreateNewIncident extends ProjectSpecificMethodsAssign {

	
    @Test
	public void createNewIncident() throws InterruptedException {
		
		
        Thread.sleep(4000);
	    
        driver.findElementByXPath("(//div[text()='Create New'])[1]").click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("gsft_main");
		
		String text = driver.findElementById("incident.number").getAttribute("value");
		
		Thread.sleep(7000);
		
		driver.findElementByXPath("(//span[@class='input-group-btn'])[1]").click();
		 
		
		  Set<String> Set = driver.getWindowHandles();
		  
		  ArrayList<String> ar = new ArrayList<String>();
		  
		  ar.addAll(Set);
		  
		  System.out.println(ar);
		  
		
		  driver.switchTo().window(ar.get(1));
		  
		  Thread.sleep(7000);
		  
		  driver.findElementByXPath("(//div[@class='input-group-transparent']/input)[1]").sendKeys("andrew",Keys.ENTER);
		  
		 Thread.sleep(7000);
		  
		  driver.findElementByLinkText("Andrew Jackson").click();
		  
		  driver.switchTo().window(ar.get(0));
		  
		  driver.switchTo().frame("gsft_main");
		  
		  driver.findElementById("incident.short_description").sendKeys("I am Selenium Tester");
		  
		  Thread.sleep(3000);
		  
		  driver.findElementById("sysverb_insert").click();
		  
		  
		  driver.findElementByXPath("(//input[@placeholder='Search'])[5]").sendKeys("Andrew jackson",Keys.ENTER);
		  
		  Thread.sleep(10000);
		  
		
		/*
		 * WebElement ele = driver.findElementByLinkText("Number");
		 * 
		 * Actions builder = new Actions(driver);
		 * 
		 * builder.doubleClick(ele).perform();
		 */
		  
		  
		  	Thread.sleep(7000);
		 
		  
		  WebElement table = driver.findElementById("incident_table");
		  
		  
		  List<WebElement> rows = table.findElements(By.tagName("tr"));
		  
		  System.out.println(rows.get(2).getText());
		  
		  WebElement roww = rows.get(2);
		  
		  List<WebElement> list2 = roww.findElements(By.tagName("td"));
		  
		  String text1 = list2.get(2).getText();
		  
		  System.out.println(text);
		  
		  if (text.equals(text1))
		  
		  {
			  
			  System.out.println("Incident Created Successfully");
		  }
		  
		  
		 
		  else 
		  {
			  
			  System.out.println("Incident didnt Created Successfully");
			  
		  }
			  
		  
		  
		  
		  
			 
		/*
		 * if (text!= "No records to display ") {
		 * 
		 * System.out.println("Incident Created Successfully");
		 * 
		 * }
		 * 
		 * 
		 * else
		 * 
		 * { System.out.println("Incident not Created Successfully");
		 * 
		 * } }
		 */
		  
		  
	
		  
		  
		  
		 
	
		
		
		
		
	   
      
	   
	   
	   
	   
	   
	   
		
		

	}

}
