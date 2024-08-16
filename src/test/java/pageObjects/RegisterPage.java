package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements 
	@FindBy(xpath="//input[@name='firstname']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement Telephone;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='confirm']")
	WebElement PasswordConfirm;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement privacypolicybox;
	
	@FindBy(xpath="//div[@id=\"content\"]/h1")
	WebElement confirmationmsg;
	
	@FindBy(xpath="//input[contains(@value,'Continue')]")
	WebElement ContinueBtn;
	
	//Actions method
	
	public void EnterFirstName(String fname) {
		FirstName.sendKeys(fname);
	}
	
	public void EnterLastName(String lname) {
		LastName.sendKeys(lname);
	}
	
	public void EnterEmail(String email) {
		Email.sendKeys(email);
	}
	
	public void EnterTelephone(String telephone) {
		Telephone.sendKeys(telephone);
	}
	
	public void EnterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void EnterPasswordConfirm(String passConfirm) {
		PasswordConfirm.sendKeys(passConfirm);
	}
	
	public void tickPrivacyPolicyBox() {
		privacypolicybox.click();
	}
	
	public String getConfirmationMessage() {
		try {
			
			return confirmationmsg.getText();
		}
		catch(Exception e){
			e.printStackTrace();
			return e.getMessage();
			
		}
	}
	
	public void ClickContinueButton(){
		ContinueBtn.click();
	}
	
	
	
	
      
}
