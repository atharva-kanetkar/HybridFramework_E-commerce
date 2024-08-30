package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	MyAccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	//Elements 
	@FindBy(xpath="") // account page heading
	WebElement msgHeading;
	
	//Actions 
	
	public boolean isMyAccountPageExist() {
		
		try {
			return (msgHeading.isDisplayed());  //will return true and then we will validate in test case
		}
		catch(Exception e) {
			return false;
		}
		
	}
	
	
	
	 

}
