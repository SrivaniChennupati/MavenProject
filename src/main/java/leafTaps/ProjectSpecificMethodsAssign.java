package leafTaps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethodsAssign {
	
	public static ChromeDriver driver;
	
	@Parameters({"URL" ,"UserName" ,"Password"})
	@BeforeMethod

	public void logIn(String URL ,String UserName ,String Password) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		driver.findElementById("user_name").sendKeys(UserName);
		
		driver.findElementById("user_password").sendKeys(Password);
		
		driver.findElementById("sysverb_login").click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
	    driver.findElementById("filter").sendKeys("Incident",Keys.ENTER);
		

	}

}

