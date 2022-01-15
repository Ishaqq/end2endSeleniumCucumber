package stepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination2 {
	@Given("Initialize the browser2 with chrome")
	public void initialize_the_browser2_with_chrome() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.print("initializing browser");
	}
	@When("User enters username and password2 and logs in")
	public void user_enters_username_and_password2_and_logs_in() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("initializing browser");
	}
	@Then("Verify that user is succesfully logged2 in")
	public void verify_that_user_is_succesfully_logged2_in() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("initializing browser");
	}
	@Then("close browsers2")
	public void close_browsers() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("initializing browser");
	}

}
