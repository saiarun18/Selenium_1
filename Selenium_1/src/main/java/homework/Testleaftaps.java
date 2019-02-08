package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testleaftaps {

	ChromeDriver driver;
	
	public void Createlead()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Saicompany1");
		driver.findElementById("createLeadForm_firstName").sendKeys("Arun");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
		driver.findElementByName("submitButton").click();	
	}
		
	public void Duplicatelead()
	{
		
	}
	
	
	
	
	public static void main(String[] args) {
			
			Testleaftaps tp=new Testleaftaps();
			tp.Createlead();
			
	}

}
