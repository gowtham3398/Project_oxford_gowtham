package com.oxfordacademy.stepsdefinition;

import com.oxfordacademy.pageobject.CountSubscriptionPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CountSubscriptionSteps {
	CountSubscriptionPage save = new CountSubscriptionPage();
	@Given("^launching the browser$")
	public void launching_the_browser() throws Throwable 
	{
	   save.launchBrowser("chrome");
	}

	@When("^opening the webpage and logs in$")
	public void opening_the_webpage_and_logs_in() throws Throwable
	{
       save.oxfordHomepage();
	}

	@Then("user counts the subscription and prints")
	public void user_searches_a_journal_and_saves() throws Throwable
	{
       save.countSubscription();
	}
	
	@Then("^user closes the webpage$")
	public void user_closes_the_webpage() throws Throwable
	{
	   save.close();
	}
}
