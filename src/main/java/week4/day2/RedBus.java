package week4.day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
	
			
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.redbus.in/");
		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("src").sendKeys("chennai",Keys.ENTER);
			
			driver.findElementById("dest").sendKeys("Bangalore Airport, Bangalore",Keys.ENTER);
			
			driver.findElementByXPath("//label[text()='Onward Date']").click();
			
		   Date date = new Date();		   
		   DateFormat sdf = new SimpleDateFormat("dd");		   
		   String today = sdf.format(date);
		   
		   // find the xpath for 15th in the table and replace 15 th with today so that it can work on any day
		   
		   
			     
		  driver.findElementByXPath("(//td[text()='"+today+"'])[2]").click();
		  
		  Thread.sleep(4000);
		  
		  driver.findElementById("search_btn").click();
		  
		       
		  
		  
		 
		  
		  
		  
		  
		  
		  
		  
		  
		   
			  
			 
			  
			  
			  
			   
			  
		
			   
		  
		    
		    
			      
			     
			
			
			
		
		
		
		
		
			
			
		
		

	}

}
