package week4.day1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

	public static void main(String[] args) {
	

	


        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
       Map<String,String> map = new LinkedHashMap<String,String>();

       ChromeDriver driver = new ChromeDriver();

       driver.get("https://erail.in/");

      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

     driver.findElementById("txtStationFrom").clear();

        driver.findElementById("txtStationTo").clear();

      driver.findElementById("txtStationFrom").sendKeys("Mgr Chennai Ctr",Keys.ENTER,Keys.TAB,Keys.TAB);

      driver.findElementById("txtStationTo").sendKeys("Ongole",Keys.ENTER);

//find the table 

     WebElement webElement = driver.findElementById("divMainWrapper");

// find no of rows


      List<WebElement> rows = webElement.findElements(By.tagName("tr"));


     for (int i=0;i<rows.size();i++)
   {

        WebElement element = rows.get(i);

        List<WebElement> Coloumns = element.findElements(By.tagName("td"));

              String text = Coloumns.get(0).getText();

            String text2 = Coloumns.get(1).getText();
            
            //System.out.println(text);
            
           // System.out.println(text2);


             map.put(text, text2);
             
             





             for (Entry<String, String> eachEntry : map.entrySet()) {


          System.out.println(eachEntry.getKey() + "........> " + eachEntry.getValue());

}



}





}
}


