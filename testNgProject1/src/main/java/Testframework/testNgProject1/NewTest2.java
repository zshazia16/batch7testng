package Testframework.testNgProject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class NewTest2 extends baseclass {

 // @Test(groups = {"Regression"})
 public void fbtestTaxtCase() throws InterruptedException, IOException {
 System.out.print("This is test 1");

 Properties prop= new Properties();
 FileInputStream fin=new FileInputStream("C:\\Users\\Sherm\\git\\repository1\\testNgProject1\\src\\main\\java\\Testframework\\testNgProject1\\savedvalues.properties");    
 prop.load(fin);

String Emailid=  prop.getProperty("Email");
String passtxt=  prop.getProperty("Pass");

 HomePom3 ob = new HomePom3(driver);
ob.getfbText();
 ob.enterEmail( Emailid);
 Thread.sleep(5000);
 ob.enterPass(passtxt);
 shots_withdate();
 Thread.sleep(5000);
 }
  @Test(groups = {"Smoke"})
  public void fbtestTaxtCase2() throws InterruptedException, IOException {
 System.out.print("This is test 1");
 
 HomePom3 ob = new HomePom3(driver);
 ob.enterEmail("ssabc@yahoo.com");
 ob.getfbText();
  Thread.sleep(5000);
  ob.enterPass("124567");
  shots_withdate();
 Thread.sleep(5000);



  }

}
