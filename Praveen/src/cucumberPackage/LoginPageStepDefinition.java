package cucumberPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefinition {
	LoginPage Lp=new LoginPage();
	@Given("I am the user of fb application")
	public void i_am_the_user_of_fb_appln() throws Throwable{
		Lp.openURL();
	}
	@When("I enter valid username")
	public void i_enter_valid_username() throws Throwable{
		Lp.enterUsername();
	}
	@When("I enter valid password")
	public void i_enter_valid_password() throws Throwable{
		Lp.enterPassword();
	}
	@When("I cloick on Login button")
	public void i_click_on_login() {
		Lp.clickLoginButton();
	}
	
	@Then("I should be able to login")
	public void i_should_be_able_to_login() throws Throwable{
		Lp.verifyLogin();
		
	}

}
