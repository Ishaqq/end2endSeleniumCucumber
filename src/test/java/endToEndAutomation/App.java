package endToEndAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;
import resources.base2;

public class App extends base2 {
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void setUp() throws IOException {
		driver=initializeDriver();
		log.info("driver initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to URL");
	}
	@Test
	public void loadingURL() throws IOException {
		LandingPage l=new LandingPage(driver);
		
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Only url loaded");
		test.log(Status.INFO, "Test fdslkjfldsjlfsdPassed");
		test.log(Status.INFO, "Test fdslkjfldsjlfsdPassed");
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
