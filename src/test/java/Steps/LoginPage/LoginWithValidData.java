package Steps.LoginPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Hook.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.LoginPage;

public class LoginWithValidData {
	
	Hooks hook = new Hooks();
	WebDriver driver = hook.getDriver();
    LoginPage loginPage = new LoginPage(driver);
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    Assert.assertTrue(loginPage.verifyOnLoginPage());
	}

	@When("User input {string} as username {string} as password")
	public void inputCredential(String username, String password) {
		loginPage.setUsername(username);
        loginPage.setPassword(password);
	}

	@And("Click on Login button")
	public void click_on_login_button() {
        loginPage.clickBtnLogin();
	}

	@Then("User is navigate to Home page")
	public void user_is_navigate_to_home_page() {
		 Assert.assertTrue(loginPage.loginIsSuccessful());
	}

}