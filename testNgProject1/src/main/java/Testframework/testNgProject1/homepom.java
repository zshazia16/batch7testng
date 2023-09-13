package Testframework.testNgProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class homepom {
private static final String HomePOM = null;
public static WebDriver driver;
@FindBy (xpath = "//*[@class='MyAccount__label SimpleFlyout__link--bold'][1]")
WebElement my_account ;
@FindBy (xpath = "(//*[@class='bttn__content'])[3]")
WebElement user_name ;
@FindBy (xpath = "//*[@class='bttn__content'][1]")
WebElement personal_account ;
@FindBy (xpath = "//*[@id='email']") 
WebElement email_address  ;
@FindBy (xpath = "//*[@id='password-input-field']")
WebElement password_field ;
@FindBy (xpath = "//*[@id='zipCode']")
WebElement zip_code;
@FindBy (xpath = "//*[@name='phone']")
WebElement phone_number ;
public homepom (WebDriver driver) {
homepom.driver=driver;
PageFactory.initElements(driver, this);
}
public void my_accountClick() {
my_account.click();
}
public void user_nameClick() {
user_name.click();
}
public void personal_accountClick() {
personal_account.click();
}
public void email_address(String string) {
email_address.sendKeys("abc@yahoo.com"); 
	}
public void password_field  (String string) {
 password_field .sendKeys("12345");
}
 public void zip_code  (String string) {
 zip_code.sendKeys("20171"); 
 }
 public void phone_number(String string) {
 phone_number.sendKeys("20171"); 
 
}	

}


	





	




	










