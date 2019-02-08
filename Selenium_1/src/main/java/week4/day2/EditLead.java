package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		
		//enter company name
		driver.findElementByName("companyName").sendKeys("ASP Labs");
		//search by lead id
		driver.findElementByName("id").sendKeys("11684");
		
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
	    
	    //Click on first lead id 
	   //System.out.println(columns.get(0).toString());
	   
	   driver.findElementByPartialLinkText(Leadid).click();
	    Thread.sleep(3000);
	    
	  //Verify the title of the page
	    String Title=driver.getTitle();
	    if(Title.contains("View Leads | opentaps CRM"))
	    	System.out.println("Verifed the titel of the page :  "+Title);
	    else
	    	System.out.println("Titel page is not matching with the given text "+Title);
	    
	    
	    //Click on Edit button
	    driver.findElementByXPath("//a[text()='Edit']").click();
	    Thread.sleep(2000);
	    //change the company name
	    WebElement company=driver.findElementByXPath("(//input[@name='companyName'])[2]");
	    company.clear();
	    company.sendKeys("ASP LABS LTD New");
	    
	    
	    Thread.sleep(2000);
	    //Click on update
	    driver.findElementByXPath("//input[@value='Update']").click();
	    Thread.sleep(2000);
	    
	    //Get company name
	    String ChangedCompanyname = driver.findElementById("viewLead_companyName_sp").getText();
	    
	    Thread.sleep(3000);
	    if(ChangedCompanyname.contains("ASP LABS LTD New"))
	    	System.out.println("Company name is updated");
	    else
	    	System.out.println("Company is not updated");
	    driver.close();
	}

}

