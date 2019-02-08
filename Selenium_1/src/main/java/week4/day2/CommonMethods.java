package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CommonMethods {

	
	private List<WebElement> options;





	public void allMethods() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Select drop down method
		WebElement ele=driver.findElementById("");
		Select sl=new Select(ele);
		sl.selectByVisibleText("text");	
		sl.selectByIndex(0);
		sl.selectByValue("text");

		//to get the count of the options tag
		List<WebElement> dropdownlist = sl.getOptions();
		dropdownlist.size();
	
		//all verifications
		//read the text from the particular element
		String text = driver.findElementById("").getText();
		String currentUrl = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		//Checkbox is enabled or not
		
		driver.findElementById("").isSelected();
		
		//Switch to windows
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> allwindows = new ArrayList<>();
		allwindows.addAll(windowHandles);
		driver.switchTo().window(allwindows.get(1));
		
		//Takescreenshot
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(""));
		
		//Switch To Alert
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("");
		
		//Switch To frames
		//switch to Frames by 1. framenameorid 2.index 3. frameelement
		
		WebDriver frame = driver.switchTo().frame("framename");
		
	    WebElement frameele = driver.findElementById("");
	    driver.switchTo().frame(frameele);
	    
	    //Switch to parent frame -> return back to default parentframe
	    driver.switchTo().defaultContent();
	    
	    //Switch to the parentframe in the nested frames 
	    driver.switchTo().parentFrame();
	    
		//Webtable -> fetch the text of the 4th row and 3 column
	    
	    WebElement table = driver.findElementByTagName("table");
	   List<WebElement> rows=table.findElements(By.xpath(""));
	   List<WebElement> columns = rows.get(3).findElements(By.tagName("td"));
	   System.out.println(columns.get(2).getText());

	   //Waits
	   
	  Thread.sleep(3000);
	  //Implicitly wait
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   //Explicit wait
	   WebDriverWait wait = new WebDriverWait(driver, 30);
	   WebElement ele1=driver.findElementById("");
	   wait.until(ExpectedConditions.elementToBeClickable(ele));
	  
	   
	   
	   
	   
	   
	   
	   
	}
	
	
	
	
	
	public static void main(String[] args) throws Throwable {
		
		CommonMethods cm=new CommonMethods();
		cm.allMethods();

	}

}
