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
		
		
		logger.info("****Starting TC001_AccountRegister*****");
		
		try {
			HomePage hp = new HomePage(driver);
			RegisterPage rp = new RegisterPage(driver);
			
			
			hp.ClickMyAccount();
			logger.info("Clicked on MyAccount link");
			
			hp.ClickRegister();
			logger.info("Clicked on Register link");
			
			
			//Fill the Register form
			rp.EnterFirstName(randomString().toUpperCase());
			rp.EnterLastName(randomString().toUpperCase());
			rp.EnterEmail(randomString()+"@gmail.com"); //available in base class
			rp.EnterTelephone(randomNumber());
			rp.EnterPassword("abcde");
			rp.EnterPasswordConfirm("abcde");
			rp.tickPrivacyPolicyBox();
			rp.ClickContinueButton();
			
			logger.info("Provided details in register form successfully");
			
			
			String msg = rp.getConfirmationMessage();
			
			
			if(msg.equals("Your Account Has Been Created!")) {
				Assert.assertTrue(true);
				
			}
			else {
				logger.error("Test failed");
				logger.debug("Debug logs");
				Assert.fail();
				
				
			}
	
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		logger.info("*********Finish*********");
	}

}
