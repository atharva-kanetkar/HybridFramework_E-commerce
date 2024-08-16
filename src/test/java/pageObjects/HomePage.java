package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	
	
	
	
	
	public HomePage(WebDriver driver) {
		super(driver);	
	}
	
	//Elements
	
	@FindBy(xpath="//li//a[contains(text(),'Register')]")
	WebElement Register_button;  //register button
	
	@FindBy(xpath="//span[contains(text(),'Account')]")
	WebElement MyAccount_button;
	
	
	
	//Action Methods
	public void ClickRegister() {
		Register_button.click();
	}
	
	public void ClickMyAccount() {
		MyAccount_button.click();
	}
	
	
	
	
	

}
