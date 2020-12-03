package Week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		// launching the browser
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe") ;
		
		ChromeDriver driver = new ChromeDriver() ; 
		
		// launching the URL
		
	    driver.get("http://leaftaps.com/opentaps");
	    
	    //maximizing the window 
		
		driver.manage().window().maximize();
		
		// giving input for username 
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		// giving the input for password
		
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(3000);
		// clicking on login
		driver.findElementByClassName("decorativeSubmit").click();
		
		// clicking on links
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Hexware Technologies");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Srivani");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Chennupati");
		
		driver.findElementByClassName("smallSubmit").click();
		
		// to get the title 
		 
		
		String title = driver.getTitle();
		
		System.out.println(title);

		// to close the browser 
		
		driver.close();
		
		
		
	
		
	}

}
