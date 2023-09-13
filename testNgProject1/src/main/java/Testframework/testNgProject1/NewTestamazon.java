package Testframework.testNgProject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class NewTestamazon {
	public WebDriver driver;
 
  @BeforeTest
 public void BeforeTest() throws InterruptedException, IOException {
 System.out.println("This is before test, we will open browser here");
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sherm\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe"); 
 driver = new ChromeDriver();    // Opening chrome broser
 driver.get("https://www.amazon.com/");
 driver.manage().window().maximize();
 Thread.sleep(5000);
 //shots();
 shots_withdate();
 
  }  
  @Test
public void f() throws InterruptedException {
	  System.out.println("This is test1");	 
	
	 HomePom3 ob = new HomePom3(driver);
	  ob.search_box.sendKeys("laptop");
	  Thread.sleep(5000);    
	  ob.search_buttonClick();
	  Thread.sleep(5000);    
	  ob.laptopClick();
	  Thread.sleep(5000); 
	// ob.Add_to_CartClick();
	  //Thread.sleep(5000);    
  }
  @AfterTest
  public void afterTest() {
 System.out.println("This is after test,we will close browser here");
 driver.close();
  }
 public void shots() throws IOException {
 File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 FileHandler.copy(cap, new File("C:\\Users\\Sherm\\git\\repository1\\testNgProject1\\pictures\\1.png"));
 }
 public void shots_withargs(String name) throws IOException {
 File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(cap, new File("C:\\Users\\Sherm\\git\\repository1\\testNgProject1\\pictures\\"+name+".png"));
		}
public void shots_withdate() throws IOException {
  Date dt = new Date(1);
 String name_dt=  dt.toString().replace(" ", "_").replace(":", "_");
 File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 FileHandler.copy(cap, new File("C:\\Users\\Sherm\\git\\repository1\\testNgProject1\\pictures\\"+name_dt+".png"));
		}   

	   }
  
	  
  
  


