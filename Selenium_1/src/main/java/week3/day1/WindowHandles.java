package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

//Window handling demo pgm	

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElementByXPath("//span[text()='AGENT LOGIN']").click();
		driver.findElementByXPath("//a[text()='Contact Us']").click();

		Set<String> windowhandles = driver.getWindowHandles();

		List<String> wl= new ArrayList<>();
		wl.addAll(windowhandles);
		driver.switchTo().window(wl.get(1));
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(wl.get(0));
	
		driver.close();
	}
}
