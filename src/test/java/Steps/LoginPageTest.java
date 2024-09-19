package Steps;

import BaseApiLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest extends BaseClass{
	public static LoginPage loginPage;
	
	
	@Given("user is on login Page")
	public void user_is_on_login_page() {
	   BaseClass.initialization();
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		 loginPage =new LoginPage();
		loginPage.EnterUsernameandPassword(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickonLogin();
	   
	}


}
