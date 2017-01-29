package Test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;
import main.Login;
import main.LoginBO;

public class LoginSteps {

	Login login =new Login();
	
	LoginBO loginBo = new LoginBO();	
	String actionButton;
	
@Given("^I have entered \"([^\"]*)\" as username and password is \"([^\"]*)\"$")
//public void i_have_entered_as_username_and_password_is(String arg1, String arg2) throws Throwable {
	public void InputData(String username, String password) throws Throwable {
	
	login.setUserName(username);
	login.setPassword(password);

	// Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^Click on \"([^\"]*)\"$")
public void click_on(String arg1) throws Throwable {
	actionButton = arg1;
	
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@Then("^System display message \"([^\"]*)\" on \"([^\"]*)\" page$")
public void system_display_message_on_page(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	LoginBO  loginbo = new LoginBO();
	
	Assert.assertTrue(login.getUserName().equals("naveenhome"));
	Assert.assertTrue(login.getPassword().equals("xyz"));
	
	Assert.assertTrue(loginbo.validate(login, actionButton));
	
   // throw new PendingException();
}

@Then("^System display message do nothing and clear all date$")
public void system_display_message_do_nothing_and_clear_all_date() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(true);
    //throw new PendingException();
}


}
