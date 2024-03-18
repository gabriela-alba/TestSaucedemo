package Steps.LoginPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Hook.Hooks;
import io.cucumber.java.en.Then;
import pageObjectModel.LoginPage;

public class LoginWithInvalidData {
	
	Hooks hook = new Hooks();
	WebDriver driver = hook.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Then("User get {string} as error message")
    public void verifyUserError(String error) {
        Assert.assertEquals(error, loginPage.loginIsError());
    }

}
