package leafTaps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ProjectSpecificMethods {
	
	
	public static ChromeDriver driver;

	@BeforeMethod
	public void login() {
		
		
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("username").sendKeys("Demosalesmanager");
			
			driver.findElementById("password").sendKeys("crmsfa");
			
			driver.findElementByXPath("//input[@type ='submit']").click();
			
			driver.findElementByLinkText("CRM/SFA").click();
			
		}
		
	//@AfterMethod
	//public void closeBrowser() {

//driver.close();

	}//
		
		
		
		
		

	
	

