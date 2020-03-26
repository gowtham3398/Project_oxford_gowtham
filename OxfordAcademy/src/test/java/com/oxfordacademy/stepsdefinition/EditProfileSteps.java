package com.oxfordacademy.stepsdefinition;

import com.oxfordacademy.pageobject.EditProfilePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditProfileSteps {
EditProfilePage edit = new EditProfilePage();
	@Given("^I launch the chrome$")
	public void i_launch_the_chrome() throws Throwable
	{
	   edit.launchBrowser("chrome");
	}
	@When("^I open the website and logs-in$")
	public void i_open_the_website_and_logs_in() throws Throwable 
	{
        edit.oxfordHomepage();
	}

	@Then("^I open the edit personal details page$")
	public void i_open_the_edit_personal_details_page() throws Throwable
	{
       edit.editProfile();
	}

	@Then("^I edit and personal details and updates$")
	public void i_edit_and_personal_details_and_updates() throws Throwable 
	{
       edit.enterDetails();
	}
	@Then("^I closes the browser$")
	public void i_closes_the_browser() throws Throwable
	{
       edit.close();
	}
}
