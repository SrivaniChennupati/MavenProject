package Week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithHyperLink {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		//driver.findElementByLinkText("Go to Home Page").click();
		
		//driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
		
		//driver.findElementByLinkText("Verify am I broken?").click();
		
		List<WebElement> name = driver.findElementsByTagName("a"); // some links will ne visible and some links will be hidden
		
		System.out.println(name);
		
		int size = name.size();
		
		
		System.out.println(size);
		
		
		// if we want to find the no of input boxes , we shold give "input " as tagname becuase all the test boxes starts with input tag
		
		List<WebElement> name2 = driver.findElementsByTagName("input");
		
		int size2 = name2.size();
		
		System.out.println(size2);
		
		
		//  if we want to find the no of radio buttons  , we shold give "button " as tagname becuase most of the times button starts with tagname as "buttons"
		
          
		// get the text of each link available on the page
		
		 for (WebElement eachName : name)
		 {
			 
			 System.out.println(eachName.getText());
		 }
		
		
	
		

	}

}
