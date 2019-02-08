package week4.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		//Set Property for Chrome browser 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Lanuch chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Enter URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize window 
		driver.manage().window().maximize();
		
		//Enter Username 
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click on Login button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click on CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click on Create Lead
		driver.findElementByLinkText("Create Lead").click();
		
		//Enter CompanyName
		driver.findElementById("createLeadForm_companyName").sendKeys("saicompany2");
		
		//Enter FirstName
		driver.findElementById("createLeadForm_firstName").sendKeys("Arun1");
		
		//Enter LastName
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar1");
		
		//Select "Employee" from source dropdown
		WebElement dropdown = driver.findElementById("createLeadForm_dataSourceId");
		Select sc = new Select(dropdown);
		sc.selectByVisibleText("Employee");
		
		//Select "Car and Driver" from Marketing Campaign dropdown
		WebElement dropdown1 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select sc1 = new Select(dropdown1);
		sc1.selectByValue("CATRQ_CARNDRIVER");
		
		//Enter FirstName (Local)
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Arun1");
		
		//Enter LastName (Local)
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Kumar1");
		
		//Enter Salutation
		driver.findElementById("createLeadForm_personalTitle").sendKeys("adasdd");
		
		//Enter Title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("xyz");
		
		//Enter Department
		driver.findElementById("createLeadForm_departmentName").sendKeys("IT");
		
		//Enter Annual Revenue
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("600000");
		
		//Select INR from pref currency dropdown
		WebElement dropdown2 = driver.findElementById("createLeadForm_currencyUomId");
		Select sc2 = new Select(dropdown2);
		sc2.selectByVisibleText("INR - Indian Rupee");
		
		//Select second value from Industry dropdown
		WebElement dropdown3 = driver.findElementById("createLeadForm_industryEnumId");
		Select sc3 = new Select(dropdown3);
		sc3.selectByIndex(1);
		
		//Enter No of employees
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("40");
		
		//Select value from Ownership dropdown
		WebElement dropdown4 = driver.findElementById("createLeadForm_ownershipEnumId");
		Select sc4 = new Select(dropdown4);
		sc4.selectByValue("OWN_PARTNERSHIP");
		
		//Enter SCI code
		driver.findElementById("createLeadForm_sicCode").sendKeys("20D7");
		
		//Enter Ticker Symbol
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("CNBC");
		
		//Enter Description
		driver.findElementById("createLeadForm_description").sendKeys("TestLeaf");
		
		//Enter Important Note
		driver.findElementById("createLeadForm_importantNote").sendKeys("fdffzzxvzvvvzzv");
		
		//Enter AreaCode 
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("003");
		
		//Enter Phone number 
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8965237413");
		
		//Enter Extension
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("044");
		
		//Enter Person to Ask For
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("nivya");
		
		//Enter E-Mail Address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
		
		//Enter Web Url
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.gmail.com");
		
		//Enter To Name
		driver.findElementById("createLeadForm_generalToName").sendKeys("nandy");
		
		//Enter Attention Name
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("nandy");
		
		//Enter Address Line 1
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("No.40/34,Valluvar Street");
		
		//Enter Address Line 2
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Arumbakkam");
		
		//Enter City
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		
		//Select value from Ownership dropdown
		WebElement dropdown5 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select sc5 = new Select(dropdown5);
		sc5.selectByValue("AL");
		
		//Enter Zip/Postal Code
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600106");
		
		//Enter Zip/Postal Code Extension
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("106");
		
		//Click on Create Lead
		driver.findElementByClassName("smallSubmit").click();
		
		//Close browser
		driver.close();
}
	}

