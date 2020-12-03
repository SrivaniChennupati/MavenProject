package TestNGSuperClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import readExcel.readExcel1;



public class ProjectSpecificMethods {
	
	
	public static ChromeDriver driver;
   public String excelName;

	@Parameters({"URL" ,"UNAME" ,"PWD" })
	
	@BeforeMethod
	
	
	public void logIn(String URL, String UNAME ,String PWD) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers1/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(UNAME);
		driver.findElementById("password").sendKeys(PWD);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	
	
	@DataProvider
	
	public String[][] getData() throws IOException
	
	{
		
	   readExcel1 data = new readExcel1();
	   
	  return data.ReadExcel(excelName);
	  
	  String[][] data = new String[][]''
	   
	   
		
		 
		
		
	}
	

}
