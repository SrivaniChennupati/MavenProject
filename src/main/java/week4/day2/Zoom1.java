package week4.day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.zoomcar.com/chennai/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Start your wonderful journey").click();
		
		Thread.sleep(4000);
		
		driver.findElementByXPath("(//div[@class='items'])[1]").click();
		
		driver.findElementByXPath("//button[text()='Next']").click();
		
		Date date = new Date();
		
		DateFormat sdf = new SimpleDateFormat("dd");
		
		String today = sdf.format(date);
		
		int tomorrow = Integer.parseInt(today)+1;
		
		System.out.println(tomorrow);
		
		Thread.sleep(7000);
		
		driver.findElementByXPath("(//div[@class='days']/div)[2]").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//button[text()='Next']").click();
		
		driver.findElementByXPath("//button[text()='Done']").click();
		
		
		
		
		
		
		
		

	}

}
