package Week3.day1;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebTable {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://erail.in/");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElementById("txtStationFrom").clear();
	    
	    driver.findElementById("txtStationFrom").sendKeys("Mgr Chennai Ctr",Keys.ENTER,Keys.TAB);
	    
	    driver.findElementById("txtStationTo").clear();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.findElementById("txtStationTo").sendKeys("Ongole",Keys.ENTER,Keys.TAB);
	    
	    // first we need to find the table 
	    
	    WebElement Table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
	    
	    // i need to find the rows
	    
	    List<WebElement> rows = Table.findElements(By.tagName("tr"));
	    
	    int size = rows.size();
	    
	   System.out.println(size);
	   
	   // i need to find the coloumns
	   
	    List<WebElement> Coloumns = Table.findElements(By.tagName("td"));
	    
	    int size2 = Coloumns.size();
	    
	    
	    System.out.println(size2);
	    
	    // i need to print all the rows 
	    
	   WebElement row1 = rows.get(0);
	   System.out.println(row1);
	   
	   for (int i=0;i< rows.size();i++)
	   {
		   
		   WebElement AlltheRows = rows.get(i);
		   
		   List<WebElement> AlltheColoumns = AlltheRows.findElements(By.tagName("td"));
		   
		   System.out.println(AlltheColoumns.get(1).getText());
		   
	   }
	   
	    
	}
}
	    	
	    	
	    
	    
	   
	    
	    
	   
		
	  
		





