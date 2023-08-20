package Testframework.testNgProject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

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

public class NewTest2 extends baseclass {

 
 
  
  @Test(priority=1)
 public void fbtestTaxtCase() throws InterruptedException, IOException {
 System.out.print("This is test 1");
 HomePom3 ob = new HomePom3(driver);
ob.getfbText();
 ob.enterEmail("abc@yahoo.com");
 Thread.sleep(5000);
 ob.enterPass("12345");
//shots_withdate();
//Thread.sleep(5000);
 }
  @Test(priority=2)
  public void fbtestTaxtCase2() throws InterruptedException, IOException {
 System.out.print("This is test 1");
 HomePom3 ob = new HomePom3(driver);
 ob.enterEmail("ssabc@yahoo.com");
 ob.getfbText();
  Thread.sleep(5000);
  ob.enterPass("124567");
//  shots_withdate();
//  Thread.sleep(5000);



  }

  }
