package Week3.day2;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContacts {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        driver.findElementById("username").sendKeys("Demosalesmanager");
	    
	    driver.findElementById("password").sendKeys("crmsfa");
	    
	    driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	    
	    driver.findElementByLinkText("CRM/SFA").click();
	    
	    driver.findElementByLinkText("Contacts").click();
	    
	   driver.findElementByLinkText("Merge Contacts").click();
	   
	   //clicking on widget of from contact
	   
	    driver.findElementByXPath("(//input[@id='partyIdFrom']/following::img)[1]").click();
	    
	    
	     // Clicking on  First Resulting Contact
	     Set<String> windowHandles = driver.getWindowHandles();
	     
	     ArrayList <String> ar = new ArrayList<String>();
	     
	     ar.addAll(windowHandles);
	     
	     
	     
	     driver.switchTo().window(ar.get(1));
	     
	     driver.findElementByLinkText("DemoCustomer").click();
	     
	     
	     // clicking on widget of Tocontact
	     
        
	     
	     driver.switchTo().window(ar.get(0));
	     
	     driver.findElementByXPath("(//input[@id='partyIdTo']/following::img)[1]").click();
	     
	     
	  // Clicking on  2nd  Resulting Contact
	    
	    Set<String> windowHandles2 = driver.getWindowHandles();
	    
	    ArrayList<String> ar1 = new ArrayList<String>();
	    
	    ar1.addAll(windowHandles2);
	     
	     driver.switchTo().window(ar1.get(1));
	  
	  driver.findElementByLinkText("DemoPrivilegedCust").click();
	  
	  
	   driver.switchTo().window(ar1.get(0));
	     
	     driver.findElementByLinkText("Merge").click();
	     
	    Alert alert = driver.switchTo().alert();
	     
	     String text = alert.getText();
	     
	    System.out.println(text);
	    
	    Thread.sleep(3000);
	     
	     alert.accept();
	     
	    
	    
	    
	    
	    
	    
	    
		
		

	}

}
