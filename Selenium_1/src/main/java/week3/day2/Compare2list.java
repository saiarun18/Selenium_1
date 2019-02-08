package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compare2list {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver =new ChromeDriver();
			
			//load url
			driver.get("https://erail.in/");
			//to maximize browser
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.findElementById("txtStationFrom").clear();
			driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
			driver.findElementById("txtStationTo").clear();
			driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
			
			boolean selected= driver.findElementById("chkSelectDateOnly").isSelected();
			if(selected)
			{
				driver.findElementById("chkSelectDateOnly").click();
			}
			
			
			WebElement trainTable = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		    List<WebElement> rows = trainTable.findElements(By.tagName("tr"));
		    List<WebElement> columns;
		    WebElement firstrow,sortedfirstrow;
		    List<String> trainsList=new ArrayList<String>();
		    List<String> sortedtrainList=new ArrayList<String>();
		    for(int i=0;i<rows.size();i++)
		    {
		    	firstrow = rows.get(i);
		    	
		    	columns=firstrow.findElements(By.tagName("td"));
		    	
		    	String trainName=columns.get(1).getText();
		    	trainsList.add(trainName);
		    	
		    	
		    }
		    
		    //create another list after sorting the train names
		    
		    driver.findElementByXPath("//a[text()='Train Name']").click();
		    Thread.sleep(2000);
		    WebElement sortedtrainTable = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		    List<WebElement> sortedrows = sortedtrainTable.findElements(By.tagName("tr"));
		    List<WebElement> sortedcolumns;
		    for(int i=0;i<sortedrows.size();i++)
		    {
		    	sortedfirstrow = sortedrows.get(i);
		    	
		    	sortedcolumns=sortedfirstrow.findElements(By.tagName("td"));
		    	
		    	String sortedtrainName=sortedcolumns.get(1).getText();
		    	sortedtrainList.add(sortedtrainName);
		    	
		    	
		    }
		    //comparing two lists 
		    
		    boolean equals = trainsList.equals(sortedtrainList);
		    if(equals)
		    	System.out.println("Both the lists are equal");
		    else
		    	System.out.println("Both the lists are not equal");

		}

	
	}


