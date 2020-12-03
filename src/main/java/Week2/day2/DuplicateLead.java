package Week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[@type ='submit']").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//span[text()='Email']").click();
		
		driver.findElementByName("emailAddress").sendKeys("Srivanichennupati@gmail.com");
		
		
		
		WebElement WE1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]");
		
		System.out.println(WE1);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
		
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		
		      String title = driver.getTitle();
		      
		      if (title.equals("Duplicate Lead | opentaps CRM"))
		    	  
		      {
		    	  
		    	  System.out.println("pass");
		      }
		
		      else
		    	  
		      {
		    	  
		    	  System.out.println("fail");
		      }
		
		
		  String S = driver.findElementByName("firstName").getAttribute("ppp");
		  
		  
		  System.out.println(S);
		   
		   
		   if ( WE1.equals(S))
		   
		   {
		    	  
		    	 System.out.println("pass");
		      }
		
		      else
		    	  
		      {
		    	  
		    	  System.out.println("fail");
		     }  
			   
		   
		   
		   
		
	}
	}

