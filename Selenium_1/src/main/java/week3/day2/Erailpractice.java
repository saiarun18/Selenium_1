package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Erail practice test for print the train names in the reverse order of the list

public class Erailpractice {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
        driver.findElementById("txtStationFrom").clear();
        driver.findElementById("txtStationFrom").sendKeys("ms",Keys.TAB);
        driver.findElementById("txtStationTo").clear();
        driver.findElementById("txtStationTo").sendKeys("BCT",Keys.TAB);
        
       if( driver.findElementById("chkSelectDateOnly").isSelected())
       {
    	   driver.findElementById("chkSelectDateOnly").click();
       }
        
       WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
        
       List<WebElement> rows = table.findElements(By.tagName("tr"));
       
       System.out.println(rows.size());
       
       WebElement firstrow= rows.get(0);
       List<WebElement> columns= firstrow.findElements(By.tagName("td"));
       
       System.out.println(columns.size());
       
       for(int i=rows.size()-1;i>=0;i--)
       {
    	   WebElement roweach=rows.get(i);
    	   List<WebElement> columneach= roweach.findElements(By.tagName("td"));
    	   System.out.println(columneach.get(1).getText());    
       }  
	}
}
