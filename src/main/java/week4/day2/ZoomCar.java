package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
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
		
		List<WebElement> nameList = driver.findElementsByXPath("//div[@class='details']/h3");
		
		System.out.println(nameList.size());
		
		//highest priced car ride 
		
		List<WebElement> Pricelist = driver.findElementsByXPath("//div[@class='price']");
		List <Integer> list = new ArrayList<Integer>();
		
		
		// get the price list by using pricelist.get(i).getText() (return type is text) - its printing with specail character
		
		//  remove all the special characters using replaceall (return type - text)
		
		//   convert string to integer to find max price 
		// added to list by creating list 
		
		for (int i=0;i<=Pricelist.size()-1;i++) {		
			
			list.add(Integer.parseInt(Pricelist.get(i).getText().replaceAll("\\D", "")));	
			
		}
		
		// use collections to get the max value anad it stored as integer
		Integer max = Collections.max(list);
		
		System.out.println(max);
		
		
		//now convert 
		
		String x = max.toString().substring(1);
		
		String text = driver.findElementByXPath("//div[contains(text(),'"+x+"')]/preceding::h3[1]").getText();
		
		System.out.println(text);
		
		
		
		driver.findElementByXPath("//div[contains(text(),'x')]/following-sibling::button");
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
