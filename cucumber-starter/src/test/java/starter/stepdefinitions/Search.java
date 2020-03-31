package starter.stepdefinitions;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;

public class Search {
	WebDriver driver;
	
	@Steps
	HomePage home;
	
    @Given("user is on home page")
	public void user_is_on_home_page() {
	    home.openApplication();
	}

	@When("user enters on search field")
	public void user_enters_on_search_field() {
	    home.enterToSearch();
	}

	@When("user should be able see the search result")
	public void user_should_be_able_see_the_search_result() throws InterruptedException {
	    home.clickOnSearchResult();
	   
	}
	
	@When("user clicks sign in")
	public void user_clicks_sign_in() {
	    home.clickOnSignIn();
	}

	@When("user clicks on create new account")
	public void user_clicks_on_create_new_account() {
	 home.clickOnCreateNewAcc();   
	}

	@When("enter your name")
	public void enter_your_name() {
	    home.enterYourName();
	}

	@When("enter your email")
	public void enter_your_email() {
		home.enterEmail();
	}

	@When("enter your password")
	public void enter_your_password() {
	    home.enterPass();
	}

	@When("re-enter password")
	public void re_enter_password() throws InterruptedException {
	    home.reEnterPass();
	}

	@Then("user should succesfully create account")
	public void user_should_succesfully_create_account() throws InterruptedException {
	    home.clickOnComplete();
	}
	
	

}
