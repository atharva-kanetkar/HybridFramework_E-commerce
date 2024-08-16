package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;
	
	String url = "https://tutorialsninja.com/demo/" ;
	
	@BeforeClass
	public void setup() {
		
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	//Generating random string to pass into email as the website won't allow the same email usage
		//next time
		public String randomString() {
			String generatedString = RandomStringUtils.randomAlphabetic(5);
			return generatedString;
					
		}			
		
		//Generating randomnumber
		public String randomNumber() {
			String generatedNumber = RandomStringUtils.randomNumeric(5);
			return generatedNumber;
					
		}			
		
}
