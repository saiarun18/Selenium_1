package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erailpractice2 {
	
	public static void main(String[] args) {
		
		List<WebElement> rows;
		List<WebElement> defaultcolumns = null;
		List<WebElement> sortedrows;
		List<WebElement> sortedcolumns = null;
		ArrayList<String> columnlist = null;
		ArrayList<String> sortedcolumnlist = null;
		
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
        
       rows = table.findElements(By.tagName("tr"));
       columnlist =new ArrayList<>();
        for (int i = 0; i < rows.size(); i++) {
		WebElement eachrow = rows.get(i);
		defaultcolumns = eachrow.findElements(By.tagName("td"));
		columnlist.add(defaultcolumns.get(1).getText());		
				
        }
		System.out.println(columnlist);
		
		
       
       table.findElement(By.xpath("//a[text()='Train Name']")).click();
       WebElement table1 = driver.findElementByXPath("//table[@class='DataTable TrainList']");
       sortedrows = table1.findElements(By.tagName("tr"));
       sortedcolumnlist =new ArrayList<>();
       for (int j = 0; j < rows.size(); j++) {
   		WebElement eachsortedrow = sortedrows.get(j);
   	    sortedcolumns = eachsortedrow.findElements(By.tagName("td"));  		
   	    sortedcolumnlist.add(sortedcolumns.get(1).getText());
   	}
       System.out.println(sortedcolumnlist);
       
       System.out.println(columnlist.equals(sortedcolumnlist));
	}	
}
