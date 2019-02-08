package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("http://leaftaps.com/opentaps/");
		//to maximize browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//click on Login
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click on link CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		//click on Leads link
		driver.findElementByXPath("//li[@class='sectionTabButtonUnselected']/div/div").click();
		
		
		//Click on merge leads
		driver.findElementByPartialLinkText("Merge Leads").click();
		
		//Click on img icon near from lead textbox
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		
		//Switch the control to new window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> ls=new ArrayList<String>();
		ls.addAll(windowHandles);
		
		driver.switchTo().window(ls.get(1));
		
		Thread.sleep(2000);
		//maximize new window
		
		//driver.manage().window().maximize();
		
		//Enter lead id
		
		driver.findElementByName("id").sendKeys("10220");
		
		
		
		//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		
		//select the first row lead id
		
		
		WebElement table = driver.findElementByXPath("//table[@class='x-grid3-row-table']");
		 List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement firstrow = rows.get(0);
		
		List<WebElement> column = firstrow.findElements(By.tagName("td"));
		String leadid = column.get(0).getText();
		
		driver.findElementByPartialLinkText(leadid).click();
		
		
		
		
		//Switch back to primary window
		driver.switchTo().window(ls.get(0));
		Thread.sleep(1000);
		
		//click on merge button
		//driver.findElementByXPath("//a[text()='Merge']").click();
		
		//handle alert
		
		//driver.switchTo().alert().accept();
		
		//click search icon next to to lead textbox
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		
		//Switch the control to new window
		Set<String> windowHandles1 = driver.getWindowHandles();
			 ls=new ArrayList<String>();
				ls.addAll(windowHandles1);
				System.out.println(ls.size());
				driver.switchTo().window(ls.get(1));
				
				Thread.sleep(2000);
				//maximize new window
				
				//driver.manage().window().maximize();
				
				//Enter lead id
				
				driver.findElementByName("id").clear();
				driver.findElementByName("id").sendKeys("10221");
				
				
				
				//Click find leads button
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				Thread.sleep(3000);
				
				//select the first row lead id
				
				
				 table = driver.findElementByXPath("//table[@class='x-grid3-row-table']");
				 rows = table.findElements(By.tagName("tr"));
				 firstrow = rows.get(0);
				
				 column = firstrow.findElements(By.tagName("td"));
				 leadid = column.get(0).getText();
				
				driver.findElementByPartialLinkText(leadid).click();
				
				//Switch back to primary window
				driver.switchTo().window(ls.get(0));
				Thread.sleep(1000);
		
				//click on merge button
				driver.findElementByXPath("//a[@class='buttonDangerous']").click();
				
				//switch to alert and accept
				driver.switchTo().alert().accept();
				
				//click on find leads
				driver.findElementByPartialLinkText("Find Leads").click();
				
				//enter value in lead id text box
				
				driver.findElementByName("id").sendKeys("10220");
				
				//click on find leads button
				driver.findElementByXPath("(//td[@class='x-panel-btn-td'])[6]").click();
				
				//Verify that , there is no record displayed in table

	}
}

