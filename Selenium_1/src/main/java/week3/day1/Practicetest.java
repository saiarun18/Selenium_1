package week3.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practicetest {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
       
        driver.findElementById("userRegistrationForm:userName").sendKeys("aurn567yahoo");
        driver.findElementById("userRegistrationForm:password").sendKeys("arun499");
        driver.findElementById("userRegistrationForm:confpasword").sendKeys("arun499");
        
        WebElement Sec_drop = driver.findElementById("userRegistrationForm:securityQ");
        
        Select sl=new Select(Sec_drop);
        sl.selectByValue("1");
        Thread.sleep(3000);
        
        driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("arun");
        
        WebElement pre_lang=driver.findElementById("userRegistrationForm:prelan");
        
        Select sl1=new Select(pre_lang);
        sl1.selectByValue("en");
        Thread.sleep(3000);
        
        driver.findElementById("userRegistrationForm:firstName").sendKeys("Arun");
        driver.findElementById("userRegistrationForm:middleName").sendKeys("Kumar");
        driver.findElementById("userRegistrationForm:lastName").sendKeys("N");
        
        driver.findElementById("userRegistrationForm:gender:0").click();
        driver.findElementById("userRegistrationForm:maritalStatus:1").click();
        
        WebElement date=driver.findElementById("userRegistrationForm:dobDay");
        Select sl2=new Select(date);
        sl2.selectByIndex(10);
        
        WebElement month=driver.findElementById("userRegistrationForm:dobMonth");
        Select sl3=new Select(month);
        sl3.selectByIndex(1);
        
        WebElement year=driver.findElementById("userRegistrationForm:dateOfBirth");
        Select sl4=new Select(year);
        sl4.selectByValue("1991");
        
        WebElement Occupation=driver.findElementById("userRegistrationForm:occupation");
        Select sl5=new Select(Occupation);
        sl5.selectByVisibleText("Professional");
        
        
        WebElement Country=driver.findElementById("userRegistrationForm:countries");
        Select sl6=new Select(Country);
        
        List<WebElement> countrylist=sl6.getOptions();
        
        for(WebElement countryeach:countrylist)
        {
        	if(countryeach.getText().matches("India"))
        	{
        		sl6.selectByVisibleText(countryeach.getText());
        	}
        }
       
        WebElement Nationality=driver.findElementById("userRegistrationForm:nationalityId");
        
        Select sl7=new Select(Nationality);
        
        List<WebElement> Nationalist=sl7.getOptions();
        
        for(WebElement Nationeach:Nationalist)
        {
        	if(Nationeach.getText().matches("India"))
        	{
        		sl7.selectByVisibleText(Nationeach.getText());
        	}
        }
        
        driver.findElementById("userRegistrationForm:pincode").sendKeys("606001",Keys.TAB);
        Thread.sleep(4000);
        
        WebElement City=driver.findElementById("userRegistrationForm:cityName");
        Select sl8=new Select(City);
        sl8.selectByIndex(1);
        Thread.sleep(3000);
        
        WebElement postoffice=driver.findElementById("userRegistrationForm:postofficeNameo");
        Select sl9=new Select(postoffice);
        sl9.selectByIndex(2);
        
        driver.findElementById("userRegistrationForm:resAndOff:1").click();
      
	}
}
