package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC001_AccountRegister extends BaseClass {
	
	
	
	@Test
	public void verify_account_registration() {
		
		//setup and tear down methods available in base class
		
		HomePage hp = new HomePage(driver);
		RegisterPage rp = new RegisterPage(driver);
		
		
		hp.ClickMyAccount();
		hp.ClickRegister();
		//git check
		
		
		//Fill the Register form
		rp.EnterFirstName(randomString().toUpperCase());
		rp.EnterLastName(randomString().toUpperCase());
		rp.EnterEmail(randomString()+"@gmail.com"); //available in base class
		rp.EnterTelephone(randomNumber());
		rp.EnterPassword("abcde");
		rp.EnterPasswordConfirm("abcde");
		rp.tickPrivacyPolicyBox();
		rp.ClickContinueButton();
		
		
		String msg = rp.getConfirmationMessage();
		
		Assert.assertEquals(msg, "Your Account Has Been Created!");
		
		
	}

}
