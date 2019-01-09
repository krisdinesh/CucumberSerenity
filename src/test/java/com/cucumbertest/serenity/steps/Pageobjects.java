package com.cucumbertest.serenity.steps;

import com.cucumbertest.serenity.pages.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class Pageobjects extends ScenarioSteps {

	Test page;

	@Step
	@Given("^Serenity test case$")
	public void serenity_test_case() {

		page.openAt("https://www.google.com");
	}

	@Step
	@When("^Execute test$")
	public void execute_test() {

	}

	@Step
	@Then("^Execute successfully$")
	public void execute_successfully() {

	}

}
