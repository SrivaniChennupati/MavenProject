package week4.day1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

     Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://erail.in/");
	    
	    driver.manage().window().maximize();
	    
	    
	    
	    driver.findElementById("txtStationFrom").clear();
	    
	    driver.findElementById("txtStationTo").clear();
	    
	    driver.findElementById("txtStationFrom").sendKeys("Mgr Chennai Ctr",Keys.ENTER,Keys.TAB,Keys.TAB);
	    
	    driver.findElementById("txtStationTo").sendKeys("Ongole",Keys.ENTER);
	    
	    List<WebElement> rows = driver.findElementsByXPath("(//table[@class='DataTable TrainList TrainListHeader']//tr)");
	    
	    for (int i=0;i<=rows.size()-1;i++)
	    {
	    	
	    	String trainID = driver.findElementByXPath("(//table[@class='DataTable TrainList TrainListHeader']//td)['"+i+"']").getText();
	    	
	    	
	    	
	    }
	    
		

	}

}
