package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.zoomcar.com/chennai/");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//a[@class='search']").click();
		
driver.findElementByXPath("(//div[@class='component-popular-locations']/div)[2]").click();
		
		driver.findElementByXPath("//button[text()='Next']").click();
		
		driver.findElementByXPath("(//div[@class='days']/div)[2]").click();
		
		driver.findElementByXPath("//button[text()='Next']").click();
		
		driver.findElementByXPath("//button[text()='Done']").click();
		
		Thread.sleep(3000);
		
		 List<WebElement> list = driver.findElementsByXPath("//div[@class='price']");
		 
	     
	System.out.println(list.size());
	
	
	for (int i=0;i<=list.size()-1;i++)
	{
		
		String price = list.get(i).getText().replaceAll("\\D", "");
		
		int Price1 = Integer.parseInt(price);
		
		List<WebElement> carname = driver.findElementsByXPath("(//div[@class='details']/h3)['"+i+"']");
		
		String carname1 = carname.get(i).getText();
		
		map.put(carname1,Price1 );
		
		
		
	}
	

	
	for (Entry<String,Integer> eachEntry : map.entrySet()) {
		
		
		
		
		System.out.println(eachEntry.getKey() + ".....>" +  eachEntry.getValue());
		
	}
	
	}
}
	
// my understanding is first i need find one element to get the total list in the sceario 

// with respect to that i need to write for loop 
// then here we need to print car names with price , so i found one car name and store as web elements , fouund price and store it as webelemets 



	
