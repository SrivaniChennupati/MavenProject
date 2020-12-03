package Week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithRadioButtons {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.manage().window().maximize();
		
		// Are you enjoying the classes?
		
	driver.findElementById("yes").click();
	
	//Find default selected radio button 
	
	//Select your age group (Only if choice wasn't selected)
	
	// here i used parent to grand child X-path Syntax.
	
	driver.findElementByXPath("(//div [@class='large-6 small-12 columns']//input)[6]").click();
	
	
		
		
		

	}

}
