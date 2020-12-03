package Week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithCheckBoxes {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.manage().window().maximize();
		
		// Select the languages that you know?
		// i used to younger cousin Xpath Syntax
		
		driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following::input)[1]").click();
		
		driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following::input)[3]").click();
		
       // Confirm Selenium is checked
		
		
		boolean b = driver.findElementByXPath("(//label[text()='Confirm Selenium is checked']/following::input)[1]").isSelected();
		
		System.out.println(b);
	
		driver.findElementByXPath("(//label[text()='Confirm Selenium is checked']/following::input)[1]").click();
		
		// DeSelect only checked
		
	//first identify the 2 elements (i mean 2 xh3ck boxes and then apply isSelected()
		
		boolean c = driver.findElementByXPath("(//label[text()='DeSelect only checked']/following::input)[1]").isSelected();
		
		System.out.println(c);
		
boolean d = driver.findElementByXPath("(//label[text()='DeSelect only checked']/following::input)[2]").isSelected();
		
		System.out.println(d);
		
		
		// so second check box is selected 
		
		if (c==true)
		{
			
			driver.findElementByXPath("(//label[text()='DeSelect only checked']/following::input)[1]").click();
		}
		
		if (d==true)
		{
			
			driver.findElementByXPath("(//label[text()='DeSelect only checked']/following::input)[2]").click();
		}
		
	}

}
