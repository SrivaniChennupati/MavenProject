package Week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class BondWithButtons {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.manage().window().maximize();
		
		driver.findElementById("home").click();
		
		String cssValue = driver.findElementById("color").getCssValue("background-color");
		
		System.out.println(cssValue);
		
		String cssValue2 = driver.findElementById("size").getCssValue("height");
		
		System.out.println(cssValue2);
		
		String cssValue3 = driver.findElementById("size").getCssValue("width");
		
		System.out.println(cssValue3);
		
		
		String cssValue4 = driver.findElementById("position").getCssValue("left");
		
		System.out.println(cssValue4);
		
		
	String cssValue5 = driver.findElementById("position").getCssValue("top");
	
	System.out.println(cssValue5);
		
	}

}
