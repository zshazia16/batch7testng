package Testframework.testNgProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homepom {
private static final String HomePOM = null;

public static WebDriver driver;
	
@FindBy (xpath = "//*[@data-quid='main-navigation-order-online']")
WebElement order_online;

@FindBy (xpath = "//*[@id='tab-Delivery']")
WebElement delivery_type;

@FindBy (xpath = "//*[@data-quid='address-type-select']")
WebElement address_type;

@FindBy (xpath = "//*[@data-quid='LocationName']")
WebElement LocationName;

@FindBy (xpath = "//*[@data-quid='Street']")
WebElement Street ;

@FindBy (xpath = "//*[@data-quid='UnitNumber']")
WebElement UnitNumber ;

@FindBy (xpath = "//*[@data-quid='PostalCode']")
WebElement Postalcode ;

@FindBy (xpath = "//*[@data-quid='City']")
WebElement city ;

@FindBy (xpath = "//*[@id='Region']")
WebElement State;


public homepom (WebDriver driver) {
	homepom.driver=driver;
	PageFactory.initElements(driver, this);
}
public void onlineorderClick() {
	order_online.click();
}

public void deliveryfieldClick() {
	delivery_type.click();
}
public void addresstypeClick(String string) {
	Select ob = new Select(address_type);
	 ob.selectByVisibleText("Apartment");
}
public void LocationName(String string) {
 LocationName.sendKeys("The field apartment");
	
}
public void Street(String string) {
 Street.sendKeys("Parcher Av"); 
}
public void UnitNumber(String string) {
		UnitNumber.sendKeys("606"); 
}		
public void PostalcodeClick(String String) {
	Postalcode.clear();
	Postalcode.sendKeys("12345"); 
}
public void City(String String) {
	city.clear();
	 city.sendKeys("Chantilly"); 
}
public void State(String String) {
	Select ob2 = new Select(State);
	ob2.selectByVisibleText("AZ");
	
	
}


}	

	


	





	




	










