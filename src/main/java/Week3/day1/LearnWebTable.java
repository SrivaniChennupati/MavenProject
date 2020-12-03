package Week3.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://erail.in/");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElementById("txtStationFrom").clear();
	    
	    driver.findElementById("txtStationTo").clear();
	    
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    
	    driver.findElementById("txtStationFrom").sendKeys("Mgr Chennai Ctr",Keys.ENTER,Keys.TAB,Keys.TAB);
	    
	    driver.findElementById("txtStationTo").sendKeys("Ongole",Keys.ENTER);
	    
	    driver.findElementById("buttonFromTo").click();
	    
	    WebElement element = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
	    
	    List<WebElement> elements1 = element.findElements(By.tagName("tr"));
	    
	  
	    int size = elements1.size();
	    
	    System.out.println(size);
	    
	    WebElement element2 = elements1.get(0);
	    
	    System.out.println(element2.getText());
	    
	   for (int i=0;i<=elements1.size()-1;i++)
	   {
	    	
		  System.out.println(elements1.get(i).getText()); 
	    	
	    	
	    	
	    }
	   
	   
	   for (int i=0;i<=elements1.size()-1;i++)
		   
		   
		   
	   {
		   WebElement element3 = elements1.get(i);
		   
		   List<WebElement> element4 = element3.findElements(By.tagName("td"));
		   
		   
		   System.out.println(element4.get(1).getText());
		   
		   
	   }
	    
	    
		

	}
}

