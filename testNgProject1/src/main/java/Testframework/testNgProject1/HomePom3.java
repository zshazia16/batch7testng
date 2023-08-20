package Testframework.testNgProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HomePom3 {
	public static WebDriver driver;
	@FindBy (xpath = "//*[text()='Back to School']")
	WebElement backtoSchool;
	
	@FindBy (xpath = "//*[text()='Off to College']")
	WebElement offtoCollege;
	
	@FindBy (xpath = "//*[contains(text(),'Connect with')]")
	WebElement fbText;
	
	@FindBy (xpath = "//*[@id='email']")
	WebElement fb_EmailField;
	
	@FindBy (xpath = "//*[@id='pass']")
	WebElement fb_PassField;
	
	public HomePom3(WebDriver driver) {
		HomePom3.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	public void backtoSchoolClick(){
	backtoSchool.click();	
	}
	public void offtoCollegeclick(){
		offtoCollege.click();
	}
	public void fb_EmailField(){
		fb_EmailField.sendKeys("abc@yahoo.com");
	}
	public void fb_PassField(){
		fb_PassField.sendKeys("12345");
	}
	
	
public void getfbText() {
String Expected_text = "Connect with friends and the world around you on Facebook.";
String Actual_text = fbText.getText();
//Assert.assertEquals(Actual_text, Expected_text);hard Assert
SoftAssert sa = new SoftAssert();
sa.assertEquals(Actual_text,Expected_text);

System.out.println("This line is after assert");
sa.assertAll();
}
public void enterEmail(String email){
	//fb_EmailField.sendKeys("abc@yahoo.com");
	fb_EmailField.sendKeys(email);    
}
public void enterPass(String pass){
	//fb_PassField.sendKeys("12345");
	fb_PassField.sendKeys(pass);
	
}


	

}
