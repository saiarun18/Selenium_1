package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnalert {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert myalert = driver.switchTo().alert();
	
		myalert.sendKeys("Hi Arun");
		
		myalert.accept();

        driver.findElement(By.xpath("")).getText();
		
		
	}

}
