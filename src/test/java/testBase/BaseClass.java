package testBase;

import java.time.Duration;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.LogManager; //log4j
import org.apache.logging.log4j.Logger; //log4j

public class BaseClass {

	public WebDriver driver;
	public Logger logger;
	
	String url = "https://tutorialsninja.com/demo/" ;
	
	@BeforeClass
	public void setup() {
		
		logger = LogManager.getLogger(this.getClass()); //it will fetch the xml file into logger variabe
		
		
		
		
		
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
