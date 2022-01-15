package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DropDownPage;
import resources.base;

public class stepDefination extends base {


	@Given("Initialize the browser with chrome")
	public void initialize_the_browser_with_chrome() throws IOException {
		driver = initializeDriver();
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("default Selected : From 2nd method " + strArg1);
		System.out.println("default Selected : From 2nd method " + strArg2);
		DropDownPage drpD = new DropDownPage(driver);

		Select dropdown = new Select(drpD.getDropDownTest());
		WebElement option = dropdown.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println("default Selected : From 2nd method " + defaultItem);
		
		
		Select val=drpD.getDropDownTest("USD");
		String selectedoption =val.getFirstSelectedOption().getText();
	      System.out.println("Selected element: " + selectedoption);
	}

	@Then("Verify that user is succesfully logged in")
	public void verify_that_user_is_succesfully_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		//System.out.println("default Selected : From 2nd method " + defaultItem);
	}

	@Then("close browsers")
	public void close_browsers() {
		// Write code here that turns the phrase above into concrete actions
		System.out.print("initializing browser");
	}

}
