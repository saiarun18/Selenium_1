package week3.day1;

import java.util.List;

import org.hamcrest.core.StringStartsWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launchtestleaf {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().window().maximize();
	    
        driver.findElementById("username").sendKeys("DemoSalesManager");
        driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        driver.findElementByLinkText("CRM/SFA").click();
        driver.findElementByLinkText("Create Lead").click();
        
        /*// Create lead in the leaftaps site
        driver.findElementById("createLeadForm_companyName").sendKeys("Aruncomp");
        driver.findElementById("createLeadForm_firstName").sendKeys("Arun");
        driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
        driver.findElementByName("submitButton").click();
        driver.close();*/
	    
        //Different select methods dealing
        
       /* WebElement source=driver.findElementById("createLeadForm_dataSourceId");
        
        Select sl=new Select(source);
        sl.selectByVisibleText("Employee");
        
        
        WebElement mk_campn=driver.findElementById("createLeadForm_marketingCampaignId");
       
        Select sl1=new Select(mk_campn);
        sl1.selectByValue("CATRQ_CARNDRIVER");
	    */
        WebElement Industry=driver.findElementById("createLeadForm_industryEnumId");
       
        Select sl2=new Select(Industry);
        
        List<WebElement> indus_options=  sl2.getOptions();
        
        for(WebElement eachindustry:indus_options)
        {
        	//System.out.println(eachindustry.getText());
        	
        	if(eachindustry.getText().startsWith("I"))
        			{
        		System.out.println(eachindustry.getText());	}
        }
	}
	}
