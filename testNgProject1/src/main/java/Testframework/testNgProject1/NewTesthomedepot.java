package Testframework.testNgProject1;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class NewTesthomedepot {
	public static WebDriver driver;
  @BeforeTest
 public void beforeTest() throws InterruptedException {
System.out.println("This is before test,we will open browser here");
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sherm\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe");
driver = new ChromeDriver();   // Opening chrome broser
 driver.get("https://homedepot.com");
driver.manage().window().maximize();
Thread.sleep(5000);  
  }
  @Test
  public void f() throws InterruptedException {
	  System.out.print("This is test 1");
	  homepom ob = new homepom(driver);
		ob.my_accountClick();
		Thread.sleep(5000);  
		ob.user_nameClick();
		Thread.sleep(5000);
		ob.personal_accountClick();
		Thread.sleep(5000); 
		ob.email_address("abc@yahoo.com");
		Thread.sleep(5000); 
		ob.password_field("12345");
		Thread.sleep(5000); 
		ob.zip_code("20171");
		Thread.sleep(5000); 
		ob.phone_number("1234567");
		Thread.sleep(5000); 
  }
  @AfterTest
  public void afterTest() {
	System.out.println("This is after test,we close browser here");  
	driver.close();
  }

}
