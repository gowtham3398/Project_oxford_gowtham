package com.oxfordacademy.stepsdefinition;

import com.oxfordacademy.pageobject.DeleteSavedSearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteSavedSearchSteps {
	DeleteSavedSearchPage delete =new DeleteSavedSearchPage();
	@Given("^The user should launch the chrome browser$")
	public void the_user_should_launch_the_chrome_browser() throws Throwable 
	{
       delete.launchBrowser("chrome");
	}

	@When("^user should open the website and logs in$")
	public void user_should_open_the_website_and_logs_in() throws Throwable 
	{
       delete.oxfordHomepage();
	}

	@Then("^user should open the saved search$")
	public void user_should_open_the_saved_search() throws Throwable 
	{
       delete.searchPage();
	}

	@Then("^user should delete the saved search$")
	public void user_should_delete_the_saved_search() throws Throwable 
	{
       delete.deleteSaved();
	}

	@Then("^user should close the browser$")
	public void user_should_close_the_browser() throws Throwable 
	{
       delete.quit();
	}
}
