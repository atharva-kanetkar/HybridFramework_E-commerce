package testCases;

import java.io.FileReader;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
  
	@Test
	public void VerifyLogin() {
		
		logger.info("*******Login Test Starting*******");
		
		try {
			HomePage hp = new HomePage(driver); //driver coming from base class since we have extended
			LoginPage lp = new LoginPage(driver);
			
			hp.ClickMyAccount(); // clicking my account
			hp.ClickLogin(); // clicking login 
			
			
		
			
			//Entering Email id and password (in base class we have created fetching mechanism from config file)
			
			lp.EnterEmailddress(p.getProperty("emailaddress")); //passing valid credentials from config file
			lp.Password(p.getProperty("password"));
			lp.Login();
			
			//Myaccount page
			MyAccountPage mp = new MyAccountPage(driver);
			boolean targetPage = mp.isMyAccountPageExist();
			
			Assert.assertEquals(targetPage, true, "Login Failed");
			
		//	Assert.assertTrue(targetPage); // this can also be put instead of above
				
			
			
			
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("****************finished TC002logintest*****************");
		
	}
	
	
}
