package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("User enter FB page")
	public void user_enter_FB_page() {
		System.out.println("Facebook page opens");
	}

	@When("User Enter FB valid Username and valid Password and click login button")
	public void user_Enter_FB_valid_Username_and_valid_Password_and_click_login_button() {

		System.out.println("User Enter FB valid Username and valid Password and click login button");
	}

	@Then("User logged into FB account")
	public void user_logged_into_FB_account() {
		System.out.println("User logged into FB account");
	}

	@When("User Enter FB invalid Username and invalid Password and click login button")
	public void user_Enter_FB_invalid_Username_and_invalid_Password_and_click_login_button() {
		System.out.println("User Enter FB invalid Username and invalid Password and click login button");
	}

	@Then("User logged into FB invalid credentials page")
	public void user_logged_into_FB_invalid_credentials_page() {
		System.out.println("User logged into FB invalid credentials page");
	}

	@When("User Enter FB valid Username and invalid Password and click login button")
	public void user_Enter_FB_valid_Username_and_invalid_Password_and_click_login_button() {
		System.out.println("User Enter FB valid Username and invalid Password and click login button");
	}

	@Given("User enter Amazon page")
	public void user_enter_Amazon_page() {
		System.out.println("User enter Amazon page");
	}

	@When("User Enter Amazon valid Username and valid Password and click login button")
	public void user_Enter_Amazon_valid_Username_and_valid_Password_and_click_login_button() {
		System.out.println("User Enter Amazon valid Username and valid Password and click login button");
	}

	@Then("Verify User logged into Amazon account")
	public void verify_User_logged_into_Amazon_account() {
		System.out.println("Verify User logged into Amazon account");
	}

	@When("User Enter Amazon invalid Username and invalid Password and click login button")
	public void user_Enter_Amazon_invalid_Username_and_invalid_Password_and_click_login_button() {
		System.out.println("User Enter Amazon invalid Username and invalid Password and click login button");
	}

	@Then("Verify User logged into Amazon invalid Credentials page")
	public void verify_User_logged_into_Amazon_invalid_Credentials_page() {
		System.out.println("Verify User logged into Amazon invalid Credentials page");
	}

	@When("User Enter Amazon valid Username and invalid Password and click login button")
	public void user_Enter_Amazon_valid_Username_and_invalid_Password_and_click_login_button() {
		System.out.println("User Enter Amazon valid Username and invalid Password and click login button");
	}

}
