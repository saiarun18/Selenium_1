package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeads {

public static void main(String[] args) throws InterruptedException {
		
		//Download driver.exe from seleniumhq.org and mention the path here	
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeDriver driver =new ChromeDriver();
				
				//load url
				driver.get("http://leaftaps.com/opentaps/");
				//to maximize browser
				driver.manage().window().maximize();
				//Enter username
				driver.findElementById("username").sendKeys("DemoSalesManager");
				//Enter password
				driver.findElementById("password").sendKeys("crmsfa");
				
				//click on Login
				driver.findElementByClassName("decorativeSubmit").click();
				
				//Click on link CRM/SFA
				driver.findElementByLinkText("CRM/SFA").click();
				
				//click on create leads link
				//Click on create leads
						driver.findElementByLinkText("Create Lead").click();
				
				//Click on find leads
				
				driver.findElementByXPath("//a[text()='Find Leads']").click();
				
				
				
				
				//Move to tab Email
				driver.findElementByXPath("(//a[@class='x-tab-right'])[3]").click();
				
				//Enter email address
				driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("nishanthirbk@gmail.com");
				
				
				
			
				
				//Click on Find leads
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				Thread.sleep(1000);
				
				//Select the table
				WebElement LeadsTable = driver.findElementByXPath("//table[@class='x-grid3-row-table']");
			    List<WebElement> rows = LeadsTable.findElements(By.tagName("tr"));
			    List<WebElement> columns;
			    
			    //get the first row
			    
			    WebElement firstrow=rows.get(0);
			    columns=firstrow.findElements(By.tagName("td"));
			    
			    
			    String Leadid= columns.get(0).getText();
			    
			    System.out.println("Lead id :"+Leadid);
			    
			    //Click on the first entry in the table
			   
			   driver.findElementByPartialLinkText(Leadid).click();
			    Thread.sleep(3000);
			    
			    //Click on Duplicate lead 
			    
			    driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
			    Thread.sleep(2000);
			    
			    String Title=driver.getTitle();
			    if(Title.contains("Duplicate Lead"))
			    	System.out.println("Verifed the titel of the page :  "+Title);
			    else
			    	System.out.println("Titel page is not matching with the given text "+Title);
			    
			    driver.findElementByXPath("//input[@value='Create Lead']").click();
			    
			    //Get first name
			    
			    
			    String firstName = driver.findElementById("viewLead_firstName_sp").getText();
			    
			    if(firstName.equals("Nishanthi"))
			    	System.out.println("Duplicate lead is created");
			    else
			    	System.out.println("Duplicate lead is not created");
			    
			    Thread.sleep(2000);
			    
			    driver.close();
	}
}

