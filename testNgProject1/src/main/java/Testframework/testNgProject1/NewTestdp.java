package Testframework.testNgProject1;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class NewTestdp extends baseclass{
  @Test(dataProvider = "dp")
  public void f(String email, String pass) throws InterruptedException {
	 
	  HomePom3 ob = new HomePom3(driver);
	  ob.enterEmail(email);
	  Thread.sleep(5000);
	  ob.enterPass(pass);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"abc@yahoo.com","12345" },
      new Object[] { "ssabc@yahoo.com" ,"124547"},
    };
  }
}
