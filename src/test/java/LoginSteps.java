package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	
	Login login = new Login();
	
	String actionButton;
	
	@Given("^I have entered \"([^\"]*)\" as username and password is \"([^\"]*)\"$")
	public void i_have_entered_as_username_and_password_is(String userName, String userPwd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		throw new PendingException();
	}

	@When("^Click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
		actionButton = arg1;
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^System display message \"([^\"]*)\" on \"([^\"]*)\" page$")
	public void system_display_message_on_page(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^System display message do nothing and clear all date$")
	public void system_display_message_do_nothing_and_clear_all_date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
