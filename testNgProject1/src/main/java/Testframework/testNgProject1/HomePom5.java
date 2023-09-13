package Testframework.testNgProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePom5 {
	public static WebDriver driver;
	
	
	
	
	public HomePom5(WebDriver driver) {
		HomePom3.driver=driver;
		PageFactory.initElements(driver, this);
		
	
	}
}
