package stepDefinations;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;
import resources.base2;

public class loginQAclick extends base {
	@Given("Initialize the browser with chrome to QA")
	public void initialize_the_browser_with_chrome_to_qa() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}
	@Given("Navigate to {string} site")
	public void navigate_to_site(String string1) {
		// Write code here that turns the phrase above into concrete actions
		driver.get(string1);
	}

	@Given("Click on login link in home page to land on secure sign in Page")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() {
		// Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
	}
	
	@When("^User enter (.+) and (.+) and logs in$")
    public void user_enter_and_and_logs_in(String email, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage lp=new LoginPage(driver);
		lp.getemail().sendKeys(email);
		lp.getpassword().sendKeys(password);
		lp.getsubmit().click();
	}
	
//	@When("User enter {string} and {string} and logs in")
//	public void user_enter_and_and_logs_in(String email, String password) {
//		// Write code here that turns the phrase above into concrete actions
//		LoginPage lp=new LoginPage(driver);
//		lp.getemail().sendKeys(email);
//		lp.getpassword().sendKeys(password);
//		lp.getsubmit().click();
//		
//	}

	@Then("verify that user is succesfully logged in")
	public void verify_that_user_is_succesfully_logged_in() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		
		
		
	}
}
