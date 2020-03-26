package com.oxfordacademy.stepsdefinition;

import org.openqa.selenium.WebDriver;
import com.oxfordacademy.pageobject.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegisterSteps {
	WebDriver driver;
RegisterPage enter = new RegisterPage(driver);

	@Given("^Launch the Chrome browser$")
	public void launch_the_Chrome_browser() throws Throwable {
		enter.launchBrowser("chrome");
	}

	@Then("^open the Oxford Academy website$")
	public void open_the_Oxford_Academy_website() throws Throwable {
		enter.oxfordHomepage();
	}

	@Then("^register using \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" with vaild and invaild deatils$")
	public void register_using_and_and_with_vaild_and_invaild_deatils(String emailId,String password,String confrimPassword) throws Throwable {
		enter.registerDetails(emailId, password, confrimPassword);
		Thread.sleep(3000);
		enter.exit();
	}

	

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		enter.exit();
	}
}
