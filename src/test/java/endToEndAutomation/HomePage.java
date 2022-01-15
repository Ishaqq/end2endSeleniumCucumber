package endToEndAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void setUp() throws IOException {
		driver=initializeDriver();
		log.info("driver initialized");
		
	}
	@Test
	public void validateUsers() throws IOException {
		driver.get(prop.getProperty("url"));
		log.info("Url is looded");
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	
}
