package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager; //log4j
import org.apache.logging.log4j.Logger; //log4j

public class BaseClass {

	public WebDriver driver;
	public Logger logger;
	public Properties p; // imported from java.utils for loading config file
	
	
	@BeforeClass
	@Parameters({"os", "browser"}) // coming from master.xml and passed into setup method
	public void setup(String os, String browser) throws IOException {
		
		
		
		//Loading config file 
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p = new Properties(); // created object of properties
		p.load(file); //loading file with hel of properties
		
		
		//Logger
		logger = LogManager.getLogger(this.getClass()); //it will fetch the xml file into logger variabe
		
		
		switch (browser.toLowerCase()) 
		{
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;	
		default : System.out.println("Invalid browser name"); return;
		}
		
		//we have passed parameter from master.xml to baseclass above
		
		
		driver.get(p.getProperty("appURL")); // reading value from config property file
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
