package Week2.day2;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http:leafground.com");
		
		driver.manage().window().maximize();

		 driver.findElementByXPath("//img[@alt='drop']").click();
		 
		 WebElement DraggableElement = driver.findElementByXPath("//div[@id='draggable']");
		
		 
		 WebElement DroppableElement = driver.findElementByXPath("//div[@id='droppable']");
		 
		 
		 Actions builder = new Actions(driver);
		 
		builder.dragAndDrop(DraggableElement,DroppableElement).perform();
		
		
		
		
		
	    
		
				
				
		
		
		

	}

}
