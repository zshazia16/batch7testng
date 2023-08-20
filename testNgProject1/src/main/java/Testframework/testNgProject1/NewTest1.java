package Testframework.testNgProject1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest1 {
public static WebDriver driver; 
@BeforeMethod 
  //@BeforeTest
 public void  beforeTest() throws InterruptedException {
 System.out.println("This is before test,we will open browser here");
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sherm\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe");
 driver = new ChromeDriver();    // Opening chrome broser	  		   
 driver.get("https://amazon.com");
 driver.manage().window().maximize();
 Thread.sleep(5000);  
  }
  @Test
 public void f() throws InterruptedException {  
 System.out.println("This is test1");	 
// WebElement backtoschool = driver.findElement(By.xpath("//*[text()='Back to School']"));
 //backtoschool.click();
 HomePom3 ob = new HomePom3(driver);
 ob.backtoSchoolClick();
 Thread.sleep(5000);  
 // }
//@Test
 //public void f2() throws InterruptedException {  
// System.out.println("This is test2");	 
// WebElement OfftoCollege  = driver.findElement(By.xpath("//*[text()='Off to College']"));
// OfftoCollege.click();  	 
 //HomePom3 ob = new HomePom3(driver);
 //ob.offtoCollegeclick();
 //Thread.sleep(5000);    	  
  }
  @AfterMethod
  //@AfterTest
  public void afterTest() {
  System.out.println("This is after test,we will close browser here");  
 driver.close();
  }

}
