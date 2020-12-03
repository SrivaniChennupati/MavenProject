package Week3.day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionWithWindows {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
		    ChromeDriver driver = new ChromeDriver();
		    
		    // need to land in 1st window 
		    
		    driver.get("http://www.leafground.com/"); 
		    
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    

		    
		    driver.findElementByXPath("//img[@alt='Windows']").click();
		    
		    Thread.sleep(3000);
		    
		   driver.findElementById("home").click();
		   
		   // window handling 
		    
		    Set<String> windowSet = driver.getWindowHandles();
		    
		    System.out.print(windowSet);
		    
		    ArrayList<String> windowList =  new ArrayList<String>();
		    
		    windowList.addAll(windowSet); 
		
		    driver.switchTo().window(windowList.get(1));
		    
		    String title = driver.getTitle();
		    
		    System.out.println(title);
		    
		   String currentUrl = driver.getCurrentUrl();
		    
		    System.out.println(currentUrl);
		    
		    
		    
		    driver.switchTo().window(windowList.get(0));
		    
		    driver.close();
		   
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    

	}

}
