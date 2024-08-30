package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements 
	@FindBy(xpath="//input[contains(@name,'email')]")
	WebElement EmailAdress;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	WebElement Password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement Loginbutton;
	
	//Actions method
	
	public void EnterEmailddress(String email) {
		EmailAdress.sendKeys(email);
		
	}
	
	public void Password(String password) {
		Password.sendKeys(password);
	}
	
	public void Login() {
		Loginbutton.click();
	}
	
	
	
	
	
	
      
}
