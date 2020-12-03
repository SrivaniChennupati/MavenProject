package Week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnListBoxes {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
        WebElement WE1 = driver.findElementById("dropdown1");
        
        Select Se = new Select (WE1);
        
        Se.selectByIndex(4);
        
        WebElement WE2 = driver.findElementByName("dropdown2");
        
        Select Se1= new Select(WE2);
        
        Se1.selectByVisibleText("UFT/QTP");
        
        WebElement WE3 = driver.findElementById("dropdown3");
        
        Select Se2= new Select (WE3);
        
        Se2.selectByValue("2");
        
        WebElement WE4 = driver.findElementByClassName("dropdown");
        		
        Select Se3 = new Select(WE4);
        
            List<WebElement> options = Se3.getOptions();
            
            int size = options.size();
            
            System.out.println(size);
            
            for (WebElement eachOption : options)
            {
            	System.out.println(eachOption.getText());
            	
            }
            
           driver.findElementByXPath("(//div[@class='example']/select)[5]").sendKeys("Selenium");
           
           
            
            
            		
            		

}
}
