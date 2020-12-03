package Week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http:leafground.com");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//img[@alt='mouseover']").click();
		
		WebElement MouseHover = driver.findElementByXPath("//a[text()='TestLeaf Courses']");
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(MouseHover).perform();
		
		driver.findElementByXPath("//a[text()='Selenium']").click();

	}

}
