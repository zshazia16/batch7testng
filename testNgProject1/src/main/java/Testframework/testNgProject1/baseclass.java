package Testframework.testNgProject1;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseclass {
	public  WebDriver driver;
	 @BeforeMethod
	 @Parameters({"brow"})
	 public void beforeMethod(String brow) throws InterruptedException, IOException {
	 System.out.println("This is before test,we will open browser here");
	 String browser=brow;
	// String browser=("chrom");
	 if(browser.contains("Chrom"))
	 {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sherm\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();    // Opening chrome broser
	 }	
	 else if(browser.contains("Firefox"))
	 {
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sherm\\eclipse-workspace\\mavenproject1\\drivers\\geckodriver.exe");
	 driver = new FirefoxDriver();    // Opening firefox broser
	  }
	 else
	 {
	 System.setProperty("webdriver.edge.driver", "C:\\Users\\Sherm\\eclipse-workspace\\mavenproject1\\drivers\\msedgedriver.exe");
	 driver = new EdgeDriver();    // Opening firefox broser
	 } 	  	
	 driver.get("https://facebook.com");
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	
	 }
	 @AfterMethod
	 public void afterMethod() {
	 System.out.println("This is our after test,we will close browser here");
	 driver.close();	  
	 }  
	 public void shots() throws IOException {
	File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(cap, new File("C:\\Users\\Sherm\\eclipse-workspace\\testNgProject1\\pictures\\1.png"));
	 }
	public void shots_withargs(String name) throws IOException {
	File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(cap, new File("C:\\Users\\Sherm\\\\eclipse-workspace\\\\testNgProject1\\\\pictures\\\\\"+name_dt+\".png"));
	}
	public void shots_withdate() throws IOException {
		  Date dt = new Date(1);
		String name_dt=  dt.toString().replace(" ", "_").replace(":", "_");
	File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(cap, new File("C:\\Users\\Sherm\\eclipse-workspace\\testNgProject1\\pictures\\"+name_dt+".png"));
	}
	
	
	
	
}
