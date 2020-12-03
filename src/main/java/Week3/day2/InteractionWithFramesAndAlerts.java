package Week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionWithFramesAndAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	    
	    driver.manage().window().maximize();
	    
	    //try it is inside the frame so need to enter into the frame first 
	    
	    
	    driver.switchTo().frame(1);
	    
	    driver.findElementByXPath("//button[text()='Try it']").click();
	    
	    Thread.sleep(2000);
	    
	    Alert alert = driver.switchTo().alert();
	    
	   alert.sendKeys("Srivani");
	   
	   Thread.sleep(2000);
	   
	   alert.accept();
	   
	   String text = driver.findElementById("demo").getText();
	   
	   System.out.println(text);
	   
	   driver.switchTo().defaultContent();

	}

}
