package week4.day2;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobile",Keys.ENTER);
		
		WebElement price = driver.findElementByXPath("//span[@class='a-price-whole']");
		
		System.out.println(price.getText());
		
		driver.findElementByXPath("//span[@class='a-size-medium a-color-base a-text-normal'][1]").click();
		
		//switch to new window
		
		
		Set<String> win = driver.getWindowHandles();
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.addAll(win);
		
		driver.switchTo().window(ar.get(1));
		
		String ReviewRatings = driver.findElementById("acrCustomerReviewText").getText();
		
		System.out.println(ReviewRatings);
		
		
		driver.findElementById("add-to-cart-button").click();
		
		
		
		
		
	//String text = driver.findElementByXPath("(//h4[text()='Added to Cart'])[1]").getText();//
	
	
	driver.findElementByXPath("//span[@id='attach-sidesheet-checkout-button']").click();
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	if (title.equals("Amazon Sign In"))
		
	{
		
		System.out.println("true");
		
	}
		
	else
		
	{
		System.out.println("false");
		
		
	}
	
	driver.findElementById("continue").click();
	
	   String text = driver.findElementByXPath("(//div[@class='a-box-inner a-alert-container']/div)[2]").getText();
	
	if (text.equals("Enter your email or mobile phone number"))
		
	{
		
		System.out.println("enter email");
	}
	else
	{
		
		System.out.println("enter ");
	}
	
	
	driver.close();
  
	}

}
