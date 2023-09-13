package Testframework.testNgProject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTestExpedia {
	public WebDriver driver; 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.out.println("This is before test, we will open browser here");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sherm\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe"); 
	  driver = new ChromeDriver();    // Opening chrome broser
	  driver.get("https://www.expedia.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);  
  }
  @Test
  public void f() throws InterruptedException {
	  System.out.println("This is test1");	
	  WebElement flightTab = driver.findElement(By.xpath("(//*[@class='uitk-tab-text'])[2]"));
      flightTab.click();
      Thread.sleep(5000);
      
      WebElement originInput = driver.findElement(By.xpath("//*[@data-stid='origin_select-menu-trigger']"));
      originInput.sendKeys("New York");
      Thread.sleep(5000);
      WebElement destinationInput = driver.findElement(By.xpath("//*[@data-stid='destination_select-menu-trigger']"));
      destinationInput.sendKeys("Los Angeles");
      Thread.sleep(5000);
   
     WebElement departingDateInput = driver.findElement(By.xpath("//*[@data-stid='uitk-date-selector-input1-default']"));
      departingDateInput.sendKeys("09/20/2023");
     Thread.sleep(5000);
      WebElement returningDateInput = driver.findElement(By.xpath("//*[@data-stid='uitk-date-selector-input1-default']"));
      returningDateInput.sendKeys("09/27/2023");
      Thread.sleep(5000);
      //Step 3: Click on search button
      WebElement searchButton = driver.findElement(By.xpath("//*[@id='search_button']"));
      searchButton.click();
      Thread.sleep(5000);
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test,we will close browser here");
	  driver.close();	  
  }

}
