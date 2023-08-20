package Testframework.testNgProject1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTestDominos {
	public static WebDriver driver;
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
System.out.println("This is before test,we will open browser here");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sherm\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe");

driver = new ChromeDriver();    // Opening chrome broser
		    
driver.get("https://dominos.com");
driver.manage().window().maximize();
Thread.sleep(5000);
  }
@Test
  public void orderonline() throws InterruptedException { 
	System.out.print("This is test 1");
	homepom ob = new homepom(driver);
	ob.order_online.click();
	Thread.sleep(5000);
	ob.deliveryfieldClick(); 
	Thread.sleep(5000);
    ob.addresstypeClick("Apartment");
	Thread.sleep(5000);
	ob.LocationName("The field apartment");
	Thread.sleep(5000);  
	ob.Street("Parcher Av");
	Thread.sleep(5000);
	ob.UnitNumber("606");
	Thread.sleep(5000); 
	ob.PostalcodeClick("12345");
	Thread.sleep(5000);  
	 ob.City("Chantilly");
	Thread.sleep(5000);
	ob.State("AZ");
	Thread.sleep(5000);
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("This is our after class,we will close browser here");
	  driver.close();
  }

}
