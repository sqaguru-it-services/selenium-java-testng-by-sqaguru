package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	@Given("Google search page is open")
	public void google_search_page_is_open() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Hello from step def");
	}

	@Given("Google Search bar id displayed")
	public void google_search_bar_id_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Hello from step def");
	}

	@When("I enter testng test search")
	public void i_enter_testng_test_search() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Hello from step def");
	}

	@When("submit the form")
	public void submit_the_form() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Hello from step def");
	}

	@Then("should display google search result page")
	public void should_display_google_search_result_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Hello from step def");
	}
}
